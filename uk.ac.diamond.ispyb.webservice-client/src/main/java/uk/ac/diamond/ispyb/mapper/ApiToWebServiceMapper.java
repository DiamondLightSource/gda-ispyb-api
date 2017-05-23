package uk.ac.diamond.ispyb.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import uk.ac.diamond.ispyb.soapclientsample.DataCollectionWS3VO;

public class ApiToWebServiceMapper {
    public DataCollectionWS3VO map(Object input) {
        ModelMapper modelMapper = new ModelMapper();
        Configuration configuration = modelMapper.getConfiguration();
        configuration.setDestinationNameTransformer(
                new StringReplacingNameTransformer(configuration.getDestinationNameTransformer(), this::convertName)
        );

        configuration.setSourceNameTransformer(
                new StringReplacingNameTransformer(configuration.getSourceNameTransformer(), this::convertName)
        );

        return modelMapper.map(input, DataCollectionWS3VO.class);
    }

    private String convertName(String input){
        return input.replace("Image", "Img")
                .replace("Directory", "Dir")
                .replace("NumberOf", "No")
                .replace("Run", "")
                .replace("XtalSnapshotFullPath", "Snapshot");
    }
}

