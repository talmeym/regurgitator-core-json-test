package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.SizeProcessorJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class SizeProcessorJsonLoaderTest extends JsonLoaderTest {
	public SizeProcessorJsonLoaderTest() {
		super(new SizeProcessorJsonLoader());
	}

	@Test
	public void testJson() throws Exception {
		assertExpectation("classpath:/SizeProcessor.json", "com.emarte.regurgitator.core.SizeProcessor:[false]");
	}

	@Test
	public void testLastIndex() throws Exception {
		assertExpectation("classpath:/SizeProcessor_asIndex.json", "com.emarte.regurgitator.core.SizeProcessor:[true]");
	}

	@Test
	public void testFullLoad() throws Exception {
		loadFile("classpath:/SizeProcessor_fullLoad.json");
	}
}
