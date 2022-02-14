package uk.ac.diamond.ispyb.dao;

import uk.ac.diamond.ispyb.api.IspybSpyCatApi;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import uk.ac.diamond.ispyb.api.Session;
import uk.ac.diamond.ispyb.api.SessionPerson;

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
    public Optional<String> retrieveTitleForProposal(String proposalCode, Integer proposalNumber) {
        Map<String, Object> params = new HashMap<>();
        params.put("proposalCode", proposalCode);
        params.put("proposalNumber", proposalNumber);
        return templateWrapper.callIspybFunction("retrieve_proposal_title_v2", String.class, params);
    }

    @Override
    public List<Session> retrieveCurrentSessions(String beamline, Integer toleranceMinutes) {
        Map<String, Object> params = new HashMap<>();
        params.put("beamline", beamline);
        params.put("tolerance_minutes", toleranceMinutes);
        return templateWrapper.callIspybForListBeans("retrieve_current_sessions", Session.class, params);
    }

    @Override
    public List<SessionPerson> retrievePersonsForSession(String proposalCode, Integer proposalNumber, Integer visitNumber) {
        Map<String, Object> params = new HashMap<>();
        params.put("proposal_code", proposalCode);
        params.put("proposal_number", proposalNumber);
        params.put("visit_number", visitNumber);
        return templateWrapper.callIspybForListBeans("retrieve_persons_for_session", SessionPerson.class, params);
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
