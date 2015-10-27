package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.*;
import net.sf.json.JSONObject;
import org.junit.Test;

import java.util.HashSet;

import static junit.framework.Assert.assertEquals;

public class IndexOfProcessorJsonLoaderTest extends JsonBaseTest {
	private final IndexOfProcessorJsonLoader toTest = new IndexOfProcessorJsonLoader();

	@Test
	public void testSource() throws Exception {
		assertExpectation(getJsonObject("classpath:/IndexOfProcessor_source.json"), "com.emarte.regurgitator.core.IndexOfProcessor:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null,false]");
	}

	@Test
	public void testValue() throws Exception {
		assertExpectation(getJsonObject("classpath:/IndexOfProcessor_value.json"), "com.emarte.regurgitator.core.IndexOfProcessor:[null,'value',false]");
	}

	@Test
	public void testSourceAndValue() throws Exception {
		assertExpectation(getJsonObject("classpath:/IndexOfProcessor_sourceAndValue.json"), "com.emarte.regurgitator.core.IndexOfProcessor:[com.emarte.regurgitator.core.ContextLocation:['context:location'],'value',false]");
	}

	@Test
	public void testFullLoad() throws Exception {
		ConfigurationFile.loadFile("classpath:/IndexOfProcessor_fullLoad.json");
	}

	private void assertExpectation(JSONObject jsonObject, String expected) throws RegurgitatorException {
		assertEquals(expected, toTest.load(jsonObject, new HashSet<Object>()).toString());
	}
}
