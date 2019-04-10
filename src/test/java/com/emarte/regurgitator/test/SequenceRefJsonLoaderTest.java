/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.SequenceRefJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.CoreLoaderTestExpectations.*;

public class SequenceRefJsonLoaderTest extends JsonLoaderTest {
    public SequenceRefJsonLoaderTest() {
        super(new SequenceRefJsonLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/SequenceRef_min.json", SequenceRef_min);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/SequenceRef_fullLoad.json");
    }
}
