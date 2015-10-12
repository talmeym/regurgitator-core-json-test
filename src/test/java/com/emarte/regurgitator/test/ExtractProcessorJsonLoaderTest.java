package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.*;
import net.sf.json.JSONObject;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class ExtractProcessorJsonLoaderTest extends JsonBaseTest {
	private ExtractProcessorJsonLoader toTest = new ExtractProcessorJsonLoader();

	@Test
	public void testMinimumJson() throws Exception {
		assertExpectation(getJsonObject("classpath:/ExtractProcessor_min.json"), "com.emarte.regurgitator.core.ExtractProcessor:['this is {0} test',0]");
	}

	@Test
	public void testFullLoadJson() throws Exception {
		ConfigurationFile.loadFile("classpath:/ExtractProcessor_fullLoad.json");
	}

	private void assertExpectation(JSONObject jsonObject, String expected) throws RegurgitatorException {
		assertEquals(expected, toTest.load(jsonObject, new HashSet<Object>()).toString());
	}
}
