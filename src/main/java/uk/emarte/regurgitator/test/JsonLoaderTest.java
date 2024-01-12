/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import net.sf.json.JSONObject;
import uk.emarte.regurgitator.core.FileUtil;
import uk.emarte.regurgitator.core.JsonLoader;
import uk.emarte.regurgitator.core.RegurgitatorException;

import java.io.IOException;
import java.util.HashSet;

import static net.sf.json.JSONObject.fromObject;
import static org.junit.Assert.assertEquals;
import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.core.FileUtil.streamToString;

public class JsonLoaderTest {
    private final JsonLoader<?> toTest;

    public JsonLoaderTest(JsonLoader<?> toTest) {
        this.toTest = toTest;
    }

    protected String loadFromFile(String filePath) throws RegurgitatorException, IOException {
        return toTest.load(getJsonObject(filePath), new HashSet<>()).toString();
    }

    private JSONObject getJsonObject(String filePath) throws IOException {
        return fromObject(streamToString(FileUtil.getInputStreamForFile(filePath)));
    }

    protected final void assertExpectation(String filePath, String expected) throws RegurgitatorException, IOException {
        assertEquals(expected, loadFromFile(filePath));
    }

    protected final void assertExpectationFullLoad(String filePath, String expected) throws RegurgitatorException {
        assertEquals(expected, loadFile(filePath).toString());
    }
}
