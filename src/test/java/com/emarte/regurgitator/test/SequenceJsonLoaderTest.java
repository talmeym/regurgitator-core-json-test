package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.*;
import net.sf.json.JSONObject;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class SequenceJsonLoaderTest extends JsonBaseTest {
	private SequenceJsonLoader toTest = new SequenceJsonLoader();

	@Test
	public void testMinimumJson() throws Exception {
		assertExpectation(getJsonObject("classpath:/Sequence_min.json"), "com.emarte.regurgitator.core.Sequence:['sequence-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1']]]");
	}

	@Test
	public void testMaximumJson() throws Exception {
		assertExpectation(getJsonObject("classpath:/Sequence_max.json"), "com.emarte.regurgitator.core.Sequence:['sequence-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-2'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-3']]]");
	}

	@Test
	public void testFullLoadJson() throws Exception {
		ConfigurationFile.loadFile("classpath:/Sequence_max.json");
	}

	private void assertExpectation(JSONObject jsonObject, String expected) throws RegurgitatorException {
		assertEquals(expected, toTest.load(jsonObject, new HashSet<Object>()).toString());
	}

	@Test(expected = RegurgitatorException.class)
	public void testMissingStepJson() throws Exception {
		toTest.load(getJsonObject("classpath:/Sequence_missingStep.json"), new HashSet<Object>());
	}
}
