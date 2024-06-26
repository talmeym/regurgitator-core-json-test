/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;
import uk.emarte.regurgitator.core.GenerateParameterJsonLoader;
import uk.emarte.regurgitator.core.RegurgitatorException;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.CoreLoaderTestExpectations.*;

public class GenerateParameterJsonLoaderTest extends JsonLoaderTest {
    public GenerateParameterJsonLoaderTest() {
        super(new GenerateParameterJsonLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/GenerateParameter_min.json", GenerateParameter_min);
    }

    @Test
    public void testMinimumOptional() throws Exception {
        assertExpectation("classpath:/GenerateParameter_min_optional.json", GenerateParameter_min_optional);
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
    public void testMultipleProcessors() throws Exception {
        assertExpectation("classpath:/GenerateParameter_multipleProcessors.json", GenerateParameter_multipleProcessors);
    }

    @Test
    public void testMultipleProcessorsFlat() throws Exception {
        assertExpectation("classpath:/GenerateParameter_multipleProcessorsFlat.json", GenerateParameter_multipleProcessorsFlat);
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
