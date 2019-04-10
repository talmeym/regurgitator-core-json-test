/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.IndexOfProcessorJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.CoreLoaderTestExpectations.*;

public class IndexOfProcessorJsonLoaderTest extends JsonLoaderTest {
    public IndexOfProcessorJsonLoaderTest() {
        super(new IndexOfProcessorJsonLoader());
    }

    @Test
    public void testValue() throws Exception {
        assertExpectation("classpath:/IndexOfProcessor_value.json", IndexOfProcessor_value);
    }

    @Test
    public void testSource() throws Exception {
        assertExpectation("classpath:/IndexOfProcessor_source.json", IndexOfProcessor_source);
    }

    @Test
    public void testSourceAndValue() throws Exception {
        assertExpectation("classpath:/IndexOfProcessor_sourceAndValue.json", IndexOfProcessor_sourceAndValue);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/IndexOfProcessor_fullLoad.json");
    }
}
