/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import uk.emarte.regurgitator.core.RegurgitatorException;
import uk.emarte.regurgitator.core.RemoveAtIndexProcessorJsonLoader;
import org.junit.Test;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.CoreLoaderTestExpectations.RemoveAtIndexProcessor_source;
import static uk.emarte.regurgitator.test.CoreLoaderTestExpectations.RemoveAtIndexProcessor_value;

public class RemoveAtIndexProcessorJsonLoaderTest extends JsonLoaderTest {
    public RemoveAtIndexProcessorJsonLoaderTest() {
        super(new RemoveAtIndexProcessorJsonLoader());
    }

    @Test
    public void testValue() throws Exception {
        assertExpectation("classpath:/RemoveAtIndexProcessor_Value.json", RemoveAtIndexProcessor_value);
    }

    @Test
    public void testSource() throws Exception {
        assertExpectation("classpath:/RemoveAtIndexProcessor_source.json", RemoveAtIndexProcessor_source);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/RemoveAtIndexProcessor_fullLoad.json");
    }

    @Test(expected = RegurgitatorException.class)
    public void testMissingIndexSource() throws Exception {
        loadFile("classpath:/RemoveAtIndexProcessor_missingIndexSource.json");
    }
}
