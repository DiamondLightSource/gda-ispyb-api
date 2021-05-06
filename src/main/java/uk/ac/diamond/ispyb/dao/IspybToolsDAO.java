package uk.ac.diamond.ispyb.dao;

import uk.ac.diamond.ispyb.api.IspybToolsApi;
import uk.ac.diamond.ispyb.api.ImageQualityIndicators;
import uk.ac.diamond.ispyb.api.Screening;
import uk.ac.diamond.ispyb.api.DataCollectionMain;
import uk.ac.diamond.ispyb.api.DataCollectionGroup;
import uk.ac.diamond.ispyb.api.Sample;
import uk.ac.diamond.ispyb.api.Container;
import uk.ac.diamond.ispyb.api.Aperture;
import uk.ac.diamond.ispyb.api.Position;
import uk.ac.diamond.ispyb.api.XFEFlourecenceSpectrum;
import uk.ac.diamond.ispyb.api.Crystal;
import uk.ac.diamond.ispyb.api.Protein;
import uk.ac.diamond.ispyb.api.EnergyScan;
import uk.ac.diamond.ispyb.api.GridInfo;
import uk.ac.diamond.ispyb.api.DiffractionPlan;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.Map;
import java.util.HashMap;

public class IspybToolsDAO implements IspybToolsApi {

    private final String SAMPLE_ID = "blSampleId";

    private final TemplateWrapper templateWrapper;
    private final BeanTemplateWrapper beanTemplateWrapper;

    public IspybToolsDAO(TemplateWrapper templateWrapper, BeanTemplateWrapper beanTemplateWrapper){
        this.templateWrapper = templateWrapper;
        this.beanTemplateWrapper = beanTemplateWrapper;
    }

    @Override
    public List<Long> retrieveFluorescenceSpectrumIdsForSample(long sampleId) throws SQLException {
        return templateWrapper.callIspybForList("retrieve_xfe_fluo_spectrum_ids_for_sample", long.class, map(SAMPLE_ID, sampleId));
    }

    @Override
    public  Optional<ImageQualityIndicators> retrieveImageQualityIndicators(long dataCollectionId, long imageNumber) throws SQLException {
        Map<String, Object> map = new HashMap<>();
        map.put("dataCollectionId", dataCollectionId);
        map.put("imageNumber", imageNumber);
        return beanTemplateWrapper.callIspybForBean("retrieve_quality_indicators", ImageQualityIndicators.class, map);
    }

    @Override
    public  List<Screening> retrieveScreeningsForSample(long sampleId) throws SQLException {
        return beanTemplateWrapper.callIspybForListBeans("retrieve_screenings_for_sample", Screening.class, map(SAMPLE_ID, sampleId));
    }

    @Override
    public  List<DataCollectionMain> retrieveDataCollectionsForSample(long sampleId) throws SQLException {
        return beanTemplateWrapper.callIspybForListBeans("retrieve_dcs_for_sample", DataCollectionMain.class, map(SAMPLE_ID, sampleId));
    }

    @Override
    public  Optional<DataCollectionMain> retrieveDataCollection(long dataCollectionId) throws SQLException {
        return beanTemplateWrapper.callIspybForBean("retrieve_dc_main_v2", DataCollectionMain.class, map("dataCollectionId", dataCollectionId));
    }

    @Override
    public  Optional<Sample> retrieveSample(long sampleId) throws SQLException {
        return beanTemplateWrapper.callIspybForBean("retrieve_sample", Sample.class, map(SAMPLE_ID, sampleId));
    }

    @Override
    public  Optional<Container> retrieveContainer(long containerId) throws SQLException {
        return beanTemplateWrapper.callIspybForBean("retrieve_container", Container.class, map("containerId", containerId));
    }

    @Override
    public long insertAperture(Aperture aperture) throws SQLException {
        return beanTemplateWrapper.callIspybForKey("insert_aperture", long.class, aperture, "p_id").get();
    }

    @Override
    public long insertDataCollectionGroup(DataCollectionGroup dataCollectionGroup) throws SQLException {
        return beanTemplateWrapper.callIspybForKey("upsert_dc_group_v3", long.class, dataCollectionGroup, "p_id").get();
    }

    @Override
    public long insertDataCollection(DataCollectionMain dataCollectionMain) throws SQLException {
        return beanTemplateWrapper.callIspybForKey("upsert_dc_main_v3", long.class, dataCollectionMain, "p_id").get();
    }

    @Override
    public long updateSample(Sample sample) throws SQLException {
        return beanTemplateWrapper.callIspybForKey("upsert_sample", long.class, sample, "p_id").get();
    }

    @Override
    public long insertXFEFluorescenceSpectrum(XFEFlourecenceSpectrum xfeFlourecenceSpectrum) throws SQLException {
        return beanTemplateWrapper.callIspybForKey("upsert_xfe_fluo_spectrum", long.class, xfeFlourecenceSpectrum, "p_id").get();
    }

    @Override
    public long insertEnergyScan(EnergyScan energyScan) throws SQLException {
        return beanTemplateWrapper.callIspybForKey("upsert_energy_scan", long.class, energyScan, "p_id").get();
    }

    @Override
    public long insertPosition(Position position) throws SQLException {
        return beanTemplateWrapper.callIspybForKey("update_dc_position", long.class, position, "p_id").get();
    }

    @Override
    public long insertCrystal(Crystal crystal) throws SQLException {
        return beanTemplateWrapper.callIspybForKey("insert_crystal", long.class, crystal, "p_id").get();
    }

    @Override
    @Deprecated
    public long insertProtein(Protein protein) throws SQLException {
        // Possible legacy method.
        return beanTemplateWrapper.callIspybForKey("insert_protein", long.class, protein, "p_id").get();
    }

    @Override
    public long insertDiffractionPlan(DiffractionPlan diffractionPlan) throws SQLException {
        return beanTemplateWrapper.callIspybForKey("insert_dc_plan", long.class, diffractionPlan, "p_id").get();
    }

    @Override
    public long insertGridInfo(GridInfo gridInfo) throws SQLException {
        return beanTemplateWrapper.callIspybForKey("upsert_dc_grid", long.class, gridInfo, "p_id").get();
    }

    private Map<String, Object> map(java.lang.String key, java.lang.Object value) {
        java.util.Map<java.lang.String, java.lang.Object> map = new HashMap<>();
        map.put(key, value);
        return map;
    }
}
