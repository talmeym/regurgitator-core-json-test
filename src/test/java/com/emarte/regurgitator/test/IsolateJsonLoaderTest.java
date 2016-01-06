package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.*;
import net.sf.json.JSONObject;
import org.junit.Test;

import java.util.HashSet;

import static junit.framework.Assert.assertEquals;

public class IsolateJsonLoaderTest extends JsonBaseTest {
	private IsolateJsonLoader toTest = new IsolateJsonLoader();

	@Test
	public void testMin() throws Exception {
		assertExpectation(getJsonObject("classpath:/Isolate_min.json"), "com.emarte.regurgitator.core.Isolate:['isolate-1',com.emarte.regurgitator.test.stuff.TestStep:['test-step-1'],false]");
	}

	@Test
	public void testMax() throws Exception {
		assertExpectation(getJsonObject("classpath:/Isolate_max.json"), "com.emarte.regurgitator.core.Isolate:['isolate-1',com.emarte.regurgitator.test.stuff.TestStep:['test-step-1'],true]");
	}

	private void assertExpectation(JSONObject jsonObject, String expected) throws RegurgitatorException {
		assertEquals(expected, toTest.load(jsonObject, new HashSet<Object>()).toString());
	}
}
