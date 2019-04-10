/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.BuildParameterJsonLoader;
import com.emarte.regurgitator.core.ConfigurationFile;
import com.emarte.regurgitator.core.RegurgitatorException;
import org.junit.Test;

import static com.emarte.regurgitator.test.CoreLoaderTestExpectations.*;

public class BuildParameterJsonLoaderTest extends JsonLoaderTest {
    public BuildParameterJsonLoaderTest() {
        super(new BuildParameterJsonLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/BuildParameter_min.json", BuildParameter_min);
    }

    @Test
    public void testMaximum() throws Exception {
        assertExpectation("classpath:/BuildParameter_max.json", BuildParameter_max);
    }

    @Test
    public void testMaximumFlat() throws Exception {
        assertExpectation("classpath:/BuildParameter_maxFlat.json", BuildParameter_maxFlat);
    }

    @Test
    public void testFullLoad() throws Exception {
        ConfigurationFile.loadFile("classpath:/BuildParameter_fullLoad.json");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidJsonMissingBuilder() throws Exception {
        loadFromFile("classpath:/BuildParameter_missingBuilder.json");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidJsonEmptyBuilder() throws Exception {
        loadFromFile("classpath:/BuildParameter_emptyBuilder.json");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidJsonEmptyProcessor() throws Exception {
        loadFromFile("classpath:/BuildParameter_emptyProcessor.json");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidJsonMissingBuilderClass() throws Exception {
        loadFromFile("classpath:/BuildParameter_missingBuilderClass.json");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidJsonMissingProcessorClass() throws Exception {
        loadFromFile("classpath:/BuildParameter_missingProcessorClass.json");
    }
}
