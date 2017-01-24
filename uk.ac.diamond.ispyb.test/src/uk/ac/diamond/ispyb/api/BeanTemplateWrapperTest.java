package uk.ac.diamond.ispyb.api;

import org.junit.Test;
import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.Map;

import uk.ac.diamond.ispyb.dao.TemplateWrapper;
import uk.ac.diamond.ispyb.dao.BeanTemplateWrapper;

public class BeanTemplateWrapperTest {
	@Test
	public void testUpdate(){
		TemplateWrapper wrapper = mock(TemplateWrapper.class);
		
		TestBean bean = new TestBean();
		new BeanTemplateWrapper(wrapper, null).updateIspyb("proc", bean);
		
		Map<String, Object> map = new HashMap<>();
		map.put("i", 5);
		map.put("s", "s");
		
		verify(wrapper).updateIspyb("proc", map);
	}
	
	static class TestBean {
		public int getI(){
			return 5;
		}
		public String getS(){
			return "s";
		}
	}
}
