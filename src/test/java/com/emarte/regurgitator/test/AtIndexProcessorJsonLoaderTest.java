/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.AtIndexProcessorJsonLoader;
import com.emarte.regurgitator.core.RegurgitatorException;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.CoreLoaderTestExpectations.*;

public class AtIndexProcessorJsonLoaderTest extends JsonLoaderTest {
    public AtIndexProcessorJsonLoaderTest() {
        super(new AtIndexProcessorJsonLoader());
    }

    @Test
    public void testValue() throws Exception {
        assertExpectation("classpath:/AtIndexProcessor_value.json", AtIndexProcessor_value);
    }

    @Test
    public void testSource() throws Exception {
        assertExpectation("classpath:/AtIndexProcessor_source.json", AtIndexProcessor_source);
    }

    @Test
    public void testSourceAndValue() throws Exception {
        assertExpectation("classpath:/AtIndexProcessor_sourceAndValue.json", AtIndexProcessor_sourceAndValue);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/AtIndexProcessor_fullLoad.json");
    }

    @Test(expected = RegurgitatorException.class)
    public void testMissingSourceAndValue() throws Exception {
        loadFile("classpath:/AtIndexProcessor_missingSourceAndValue.json");
    }
}
