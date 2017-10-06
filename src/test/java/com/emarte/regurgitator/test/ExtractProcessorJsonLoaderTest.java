/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.ExtractProcessorJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class ExtractProcessorJsonLoaderTest extends JsonLoaderTest {
    public ExtractProcessorJsonLoaderTest() {
        super(new ExtractProcessorJsonLoader());
    }

    @Test
    public void testMinimumJson() throws Exception {
        assertExpectation("classpath:/ExtractProcessor_min.json", "com.emarte.regurgitator.core.ExtractProcessor:['this is {0} test',0]");
    }

    @Test
    public void testFullLoadJson() throws Exception {
        loadFile("classpath:/ExtractProcessor_fullLoad.json");
    }
}
