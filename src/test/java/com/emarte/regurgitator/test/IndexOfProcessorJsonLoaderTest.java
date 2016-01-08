package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.IndexOfProcessorJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class IndexOfProcessorJsonLoaderTest extends JsonLoaderTest {
	public IndexOfProcessorJsonLoaderTest() {
		super(new IndexOfProcessorJsonLoader());
	}

	@Test
	public void testSource() throws Exception {
		assertExpectation("classpath:/IndexOfProcessor_source.json", "com.emarte.regurgitator.core.IndexOfProcessor:[com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null],false]");
	}

	@Test
	public void testValue() throws Exception {
		assertExpectation("classpath:/IndexOfProcessor_value.json", "com.emarte.regurgitator.core.IndexOfProcessor:[com.emarte.regurgitator.core.ValueSource:[null,'value'],false]");
	}

	@Test
	public void testSourceAndValue() throws Exception {
		assertExpectation("classpath:/IndexOfProcessor_sourceAndValue.json", "com.emarte.regurgitator.core.IndexOfProcessor:[com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],'value'],false]");
	}

	@Test
	public void testFullLoad() throws Exception {
		loadFile("classpath:/IndexOfProcessor_fullLoad.json");
	}
}
