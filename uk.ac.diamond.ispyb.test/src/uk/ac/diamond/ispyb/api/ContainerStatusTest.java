package uk.ac.diamond.ispyb.api;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContainerStatusTest {
    @Test
    public void testValidParsing(){
        for (ContainerStatus containerStatus: ContainerStatus.values()){
            ContainerStatus parsed = ContainerStatus.convert(containerStatus.getStatus());
            assertThat(parsed, is(containerStatus));
        }
    }


    @Test
    public void testInvalidParsing(){
        ContainerStatus parsed = ContainerStatus.convert("not known");
        assertThat(parsed, is(ContainerStatus.INVALID));
    }
}
