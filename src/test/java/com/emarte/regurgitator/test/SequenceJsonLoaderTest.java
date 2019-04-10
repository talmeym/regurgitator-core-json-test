/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.core.SequenceJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.CoreLoaderTestExpectations.*;

public class SequenceJsonLoaderTest extends JsonLoaderTest {
    public SequenceJsonLoaderTest() {
        super(new SequenceJsonLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/Sequence_min.json", Sequence_min);
    }

    @Test
    public void testMaximum() throws Exception {
        assertExpectation("classpath:/Sequence_max.json", Sequence_max);
    }

    @Test
    public void testIsolate() throws Exception {
        assertExpectation("classpath:/Sequence_isolate.json", Sequence_isolate);
    }

    @Test
    public void testIsolateParams() throws Exception {
        assertExpectation("classpath:/Sequence_isolateParams.json", Sequence_isolateParams);
    }

    @Test
    public void testIsolateSession() throws Exception {
        assertExpectation("classpath:/Sequence_isolateSession.json", Sequence_isolateSession);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/Sequence_max.json");
    }

    @Test(expected = RegurgitatorException.class)
    public void testMissingStep() throws Exception {
        loadFromFile("classpath:/Sequence_missingStep.json");
    }
}
