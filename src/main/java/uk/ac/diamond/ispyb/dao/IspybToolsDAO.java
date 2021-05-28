package uk.ac.diamond.ispyb.dao;

import uk.ac.diamond.ispyb.api.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.Map;
import java.util.HashMap;

public class IspybToolsDAO implements IspybToolsApi {

    private final TemplateWrapper templateWrapper;
    private final BeanTemplateWrapper beanTemplateWrapper;

    public IspybToolsDAO(TemplateWrapper templateWrapper, BeanTemplateWrapper beanTemplateWrapper){
        this.templateWrapper = templateWrapper;
        this.beanTemplateWrapper = beanTemplateWrapper;
    }

    @Override
    public List<Long> retrieveFluorescenceSpectrumIdsForSample(Long sampleId) throws SQLException {
        return templateWrapper.callIspybForList("retrieve_xfe_fluo_ids_for_sample", Long.class, map("id", sampleId));
    }

    @Override
    public  Optional<ImageQualityIndicators> retrieveImageQualityIndicators(Long dataCollectionId, Long imageNumber) throws SQLException {
        Map<String, Object> map = new HashMap<>();
        map.put("dataCollectionId", dataCollectionId);
        map.put("imageNumber", imageNumber);
        return templateWrapper.callIspybForBean("retrieve_quality_indicators", ImageQualityIndicators.class, map);
    }

    @Override
    public  List<Screening> retrieveScreeningsForSample(Long sampleId) throws SQLException {
        return templateWrapper.callIspybForListBeans("retrieve_screenings_for_sample", Screening.class, map("id", sampleId));
    }

    @Override
    public  List<DataCollectionMain> retrieveDataCollectionsForSample(Long sampleId) throws SQLException {
        return templateWrapper.callIspybForListBeans("retrieve_dcs_for_sample", DataCollectionMain.class, map("id", sampleId));
    }

    @Override
    public  Optional<DataCollection> retrieveDataCollection(Long dataCollectionId, String authLogin) throws SQLException {
        Map<String, Object> params = new HashMap<>();
        params.put("id", dataCollectionId);
        params.put("authLogin", authLogin);
        return templateWrapper.callIspybForBean("retrieve_dc", DataCollection.class, params);
    }

    @Override
    public  Optional<MxSample> retrieveSample(Long sampleId, boolean useContainerSession, String authLogin) throws SQLException {
        Map<String, Object> _map = new HashMap<>();
        _map.put("id", sampleId);
        _map.put("useContainerSession", useContainerSession);
        _map.put("authLogin", authLogin);
        return templateWrapper.callIspybForBean("retrieve_sample", MxSample.class, _map);
    }

    @Override
    public  Optional<Container> retrieveContainer(Long containerId, boolean useContainerSession, String authLogin) throws SQLException {
        Map<String, Object> _map = new HashMap<>();
        _map.put("id", containerId);
        _map.put("useContainerSession", useContainerSession);
        _map.put("authLogin", authLogin);
        return templateWrapper.callIspybForBean("retrieve_container", Container.class, _map);
    }

    @Override
    public Long insertAperture(Aperture aperture) throws SQLException {
        return beanTemplateWrapper.callIspybForKey("insert_aperture", Long.class, aperture, "p_id").get();
    }

    @Override
    public Long insertDataCollectionGroup(DataCollectionGroup dataCollectionGroup) throws SQLException {
        return beanTemplateWrapper.callIspybForKey("upsert_dc_group_v3", Long.class, dataCollectionGroup, "p_id").get();
    }

    @Override
    public Long insertDataCollection(DataCollectionMain dataCollectionMain) throws SQLException {
        return beanTemplateWrapper.callIspybForKey("upsert_dc_main_v3", Long.class, dataCollectionMain, "p_id").get();
    }

    @Override
    public Long updateSample(MxSample mxSample, String authLogin) throws SQLException {
        Map<String, Object> params = new HashMap<>();
        params.put("authLogin", authLogin);
        return beanTemplateWrapper.callIspybForKey("upsert_mx_sample", Long.class, mxSample, params, "p_sampleId").get();
    }

    @Override
    public Long insertXFEFluorescenceSpectrum(XFEFluorescenceSpectrum xfeFlourecenceSpectrum) throws SQLException {
        return beanTemplateWrapper.callIspybForKey("upsert_xfe_fluo_spectrum", Long.class, xfeFlourecenceSpectrum, "p_id").get();
    }

    @Override
    public Long insertEnergyScan(EnergyScan energyScan) throws SQLException {
        return beanTemplateWrapper.callIspybForKey("upsert_energy_scan", Long.class, energyScan, "p_id").get();
    }

    @Override
    public void insertPosition(Position position) throws SQLException {
        beanTemplateWrapper.updateIspyb("update_dc_position", position);
    }

    @Override
    public Long insertCrystal(Crystal crystal) throws SQLException {
        return beanTemplateWrapper.callIspybForKey("insert_crystal", Long.class, crystal, "p_id").get();
    }

    @Override
    public Long insertDiffractionPlan(DiffractionPlan diffractionPlan) throws SQLException {
        return beanTemplateWrapper.callIspybForKey("insert_dc_plan", Long.class, diffractionPlan, "p_id").get();
    }

    @Override
    public Long insertGridInfo(GridInfo gridInfo) throws SQLException {
        return beanTemplateWrapper.callIspybForKey("upsert_dc_grid", Long.class, gridInfo, "p_id").get();
    }

    private Map<String, Object> map(java.lang.String key, java.lang.Object value) {
        java.util.Map<java.lang.String, java.lang.Object> map = new HashMap<>();
        map.put(key, value);
        return map;
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
