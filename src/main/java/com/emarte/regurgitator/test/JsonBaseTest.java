package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.FileUtil;
import net.sf.json.JSONObject;

import java.io.IOException;

import static com.emarte.regurgitator.core.FileUtil.streamToString;

public class JsonBaseTest {
	protected JSONObject getJsonObject(String filePath) throws IOException {
		return JSONObject.fromObject(streamToString(FileUtil.getInputStreamForFile(filePath)));
	}
}
