package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.*;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class RecordMessageJsonLoaderTest extends JsonLoaderTest {
	public RecordMessageJsonLoaderTest() {
		super(new RecordMessageJsonLoader());
	}

	@Test
	public void testMin() throws Exception {
		assertExpectation("classpath:/RecordMessage_min.json", "com.emarte.regurgitator.core.RecordMessage:['record-message-1',null]");
	}

	@Test
	public void testFolder() throws Exception {
		assertExpectation("classpath:/RecordMessage_folder.json", "com.emarte.regurgitator.core.RecordMessage:['record-message-1','/folder/folder']");
	}

	@Test
	public void testFullLoadJson() throws Exception {
		loadFile("classpath:/RecordMessage_fullLoad.json");
	}
}
