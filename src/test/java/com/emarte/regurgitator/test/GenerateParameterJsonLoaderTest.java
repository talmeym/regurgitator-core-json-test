package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.*;
import net.sf.json.JSONObject;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class GenerateParameterJsonLoaderTest extends JsonBaseTest {
	private GenerateParameterJsonLoader toTest = new GenerateParameterJsonLoader();

	@Test
	public void testMinimumJson() throws Exception {
		assertExpectation(getJsonObject("classpath:/GenerateParameter_min.json"), "com.emarte.regurgitator.core.GenerateParameter:['generate-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.UuidGenerator:[],null]");
	}

	@Test
	public void testMaximumJson() throws Exception {
		assertExpectation(getJsonObject("classpath:/GenerateParameter_max.json"), "com.emarte.regurgitator.core.GenerateParameter:['generate-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.NumberType:[],com.emarte.regurgitator.core.ConflictPolicy:LEAVE],'context',com.emarte.regurgitator.test.stuff.TestValueGenerator:[],com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]");
	}

	@Test
	public void testMaximumFlatJson() throws Exception {
		assertExpectation(getJsonObject("classpath:/GenerateParameter_max_flat.json"), "com.emarte.regurgitator.core.GenerateParameter:['generate-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.NumberType:[],com.emarte.regurgitator.core.ConflictPolicy:LEAVE],'context',com.emarte.regurgitator.test.stuff.TestValueGenerator:[],com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]");
	}

	@Test
	public void testFullLoadJson() throws Exception {
		ConfigurationFile.loadFile("classpath:/GenerateParameter_fullLoad.json");
	}

	private void assertExpectation(JSONObject jsonObject, String expected) throws RegurgitatorException {
		assertEquals(expected, toTest.load(jsonObject, new HashSet<Object>()).toString());
	}

	@Test(expected = RegurgitatorException.class)
	public void testInvalidJsonEmptyProcessor() throws Exception {
		toTest.load(getJsonObject("classpath:/GenerateParameter_emptyProcessor.json"), new HashSet<Object>());
	}

	@Test(expected = RegurgitatorException.class)
	public void testInvalidJsonMissingProcessorClass() throws Exception {
		toTest.load(getJsonObject("classpath:/GenerateParameter_missingProcessorClass.json"), new HashSet<Object>());
	}
}
