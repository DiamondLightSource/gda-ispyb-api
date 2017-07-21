package uk.ac.diamond.ispyb.test;

import org.junit.Test;
import uk.ac.diamond.ispyb.dao.MapToBeanFunction;

import java.util.HashMap;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class MapToBeanFunctionTest {
    @Test
    public void testLeavesNullsWhereNothingInMap(){
        MapToBeanFunction<TestBean> function = new MapToBeanFunction<>(TestBean.class);

        TestBean bean = function.apply(new HashMap());

        assertThat(bean.getTestField(), is(nullValue()));
    }

    @Test
    public void testLeavesNullsWhereNullInMap(){
        MapToBeanFunction<TestBean> function = new MapToBeanFunction<>(TestBean.class);

        HashMap map = new HashMap();
        map.put("testField", null);

        TestBean bean = function.apply(map);

        assertThat(bean.getTestField(), is(nullValue()));
    }

    @Test
    public void testSetsValueFromMap(){
        MapToBeanFunction<TestBean> function = new MapToBeanFunction<>(TestBean.class);

        HashMap map = new HashMap();
        map.put("testField", 13);
        TestBean bean = function.apply(map);

        assertThat(bean.getTestField(), is(13));
    }

}
