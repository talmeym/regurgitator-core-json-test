/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.ExtractProcessorJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.CoreLoaderTestExpectations.ExtractProcessor_min;

public class ExtractProcessorJsonLoaderTest extends JsonLoaderTest {
    public ExtractProcessorJsonLoaderTest() {
        super(new ExtractProcessorJsonLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/ExtractProcessor_min.json", ExtractProcessor_min);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/ExtractProcessor_fullLoad.json");
    }
}
