/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.DecisionJsonLoader;
import com.emarte.regurgitator.core.RegurgitatorException;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.CoreLoaderTestExpectations.*;

public class DecisionJsonLoaderTest extends JsonLoaderTest {
    public DecisionJsonLoaderTest() {
        super(new DecisionJsonLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/Decision_min.json", Decision_min);
    }

    @Test
    public void testMinimumMinimum() throws Exception {
        assertExpectation("classpath:/Decision_minMin.json", Decision_minMin);
    }

    @Test
    public void testMax() throws Exception {
        assertExpectation("classpath:/Decision_max.json", Decision_max);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/Decision_fullLoad.json");
    }

    @Test(expected = RegurgitatorException.class)
    public void testMissingStep() throws Exception {
        loadFromFile("classpath:/Decision_missingStep.json");
    }
}
