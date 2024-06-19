/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;
import uk.emarte.regurgitator.core.BuildParameterJsonLoader;
import uk.emarte.regurgitator.core.ConfigurationFile;
import uk.emarte.regurgitator.core.RegurgitatorException;

import static uk.emarte.regurgitator.test.CoreLoaderTestExpectations.*;

public class BuildParameterJsonLoaderTest extends JsonLoaderTest {
    public BuildParameterJsonLoaderTest() {
        super(new BuildParameterJsonLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/BuildParameter_min.json", BuildParameter_min);
    }

    @Test
    public void testMinimumOptional() throws Exception {
        assertExpectation("classpath:/BuildParameter_min_optional.json", BuildParameter_min_optional);
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
    public void testMultipleProcessors() throws Exception {
        assertExpectation("classpath:/BuildParameter_multipleProcessors.json", BuildParameter_multipleProcessors);
    }

    @Test
    public void testMultipleProcessorsFlat() throws Exception {
        assertExpectation("classpath:/BuildParameter_multipleProcessorsFlat.json", BuildParameter_multipleProcessorsFlat);
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

    @Test(expected = RegurgitatorException.class)
    public void testInvalidJsonBothProcessorAndProcessorsPresent() throws Exception {
        loadFromFile("classpath:/BuildParameter_processorAndProcessors.json");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidJsonProcessorContainsArray() throws Exception {
        loadFromFile("classpath:/BuildParameter_processorAsArray.json");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidJsonProcessorsContainsObject() throws Exception {
        loadFromFile("classpath:/BuildParameter_processorsAsObject.json");
    }
}
