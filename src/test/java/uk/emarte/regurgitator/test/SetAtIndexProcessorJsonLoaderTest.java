/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;
import uk.emarte.regurgitator.core.RegurgitatorException;
import uk.emarte.regurgitator.core.SetAtIndexProcessorJsonLoader;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.CoreLoaderTestExpectations.SetAtIndexProcessor_BothSource;

public class SetAtIndexProcessorJsonLoaderTest extends JsonLoaderTest {
    public SetAtIndexProcessorJsonLoaderTest() {
        super(new SetAtIndexProcessorJsonLoader());
    }

    @Test
    public void testValue() throws Exception {
        assertExpectation("classpath:/SetAtIndexProcessor_bothSource.json", SetAtIndexProcessor_BothSource);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/SetAtIndexProcessor_fullLoad.json");
    }

    @Test(expected = RegurgitatorException.class)
    public void testMissingIndexSource() throws Exception {
        loadFile("classpath:/SetAtIndexProcessor_missingIndexSource.json");
    }

    @Test(expected = RegurgitatorException.class)
    public void testMissingValueSource() throws Exception {
        loadFile("classpath:/SetAtIndexProcessor_missingValueSource.json");
    }
}
