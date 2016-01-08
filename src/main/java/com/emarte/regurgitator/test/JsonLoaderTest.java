package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.*;
import net.sf.json.JSONObject;

import java.io.IOException;
import java.util.HashSet;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.core.FileUtil.streamToString;
import static net.sf.json.JSONObject.fromObject;
import static org.junit.Assert.assertEquals;

public class JsonLoaderTest {
	private final JsonLoader toTest;

	public JsonLoaderTest(JsonLoader toTest) {
		this.toTest = toTest;
	}

	protected JSONObject getJsonObject(String filePath) throws IOException {
		return fromObject(streamToString(FileUtil.getInputStreamForFile(filePath)));
	}

	protected String loadFromFile(String filePath) throws RegurgitatorException, IOException {
		return toTest.load(getJsonObject(filePath), new HashSet<Object>()).toString();
	}

	protected final void assertExpectation(String filePath, String expected) throws RegurgitatorException, IOException {
		assertEquals(expected, loadFromFile(filePath));
	}

	protected final void assertExpectationFullLoad(String filePath, String expected) throws RegurgitatorException {
		assertEquals(expected, loadFile(filePath).toString());
	}
}
