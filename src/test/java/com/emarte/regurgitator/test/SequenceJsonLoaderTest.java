package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.*;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class SequenceJsonLoaderTest extends JsonLoaderTest {
	public SequenceJsonLoaderTest() {
		super(new SequenceJsonLoader());
	}

	@Test
	public void testMinimumJson() throws Exception {
		assertExpectation("classpath:/Sequence_min.json", "com.emarte.regurgitator.core.Sequence:['sequence-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1']]]");
	}

	@Test
	public void testMaximumJson() throws Exception {
		assertExpectation("classpath:/Sequence_max.json", "com.emarte.regurgitator.core.Sequence:['sequence-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-2'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-3']]]");
	}

	@Test
	public void testFullLoadJson() throws Exception {
		loadFile("classpath:/Sequence_max.json");
	}

	@Test(expected = RegurgitatorException.class)
	public void testMissingStepJson() throws Exception {
		loadFromFile("classpath:/Sequence_missingStep.json");
	}
}
