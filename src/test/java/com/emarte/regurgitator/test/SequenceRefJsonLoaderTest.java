/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.SequenceRefJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class SequenceRefJsonLoaderTest extends JsonLoaderTest {
    public SequenceRefJsonLoaderTest() {
        super(new SequenceRefJsonLoader());
    }

    @Test
    public void testMinimumJson() throws Exception {
        assertExpectation("classpath:/SequenceRef_min.json", "com.emarte.regurgitator.core.Sequence:['regurgitator-configuration-1',[com.emarte.regurgitator.core.CreateParameter:['create-param-1',com.emarte.regurgitator.core.ParameterPrototype:['toTest1',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null],null]],null]");
    }

    @Test
    public void testFullLoadJson() throws Exception {
        loadFile("classpath:/SequenceRef_fullLoad.json");
    }
}
