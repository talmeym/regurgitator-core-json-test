/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.ListProcessorJsonLoader;
import com.emarte.regurgitator.core.RegurgitatorException;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.CoreLoaderTestExpectations.ListProcessor;

public class ListProcessorJsonLoaderTest extends JsonLoaderTest {
    public ListProcessorJsonLoaderTest() {
        super(new ListProcessorJsonLoader());
    }

    @Test
    public void testThis() throws Exception {
        assertExpectation("classpath:/ListProcessor.json", ListProcessor);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/ListProcessor_fullLoad.json");
    }

    @Test(expected = RegurgitatorException.class)
    public void testMissingProcessors() throws RegurgitatorException {
        loadFile("classpath:/ListProcessor_missingProcessors.json");
    }
}
