package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.*;
import net.sf.json.JSONObject;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class BuildParameterJsonLoaderTest extends JsonBaseTest {
	private BuildParameterJsonLoader toTest = new BuildParameterJsonLoader();

	@Test
	public void testMinimumJson() throws Exception {
		assertExpectation(getJsonObject("classpath:/BuildParameter_min.json"), "com.emarte.regurgitator.core.BuildParameter:['build-param-1',com.emarte.regurgitator.core.ParameterPrototype:['toTest1',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.test.stuff.TestValueBuilder:[],null]");
	}

	@Test
	public void testMaximumJson() throws Exception {
		assertExpectation(getJsonObject("classpath:/BuildParameter_max.json"), "com.emarte.regurgitator.core.BuildParameter:['build-param-2',com.emarte.regurgitator.core.ParameterPrototype:['toTest2',com.emarte.regurgitator.core.NumberType:[],com.emarte.regurgitator.core.ConflictPolicy:LEAVE],'something',com.emarte.regurgitator.test.stuff.TestValueBuilder:[],com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]");
	}

	@Test
	public void testMaximumFlatJson() throws Exception {
		assertExpectation(getJsonObject("classpath:/BuildParameter_maxFlat.json"), "com.emarte.regurgitator.core.BuildParameter:['build-param-2',com.emarte.regurgitator.core.ParameterPrototype:['toTest2',com.emarte.regurgitator.core.NumberType:[],com.emarte.regurgitator.core.ConflictPolicy:LEAVE],'something',com.emarte.regurgitator.test.stuff.TestValueBuilder:[],com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]");
	}

	@Test
	public void testFullLoad() throws Exception {
		ConfigurationFile.loadFile("classpath:/BuildParameter_fullLoad.json");
	}

	private void assertExpectation(JSONObject jsonObject, String expected) throws RegurgitatorException {
		assertEquals(expected, toTest.load(jsonObject, new HashSet<Object>()).toString());
	}

	@Test(expected = RegurgitatorException.class)
	public void testInvalidJsonMissingBuilder() throws Exception {
		toTest.load(getJsonObject("classpath:/BuildParameter_missingBuilder.json"), new HashSet<Object>());
	}

	@Test(expected = RegurgitatorException.class)
	public void testInvalidJsonEmptyBuilder() throws Exception {
		toTest.load(getJsonObject("classpath:/BuildParameter_emptyBuilder.json"), new HashSet<Object>());
	}

	@Test(expected = RegurgitatorException.class)
	public void testInvalidJsonEmptyProcessor() throws Exception {
		toTest.load(getJsonObject("classpath:/BuildParameter_emptyProcessor.json"), new HashSet<Object>());
	}

	@Test(expected = RegurgitatorException.class)
	public void testInvalidJsonMissingBuilderClass() throws Exception {
		toTest.load(getJsonObject("classpath:/BuildParameter_missingBuilderClass.json"), new HashSet<Object>());
	}

	@Test(expected = RegurgitatorException.class)
	public void testInvalidJsonMissingProcessorClass() throws Exception {
		toTest.load(getJsonObject("classpath:/BuildParameter_missingProcessorClass.json"), new HashSet<Object>());
	}
}
