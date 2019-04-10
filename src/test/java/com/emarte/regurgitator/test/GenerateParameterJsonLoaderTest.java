/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.GenerateParameterJsonLoader;
import com.emarte.regurgitator.core.RegurgitatorException;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.CoreLoaderTestExpectations.*;

public class GenerateParameterJsonLoaderTest extends JsonLoaderTest {
    public GenerateParameterJsonLoaderTest() {
        super(new GenerateParameterJsonLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/GenerateParameter_min.json", GenerateParameter_min);
    }

    @Test
    public void testMaximum() throws Exception {
        assertExpectation("classpath:/GenerateParameter_max.json", GenerateParameter_max);
    }

    @Test
    public void testMaximumFlat() throws Exception {
        assertExpectation("classpath:/GenerateParameter_maxFlat.json", GenerateParameter_maxFlat);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/GenerateParameter_fullLoad.json");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidJsonEmptyProcessor() throws Exception {
        loadFromFile("classpath:/GenerateParameter_emptyProcessor.json");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidJsonMissingProcessorClass() throws Exception {
        loadFromFile("classpath:/GenerateParameter_missingProcessorClass.json");
    }
}
