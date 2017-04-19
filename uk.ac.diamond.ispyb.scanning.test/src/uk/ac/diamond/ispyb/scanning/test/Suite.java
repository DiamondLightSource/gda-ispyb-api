package uk.ac.diamond.ispyb.scanning.test;


import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(org.junit.runners.Suite.class)
@SuiteClasses({
    BeanSerializationTest.class,
    ExperimentCommunicationServiceTest.class
})
public class Suite {

}
