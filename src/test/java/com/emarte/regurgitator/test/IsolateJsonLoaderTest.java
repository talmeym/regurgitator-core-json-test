package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.*;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class IsolateJsonLoaderTest extends JsonLoaderTest {
	public IsolateJsonLoaderTest() {
		super(new IsolateJsonLoader());
	}

	@Test
	public void testMin() throws Exception {
		assertExpectation("classpath:/Isolate_min.json", "com.emarte.regurgitator.core.Isolate:['isolate-1',com.emarte.regurgitator.test.stuff.TestStep:['test-step-1'],false,false]");
	}

	@Test
	public void testSession() throws Exception {
		assertExpectation("classpath:/Isolate_session.json", "com.emarte.regurgitator.core.Isolate:['isolate-1',com.emarte.regurgitator.test.stuff.TestStep:['test-step-1'],true,false]");
	}

	@Test
	public void testParameters() throws Exception {
		assertExpectation("classpath:/Isolate_parameters.json", "com.emarte.regurgitator.core.Isolate:['isolate-1',com.emarte.regurgitator.test.stuff.TestStep:['test-step-1'],false,true]");
	}

	@Test
	public void testFullLoadJson() throws RegurgitatorException {
		loadFile("classpath:/Isolate_fullLoad.json");
	}
}
