/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.core.SubstituteProcessorJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class SubstituteProcessorJsonLoaderTest extends JsonLoaderTest {
    public SubstituteProcessorJsonLoaderTest() {
        super(new SubstituteProcessorJsonLoader());
    }

    @Test
    public void testMinimumJson() throws Exception {
        assertExpectation("classpath:/SubstituteProcessor_min.json", "com.emarte.regurgitator.core.SubstituteProcessor:['this','that']");
    }

    @Test
    public void testFullLoadJson() throws RegurgitatorException {
        loadFile("classpath:/SubstituteProcessor_fullLoad.json");
    }
}
