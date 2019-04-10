/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.IndexProcessorJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.CoreLoaderTestExpectations.*;

public class IndexProcessorJsonLoaderTest extends JsonLoaderTest {
    public IndexProcessorJsonLoaderTest() {
        super(new IndexProcessorJsonLoader());
    }

    @Test
    public void testValue() throws Exception {
        // reuse IndexOfProcessor files
        assertExpectation("classpath:/IndexOfProcessor_value.json", IndexProcessor_value);
    }

    @Test
    public void testSource() throws Exception {
        // reuse IndexOfProcessor files
        assertExpectation("classpath:/IndexOfProcessor_source.json", IndexProcessor_source);
    }

    @Test
    public void testSourceAndValue() throws Exception {
        // reuse IndexOfProcessor files
        assertExpectation("classpath:/IndexOfProcessor_sourceAndValue.json", IndexProcessor_sourceAndValue);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/IndexProcessor_fullLoad.json");
    }
}
