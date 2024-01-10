/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;
import uk.emarte.regurgitator.core.ExtractProcessorJsonLoader;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.CoreLoaderTestExpectations.ExtractProcessor_min;

public class ExtractProcessorJsonLoaderTest extends JsonLoaderTest {
    public ExtractProcessorJsonLoaderTest() {
        super(new ExtractProcessorJsonLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/ExtractProcessor_min.json", ExtractProcessor_min);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/ExtractProcessor_fullLoad.json");
    }
}
