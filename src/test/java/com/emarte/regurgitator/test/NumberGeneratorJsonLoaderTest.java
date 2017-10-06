/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.NumberGeneratorJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class NumberGeneratorJsonLoaderTest extends JsonLoaderTest {
    public NumberGeneratorJsonLoaderTest() {
        super(new NumberGeneratorJsonLoader());
    }

    @Test
    public void testThis() throws Exception {
        assertExpectation("classpath:/NumberGenerator.json", "com.emarte.regurgitator.core.NumberGenerator:[null]");
    }

    @Test
    public void testMax() throws Exception {
        assertExpectation("classpath:/NumberGenerator_max.json", "com.emarte.regurgitator.core.NumberGenerator:[1234]");
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/NumberGenerator_fullLoad.json");
    }
}
