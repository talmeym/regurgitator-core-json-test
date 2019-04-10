/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.NumberGeneratorJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.CoreLoaderTestExpectations.NumberGenerator;
import static com.emarte.regurgitator.test.CoreLoaderTestExpectations.NumberGenerator_max;

public class NumberGeneratorJsonLoaderTest extends JsonLoaderTest {
    public NumberGeneratorJsonLoaderTest() {
        super(new NumberGeneratorJsonLoader());
    }

    @Test
    public void testThis() throws Exception {
        assertExpectation("classpath:/NumberGenerator.json", NumberGenerator);
    }

    @Test
    public void testMaximum() throws Exception {
        assertExpectation("classpath:/NumberGenerator_max.json", NumberGenerator_max);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/NumberGenerator_fullLoad.json");
    }
}
