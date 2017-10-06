/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.*;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class SequenceJsonLoaderTest extends JsonLoaderTest {
    public SequenceJsonLoaderTest() {
        super(new SequenceJsonLoader());
    }

    @Test
    public void testMinimumJson() throws Exception {
        assertExpectation("classpath:/Sequence_min.json", "com.emarte.regurgitator.core.Sequence:['sequence-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1']],null]");
    }

    @Test
    public void testMaximumJson() throws Exception {
        assertExpectation("classpath:/Sequence_max.json", "com.emarte.regurgitator.core.Sequence:['sequence-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-2'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-3']],com.emarte.regurgitator.core.Isolate:[true,true]]");
    }

    @Test
    public void testIsolateJson() throws Exception {
        assertExpectation("classpath:/Sequence_isolate.json", "com.emarte.regurgitator.core.Sequence:['sequence-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-2'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-3']],com.emarte.regurgitator.core.Isolate:[false,false]]");
    }

    @Test
    public void testIsolateParamsJson() throws Exception {
        assertExpectation("classpath:/Sequence_isolateParams.json", "com.emarte.regurgitator.core.Sequence:['sequence-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-2'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-3']],com.emarte.regurgitator.core.Isolate:[false,true]]");
    }

    @Test
    public void testIsolateSessionJson() throws Exception {
        assertExpectation("classpath:/Sequence_isolateSession.json", "com.emarte.regurgitator.core.Sequence:['sequence-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-2'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-3']],com.emarte.regurgitator.core.Isolate:[true,false]]");
    }

    @Test
    public void testFullLoadJson() throws Exception {
        loadFile("classpath:/Sequence_max.json");
    }

    @Test(expected = RegurgitatorException.class)
    public void testMissingStepJson() throws Exception {
        loadFromFile("classpath:/Sequence_missingStep.json");
    }
}
