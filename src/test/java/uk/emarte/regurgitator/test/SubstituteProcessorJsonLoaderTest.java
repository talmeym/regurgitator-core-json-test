/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import uk.emarte.regurgitator.core.SubstituteProcessorJsonLoader;
import org.junit.Test;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.CoreLoaderTestExpectations.SubstituteProcessor_min;

public class SubstituteProcessorJsonLoaderTest extends JsonLoaderTest {
    public SubstituteProcessorJsonLoaderTest() {
        super(new SubstituteProcessorJsonLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/SubstituteProcessor_min.json", SubstituteProcessor_min);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/SubstituteProcessor_fullLoad.json");
    }
}
