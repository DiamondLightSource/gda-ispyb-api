package uk.ac.diamond.ispyb.dao;

import uk.ac.diamond.ispyb.api.IspybSpyCatApi;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class IspybSpyCatDAO implements IspybSpyCatApi {

    private final TemplateWrapper templateWrapper;
    private final BeanTemplateWrapper beanTemplateWrapper;

    public IspybSpyCatDAO(TemplateWrapper templateWrapper, BeanTemplateWrapper beanTemplateWrapper){
        this.templateWrapper = templateWrapper;
        this.beanTemplateWrapper = beanTemplateWrapper;
    }

    @Override
    public List<String> retrieveVisitsForUser(String beamline, String username, Integer tolerance) {
        Map<String, Object> params = new HashMap<>();
        params.put("beamline", beamline);
        params.put("fed_id", username);
        params.put("tolerance_minutes", tolerance);
        return templateWrapper.callIspybForList("retrieve_current_sessions_for_person", String.class, params);
    }

    @Override
    public Optional<String> retrieveLatestVisitWithPrefix(String beamline, String proposalCode) {
        Map<String, Object> params = new HashMap<>();
        params.put("beamline", beamline);
        params.put("proposal_code", proposalCode);
        return templateWrapper.callIspyb("retrieve_most_recent_session", String.class, params);
    }

    @Override
    public Optional<String> retrieveTitleForVisit(String proposalCode, Integer proposalNumber) {
        Map<String, Object> params = new HashMap<>();
        params.put("proposal_code", proposalCode);
        params.put("proposal_number", proposalNumber);
        return templateWrapper.callIspybFunction("retrieve_proposal_title", String.class, params);
    }

    @Override
    public void close() throws IOException {
        try {
            templateWrapper.closeConnection();
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }
}
