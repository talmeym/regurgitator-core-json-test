package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.IndexProcessorJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class IndexProcessorJsonLoaderTest extends JsonLoaderTest {
	public IndexProcessorJsonLoaderTest() {
		super(new IndexProcessorJsonLoader());
	}

	@Test
	public void testSource() throws Exception {
		assertExpectation("classpath:/IndexOfProcessor_source.json", "com.emarte.regurgitator.core.IndexProcessor:[com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null]]");
	}

	@Test
	public void testValue() throws Exception {
		assertExpectation("classpath:/IndexOfProcessor_value.json", "com.emarte.regurgitator.core.IndexProcessor:[com.emarte.regurgitator.core.ValueSource:[null,'value']]");
	}

	@Test
	public void testSourceAndValue() throws Exception {
		assertExpectation("classpath:/IndexOfProcessor_sourceAndValue.json", "com.emarte.regurgitator.core.IndexProcessor:[com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],'value']]");
	}

	@Test
	public void testFullLoad() throws Exception {
		loadFile("classpath:/IndexProcessor_fullLoad.json");
	}
}
