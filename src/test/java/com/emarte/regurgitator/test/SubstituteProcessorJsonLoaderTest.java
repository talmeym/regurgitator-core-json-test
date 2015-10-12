package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.*;
import net.sf.json.JSONObject;
import org.junit.Test;

import java.util.HashSet;

import static junit.framework.Assert.assertEquals;

public class SubstituteProcessorJsonLoaderTest extends JsonBaseTest {
	private SubstituteProcessorJsonLoader toTest = new SubstituteProcessorJsonLoader();

	@Test
	public void testMinimumJson() throws Exception {
		assertExpectation(getJsonObject("classpath:/SubstituteProcessor_min.json"), "com.emarte.regurgitator.core.SubstituteProcessor:['this','that']");
	}

	@Test
	public void testFullLoadJson() throws RegurgitatorException {
		ConfigurationFile.loadFile("classpath:/SubstituteProcessor_fullLoad.json");
	}

	private void assertExpectation(JSONObject jsonObject, String expected) throws RegurgitatorException {
		assertEquals(expected, toTest.load(jsonObject, new HashSet<Object>()).toString());
	}
}
