package uk.ac.diamond.ispyb.test;

import org.junit.Test;
import uk.ac.diamond.ispyb.api.DataCollectionPlanInfo;
import uk.ac.diamond.ispyb.dao.DataCollectionPlanInfoListExtractor;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Collection;

import static org.mockito.Mockito.*;

import static org.fest.assertions.Assertions.*;

public class DataCollectionPlanInfoListExtractorTest {
    @Test
    public void testOnEmptyResults() throws SQLException {
        DataCollectionPlanInfoListExtractor extractor = new DataCollectionPlanInfoListExtractor();
        ResultSet resultSet = mock(ResultSet.class);
        assertThat(extractor.extractData(resultSet)).isEmpty();
    }

    @Test
    public void testOnSingleResult() throws SQLException {
        DataCollectionPlanInfoListExtractor extractor = new DataCollectionPlanInfoListExtractor();
        ResultSet resultSet = mock(ResultSet.class);
        when(resultSet.next()).thenReturn(true, false);
        when(resultSet.getInt("dcPlanId")).thenReturn(1);
        when(resultSet.getMetaData()).thenReturn(mock(ResultSetMetaData.class));

        Collection<DataCollectionPlanInfo> actual = extractor.extractData(resultSet);
        assertThat(actual).hasSize(1);
    }
}
