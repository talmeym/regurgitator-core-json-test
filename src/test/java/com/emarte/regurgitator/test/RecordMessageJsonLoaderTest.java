/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RecordMessageJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.CoreLoaderTestExpectations.RecordMessage_folder;
import static com.emarte.regurgitator.test.CoreLoaderTestExpectations.RecordMessage_min;

public class RecordMessageJsonLoaderTest extends JsonLoaderTest {
    public RecordMessageJsonLoaderTest() {
        super(new RecordMessageJsonLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/RecordMessage_min.json", RecordMessage_min);
    }

    @Test
    public void testFolder() throws Exception {
        assertExpectation("classpath:/RecordMessage_folder.json", RecordMessage_folder);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/RecordMessage_fullLoad.json");
    }
}
