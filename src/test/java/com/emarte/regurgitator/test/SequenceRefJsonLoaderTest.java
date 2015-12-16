package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.*;
import net.sf.json.JSONObject;
import org.junit.Test;

import java.util.HashSet;

import static junit.framework.Assert.assertEquals;

public class SequenceRefJsonLoaderTest extends JsonBaseTest {
	private SequenceRefJsonLoader toTest = new SequenceRefJsonLoader();

	@Test
	public void testMinimumJson() throws Exception {
		assertExpectation(getJsonObject("classpath:/SequenceRef_min.json"), "com.emarte.regurgitator.core.Sequence:['regurgitator-configuration-1',[com.emarte.regurgitator.core.CreateParameter:['create-param-1',com.emarte.regurgitator.core.ParameterPrototype:['toTest1',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null],null]]]");
	}

	@Test
	public void testFullLoadJson() throws Exception {
		ConfigurationFile.loadFile("classpath:/SequenceRef_fullLoad.json");
	}

	private void assertExpectation(JSONObject jsonObject, String expected) throws RegurgitatorException {
		assertEquals(expected, toTest.load(jsonObject, new HashSet<Object>()).toString());
	}
}
