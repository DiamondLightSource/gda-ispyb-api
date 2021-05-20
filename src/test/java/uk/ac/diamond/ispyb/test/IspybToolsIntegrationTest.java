package uk.ac.diamond.ispyb.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import uk.ac.diamond.ispyb.api.*;
import uk.ac.diamond.ispyb.dao.IspybToolsDaoFactory;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.*;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class IspybToolsIntegrationTest {
    private final static IntegrationTestHelper<IspybToolsApi> helper = new IntegrationTestHelper<>(new IspybToolsDaoFactory());

    @BeforeClass
    public static void connect() throws Exception {
        helper.setUp();
    }

    @AfterClass
    public static void disconnect() throws Exception {
        helper.tearDown();
    }

    @Test
    public void testRetrieveFluorescenceSpectrumIdsForSample() throws SQLException, IOException, InterruptedException {
        List<Long> fluoIds = helper.execute(api -> api.retrieveFluorescenceSpectrumIdsForSample(374695L));
        List<Long> expected = Arrays.asList(1805L, 1806L, 1807L, 1808L, 1809L, 1810L, 1811L, 1812L, 1832L, 1833L, 1834L);

        assertThat(fluoIds, is(equalTo(expected)));
    }

    @Test
    public void testRetrieveImageQualityIndicators() throws SQLException, IOException, InterruptedException {
        ImageQualityIndicators iqi = helper.execute(api -> api.retrieveImageQualityIndicators(1052494L, 1L)).get();

        ImageQualityIndicators expected = new ImageQualityIndicators();
        expected.setDataCollectionId(1052494L);
        expected.setImageNumber(1L);
        expected.setSpotTotal(296L);
        expected.setInResTotal(296L);
        expected.setGoodBraggCandidates(259L);
        expected.setIceRings(0L);
        expected.setMethod1Res(2.0299999713897705);
        expected.setMethod2Res(2.0299999713897705);
        expected.setMaxUnitCell(0.0);
        expected.setPctSaturationTop50Peaks(0.0);
        expected.setInResolutionOvrlSpots(0L);
        expected.setBinPopCutOffMethod2Res(0L);
        expected.setTotalIntegratedSignal(2.61);

        assertThat(iqi, is(equalTo(expected)));
    }

    private Screening getScreeningWithId(Long screeningId, List<Screening> screeningList){
        for (Screening s : screeningList) {
            if (s.getScreeningId().equals(screeningId)) {
                return s;
            }
        }
        return null;
    }

    @Test
    public void testRetrieveScreeningsForSample() throws SQLException, IOException, InterruptedException {
        List<Screening> screenings = helper.execute(api -> api.retrieveScreeningsForSample(398810L));

        Screening expected1 = new Screening();
        expected1.setScreeningId(1927968L);
        expected1.setDataCollectionId(1066786L);
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        c.set(2016, 9, 26, 8, 50, 31);
        c.clear(Calendar.MILLISECOND);
        Date d = c.getTime();
        expected1.setBltimeStamp(new Timestamp(d.getTime()));
        expected1.setProgramVersion("mosflm");
        expected1.setShortComments("Mosflm native");
        expected1.setDataCollectionGroupId(1054243L);

        Screening expected2 = new Screening();
        expected2.setScreeningId(1927987L);
        expected2.setDataCollectionId(1066786L);
        expected2.setBltimeStamp(new Timestamp(d.getTime()));
        expected2.setProgramVersion("EDNA MXv1");
        expected2.setComments("Standard Anomalous Dataset Multiplicity=3 I/sig=2 Maxlifespan=4034 s");
        expected2.setShortComments("EDNAStrategy2");
        expected2.setDataCollectionGroupId(1054243L);

        assertThat(getScreeningWithId(1927968L, screenings), is(equalTo(expected1)));
        assertThat(getScreeningWithId(1927987L, screenings), is(equalTo(expected2)));
    }

    private DataCollectionMain getDataCollectionWithId(Long dataCollectionID, List<DataCollectionMain> dataCollectionList) {
        for (DataCollectionMain dc : dataCollectionList) {
            if (dc.getId() == null) { continue; }
            if (dc.getId().equals(dataCollectionID)) {
                return dc;
            }
        }
        return null;
    }

    @Test
    public void testRetrieveDataCollectionsForSample() throws SQLException, IOException, InterruptedException {
        List<DataCollectionMain> dataCollectionList = helper.execute(api -> api.retrieveDataCollectionsForSample(374695L));
        assertThat(dataCollectionList.isEmpty(), is(not(true)));

        DataCollectionMain expected1 = new DataCollectionMain();
        expected1.setId(993677L);
        expected1.setGroupId(988855L);
        expected1.setDcNumber(1);
        expected1.setStatus("DataCollection Successful");
        expected1.setStartTime(Timestamp.valueOf("2016-01-14 12:40:34"));
        expected1.setEndTime(Timestamp.valueOf("2016-01-14 12:41:54"));
        expected1.setNoImages(3600);
        expected1.setStartImgNumber(1);
        expected1.setNoPasses(1);
        expected1.setImgDir("/dls/i03/data/2016/cm14451-1/20160114/tlys_jan_4/");
        expected1.setImgPrefix("tlys_jan_4");
        expected1.setImgSuffix("cbf");
        expected1.setFileTemplate("tlys_jan_4_1_####.cbf");
        expected1.setSnapshot1("/dls/i03/data/2016/cm14451-1/jpegs/20160114/tlys_jan_4/tlys_jan_4_1_1_315.0.png");
        expected1.setSnapshot2("/dls/i03/data/2016/cm14451-1/jpegs/20160114/tlys_jan_4/tlys_jan_4_1_1_225.0.png");
        expected1.setSnapshot3("/dls/i03/data/2016/cm14451-1/jpegs/20160114/tlys_jan_4/tlys_jan_4_1_1_135.0.png");
        expected1.setSnapshot4("/dls/i03/data/2016/cm14451-1/jpegs/20160114/tlys_jan_4/tlys_jan_4_1_1_45.0.png");
        expected1.setComments("(-402,345,142) EDNAStrategy4: subWedge:1Aperture: Medium");

        DataCollectionMain expected2 = new DataCollectionMain();
        expected2.setId(6017405L);
        expected2.setGroupId(5440739L);
        expected2.setDetectorId(78L);
        expected2.setDcNumber(1);
        expected2.setStatus("DataCollection Successful");
        expected2.setStartTime(Timestamp.valueOf("2021-02-25 10:15:06"));
        expected2.setEndTime(Timestamp.valueOf("2021-02-25 10:15:47"));
        expected2.setNoImages(480);
        expected2.setStartImgNumber(1);
        expected2.setNoPasses(1);
        expected2.setImgDir("/dls/i03/data/2021/cm28170-1/xraycentring/screening/TestLysozyme/Lys_6/");
        expected2.setImgPrefix("Lys_6");
        expected2.setImgSuffix("h5");
        expected2.setFileTemplate("Lys_6_1_master.h5");
        expected2.setSnapshot1("/dls/i03/data/2021/cm28170-1/jpegs/xraycentring/screening/TestLysozyme/Lys_6/Lys_6_1_210.0.png");
        expected2.setSnapshot2("/dls/i03/data/2021/cm28170-1/jpegs/xraycentring/screening/TestLysozyme/Lys_6/Lys_6_1_210.0.png");
        expected2.setSnapshot3("/dls/i03/data/2021/cm28170-1/jpegs/xraycentring/screening/TestLysozyme/Lys_6/Lys_6_1_210.0.png");
        expected2.setComments("Xray centring - Diffraction grid scan of 30 by 16 images, Top left [304,229], Bottom right [1024,599]");

        assertThat(getDataCollectionWithId(993677L, dataCollectionList), is(equalTo(expected1)));
        assertThat(getDataCollectionWithId(6017405L, dataCollectionList), is(equalTo(expected2)));
    }

    @Test
    public void testRetrieveDataCollection() throws SQLException, IOException, InterruptedException {
        DataCollection dataCollection = helper.execute(api -> api.retrieveDataCollection(1052494L, null)).get();
        //dataCollection.setId(1052494L); //Cannot currently get id out of db

        DataCollection expected = new DataCollection();
        expected.setId(1052494L);
        expected.setGroupId(1040398L);
        expected.setDcNumber(1L);
        expected.setStartTime(Timestamp.valueOf("2016-04-13 12:18:12"));
        expected.setEndTime(Timestamp.valueOf("2016-04-13 12:18:50"));
        expected.setStatus("DataCollection Successful");
        expected.setAxisStart(0.0);
        expected.setAxisEnd(0.4000000059604645);
        expected.setAxisRange(0.4000000059604645);
        expected.setOverlap(-89.5999984741211);
        expected.setNoImages(2L);
        expected.setStartImgNumber(1L);
        expected.setNoPasses(1L);
        expected.setExposureTime(0.009999999776482582);
        expected.setImgDir("/dls/i03/data/2016/cm14451-2/20160413/test_xtal/");
        expected.setImgPrefix("xtal1");
        expected.setImgSuffix("cbf");
        expected.setFileTemplate("xtal1_1_####.cbf");
        expected.setWavelength(0.9762539863586426);
        expected.setResolution(1.2436200380325317);
        expected.setDetectorDistance(200.0);
        expected.setxBeam(214.3300018310547);
        expected.setyBeam(208.7100067138672);
        expected.setPrintableForReport(true);
        expected.setSlitGapVertical(0.05991800129413605);
        expected.setSlitGapHorizontal(0.09993699938058853);
        expected.setTransmission(100.0);
        expected.setSynchrotronMode("User");
        expected.setRotationAxis("Omega");
        expected.setOmegaStart(0.0);
        expected.setBeamSizeAtSampleX(0.07999999821186066);
        expected.setBeamSizeAtSampleY(0.019999999552965164);
        expected.setPositionId(647536L);
        expected.setFocalSpotSizeAtSampleX(80.0);
        expected.setFocalSpotSizeAtSampleY(20.0);
        expected.setApertureId(3752L);
        expected.setFlux(1959830505829.428D);
        expected.setUndulatorGap1(5.300950050354004);
        expected.setSnapshot1("/dls/i03/data/2016/cm14451-2/jpegs/20160413/test_xtal/xtal1_1_1_90.0.png");
        expected.setSnapshot2("/dls/i03/data/2016/cm14451-2/jpegs/20160413/test_xtal/xtal1_1_1_0.0.png");
        expected.setComments("(-703,-47,-74) Aperture: Large");

        assertThat(dataCollection, is(equalTo(expected)));
    }

    @Test
    public void testRetrieveSample() throws SQLException, IOException, InterruptedException {
        MxSample sample = helper.execute(api -> api.retrieveSample(11550L, false, null)).get();

        MxSample expected = new MxSample();
        expected.setSampleId(11550L);
        expected.setContainerId(1326L);
        expected.setCrystalId(3918L);
        expected.setSampleName("Sample-001");
        expected.setSampleCode("SAM-011550");
        expected.setSampleLocation("1");
        expected.setProposalId(141666L);
        expected.setProposalCode("cm");
        expected.setProposalNumber("1");

        assertThat(sample, is(equalTo(expected)));
    }

    @Test
    public void testRetrieveContainer() throws SQLException, IOException, InterruptedException {
        Container container = helper.execute(api -> api.retrieveContainer(1335L, false, null)).get();

        Container expected = new Container();
        expected.setContainerId(1335L);
        expected.setDewarId(579L);
        expected.setCode("Container-4-cm0001-2");
        expected.setContainerType("Puck-16");
        expected.setCapacity(16L);
        expected.setSampleChangerLocation("6");
        expected.setContainerStatus("processing");
        expected.setBeamlineLocation("i03");
        expected.setBarcode("container-cm0001-2-0001335");
        expected.setRequestedReturn(0);
        expected.setProposalCode(container.getProposalCode());
        expected.setProposalNumber(container.getProposalNumber());

        assertThat(container, is(equalTo(expected)));
    }

    @Test
    public void testInsertAperture() throws SQLException, IOException, InterruptedException {
        Aperture aperture = new Aperture();
        aperture.setApertureId(2L);
        aperture.setSizeX(3.55);
        helper.execute(api -> api.insertAperture(aperture));
    }

    @Test
    public void testInsertDataCollectionGroup() throws SQLException, IOException, InterruptedException {
        DataCollectionGroup dataCollectionGroup = new DataCollectionGroup();
        dataCollectionGroup.setId(999999L);
        dataCollectionGroup.setSessionId(55168L);
        helper.execute(api -> api.insertDataCollectionGroup(dataCollectionGroup));
    }

    @Test
    public void testInsertDataCollection() throws SQLException, IOException, InterruptedException {
        DataCollectionMain dataCollectionMain = new DataCollectionMain();
        dataCollectionMain.setId(999999L);
        dataCollectionMain.setGroupId(1040407L);
        dataCollectionMain.setComments("testing insert data collection");
        helper.execute(api -> api.insertDataCollection(dataCollectionMain));
    }

    @Test
    public void testUpdateSample() throws SQLException, IOException, InterruptedException {
        // where does this come from, I don't think I wrote this sproc.

    }

    @Test
    public void testInsertXFEFluorescenceSpectrum() throws SQLException, IOException, InterruptedException {
        XFEFluorescenceSpectrum xfeFlourecenceSpectrum = new XFEFluorescenceSpectrum();
        xfeFlourecenceSpectrum.setId(9999L);
        xfeFlourecenceSpectrum.setSessionId(339528L);
        xfeFlourecenceSpectrum.setSampleId(11577L);
        xfeFlourecenceSpectrum.setSubSampleId(2L);
        xfeFlourecenceSpectrum.setComments("testing insert xfe fluorescence spectrum");
        helper.execute(api -> api.insertXFEFluorescenceSpectrum(xfeFlourecenceSpectrum));
    }

    @Test
    public void testInsertEnergyScan() throws SQLException, IOException, InterruptedException {
        EnergyScan energyScan = new EnergyScan();
        energyScan.setId(99999L);
        energyScan.setSampleId(11556L);
        energyScan.setSubSampleId(5L);
        energyScan.setSessionId(55168L);
        helper.execute(api -> api.insertEnergyScan(energyScan));
    }

    @Test
    public void testInsertPosition() throws SQLException, IOException, InterruptedException {
        Position position = new Position();
        position.setDCId(1002287L);
        position.setPosX(3.0);
        position.setPosY(3.2);
        position.setPosZ(3.4);
        helper.run(api -> api.insertPosition(position));
    }

    @Test
    public void testInsertCrystal() throws SQLException, IOException, InterruptedException {
        Crystal crystal = new Crystal();
        crystal.setProteinId(4404L);
        crystal.setRecordTimeStamp(new Timestamp(System.currentTimeMillis()));
        crystal.setComments("testing insert crystal");
    }

    @Test
    public void testInsertDiffractionPlan() throws SQLException, IOException, InterruptedException {
        DiffractionPlan diffractionPlan = new DiffractionPlan();
        diffractionPlan.setDiffractionPlanId(1L);
        diffractionPlan.setExperimentKind(ExperimentKind.DEFAULT);
        diffractionPlan.setComments("testing diffraction plan insert");
        helper.execute(api -> api.insertDiffractionPlan(diffractionPlan));
    }

    @Test
    public void testInsertGridInfo() throws SQLException, IOException, InterruptedException {
        GridInfo gridInfo = new GridInfo();
        gridInfo.setDcId(1002287L);
        gridInfo.setDataCollectionGroupId(1040407L);
        //gridInfo.setWorkflowMeshId(null);
        gridInfo.setxOffset(9.99);
        gridInfo.setyOffset(9.99);
        gridInfo.setSnaked(1);
        helper.execute(api -> api.insertGridInfo(gridInfo));
    }
}
