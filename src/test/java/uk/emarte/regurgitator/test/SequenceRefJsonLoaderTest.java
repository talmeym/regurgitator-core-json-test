/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import uk.emarte.regurgitator.core.SequenceRefJsonLoader;
import org.junit.Test;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.CoreLoaderTestExpectations.SequenceRef_min;

public class SequenceRefJsonLoaderTest extends JsonLoaderTest {
    public SequenceRefJsonLoaderTest() {
        super(new SequenceRefJsonLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/SequenceRef_min.json", SequenceRef_min);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/SequenceRef_fullLoad.json");
    }
}
