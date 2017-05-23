package uk.ac.diamond.ispyb.mapper;

import org.junit.Test;
import uk.ac.diamond.ispyb.api.DataCollectionExperiment;
import uk.ac.diamond.ispyb.api.DataCollectionMachine;
import uk.ac.diamond.ispyb.api.DataCollectionMain;
import uk.ac.diamond.ispyb.mapper.ApiToWebServiceMapper;
import uk.ac.diamond.ispyb.soapclientsample.DataCollection3VO;
import uk.ac.diamond.ispyb.soapclientsample.DataCollectionWS3VO;

import javax.xml.datatype.DatatypeConfigurationException;

import java.sql.Timestamp;
import java.time.LocalDate;

import static org.fest.assertions.Assertions.*;

public class ApiToWebserviceMapperTest {

    @Test
    public void mapsDataCollectionsToWebserviceDataCollections() throws DatatypeConfigurationException {
        DataCollectionMain input = new DataCollectionMain();

        input.setId(1L);
        input.setGroupId(2L);
        input.setDetectorId(3);
        input.setDcNumber(4);
        input.setStartTime(Timestamp.valueOf(LocalDate.of(2017, 3, 12).atStartOfDay()));
        input.setEndTime(Timestamp.valueOf(LocalDate.of(2018, 4, 11).atStartOfDay()));
        input.setStatus("running");
        input.setNoImages(5);
        input.setStartImgNumber(20);
        input.setNoPasses(10);
        input.setImgDir("/things");
        input.setImgPrefix("pre_");
        input.setImgSuffix(".suff");
        input.setFileTemplate("template.file");
        input.setSnapshot1("img1");
        input.setSnapshot2("img2");
        input.setSnapshot3("img3");
        input.setSnapshot4("img4");
        input.setComments("comment");

        DataCollectionWS3VO output = new ApiToWebServiceMapper().map(input, DataCollectionWS3VO.class);

        assertThat(output.getDataCollectionId()).isEqualTo(1);
        assertThat(output.getDataCollectionGroupId()).isEqualTo(2);
        assertThat(output.getDetectorId()).isEqualTo(3);
        assertThat(output.getDataCollectionNumber()).isEqualTo(4);

        assertThat(output.getRunStatus()).isEqualTo("running");
        assertThat(output.getNumberOfImages()).isEqualTo(5);
        assertThat(output.getStartImageNumber()).isEqualTo(20);
        assertThat(output.getNumberOfPasses()).isEqualTo(10);
        assertThat(output.getImageDirectory()).isEqualTo("/things");
        assertThat(output.getImagePrefix()).isEqualTo("pre_");
        assertThat(output.getImageSuffix()).isEqualTo(".suff");
        assertThat(output.getFileTemplate()).isEqualTo("template.file");
        assertThat(output.getXtalSnapshotFullPath1()).isEqualTo("img1");
        assertThat(output.getXtalSnapshotFullPath2()).isEqualTo("img2");
        assertThat(output.getXtalSnapshotFullPath3()).isEqualTo("img3");
        assertThat(output.getXtalSnapshotFullPath4()).isEqualTo("img4");
        assertThat(output.getComments()).isEqualTo("comment");

        assertThat(output.getStartTime().getYear()).isEqualTo(2017);
        assertThat(output.getEndTime().getYear()).isEqualTo(2018);
    }

    @Test
    public void mapsDataCollectionsToWebserviceDataCollectionExperiments() throws DatatypeConfigurationException {
        DataCollectionExperiment experiment = new DataCollectionExperiment();

        experiment.setId(1L);
        experiment.setSlitGapVertical(2f);
        experiment.setSlitGapHorizontal(3f);
        experiment.setTransmission(4f);
        experiment.setExposureTime(5f);
        experiment.setXBeam(6f);
        experiment.setYBeam(7f);
        experiment.setAxisStart(8f);
        experiment.setAxisEnd(9f);
        experiment.setAxisRange(10f);
        experiment.setOverlap(11f);
        experiment.setFlux(12.0);
        experiment.setFluxEnd(13.0);
        experiment.setRotationAxis("axis");
        experiment.setPhiStart(14f);
        experiment.setKappaStart(15f);
        experiment.setOmegaStart(16f);
        experiment.setWavelength(17f);
        experiment.setResolution(18f);
        experiment.setDetectorDistance(19f);
        experiment.setBestWilsonPlotPath("best");
        experiment.setBeamSizeAtSampleX(20f);
        experiment.setBeamSizeAtSampleY(21f);
        experiment.setFocalSpotSizeAtSampleX(22f);
        experiment.setFocalSpotSizeAtSampleY(23f);
        experiment.setApertureSizeX(24f);

        DataCollectionWS3VO output = new ApiToWebServiceMapper().map(experiment, DataCollectionWS3VO.class);

        assertThat(output.getDataCollectionId()).isEqualTo(1);
        assertThat(output.getSlitGapVertical()).isEqualTo(2f);
        assertThat(output.getSlitGapHorizontal()).isEqualTo(3f);
        assertThat(output.getTransmission()).isEqualTo(4f);
        assertThat(output.getExposureTime()).isEqualTo(5f);
        assertThat(output.getXbeam()).isEqualTo(6f);
        assertThat(output.getYbeam()).isEqualTo(7f);
        assertThat(output.getAxisStart()).isEqualTo(8f);
        assertThat(output.getAxisEnd()).isEqualTo(9f);
        assertThat(output.getAxisRange()).isEqualTo(10f);
        assertThat(output.getOverlap()).isEqualTo(11f);
        assertThat(output.getFlux()).isEqualTo(12.0);
        assertThat(output.getFluxEnd()).isEqualTo(13.0);
        assertThat(output.getRotationAxis()).isEqualTo("axis");
        assertThat(output.getPhiStart()).isEqualTo(14f);
        assertThat(output.getKappaStart()).isEqualTo(15f);
        assertThat(output.getOmegaStart()).isEqualTo(16f);
        assertThat(output.getWavelength()).isEqualTo(17f);
        assertThat(output.getResolution()).isEqualTo(18f);
        assertThat(output.getDetectorDistance()).isEqualTo(19f);
        assertThat(output.getBestWilsonPlotPath()).isEqualTo("best");
        assertThat(output.getBeamSizeAtSampleX()).isEqualTo(20f);
        assertThat(output.getBeamSizeAtSampleY()).isEqualTo(21f);

        /** note three missing:
         experiment.setFocalSpotSizeAtSampleX(22f);
         experiment.setFocalSpotSizeAtSampleY(23f);
         experiment.setApertureSizeX(24f);
         */
    }

    @Test
    public void mapsDataCollectionsToWebserviceDataCollectionMachine() throws DatatypeConfigurationException {
        DataCollectionMachine machine = new DataCollectionMachine();
        machine.setId(1L);
        machine.setSynchrotronMode("awesome");
        machine.setUndulatorGap1(2f);
        machine.setUndulatorGap2(3f);
        machine.setUndulatorGap3(4f);

        DataCollectionWS3VO output = new ApiToWebServiceMapper().map(machine, DataCollectionWS3VO.class);

        assertThat(output.getDataCollectionId()).isEqualTo(1);
        assertThat(output.getSynchrotronMode()).isEqualTo("awesome");
        assertThat(output.getUndulatorGap1()).isEqualTo((2f));
        assertThat(output.getUndulatorGap2()).isEqualTo((3f));
        assertThat(output.getUndulatorGap3()).isEqualTo((4f));
    }
}
