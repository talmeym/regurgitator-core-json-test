package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.*;
import org.junit.Test;

public class BuildParameterJsonLoaderTest extends JsonLoaderTest {
    public BuildParameterJsonLoaderTest() {
        super(new BuildParameterJsonLoader());
    }

    @Test
    public void testMinimumJson() throws Exception {
        assertExpectation("classpath:/BuildParameter_min.json", "com.emarte.regurgitator.core.BuildParameter:['build-param-1',com.emarte.regurgitator.core.ParameterPrototype:['toTest1',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.test.stuff.TestValueBuilder:[],null]");
    }

    @Test
    public void testMaximumJson() throws Exception {
        assertExpectation("classpath:/BuildParameter_max.json", "com.emarte.regurgitator.core.BuildParameter:['build-param-2',com.emarte.regurgitator.core.ParameterPrototype:['toTest2',com.emarte.regurgitator.core.NumberType:[],com.emarte.regurgitator.core.ConflictPolicy:LEAVE],'something',com.emarte.regurgitator.test.stuff.TestValueBuilder:[],com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]");
    }

    @Test
    public void testMaximumFlatJson() throws Exception {
        assertExpectation("classpath:/BuildParameter_maxFlat.json", "com.emarte.regurgitator.core.BuildParameter:['build-param-2',com.emarte.regurgitator.core.ParameterPrototype:['toTest2',com.emarte.regurgitator.core.NumberType:[],com.emarte.regurgitator.core.ConflictPolicy:LEAVE],'something',com.emarte.regurgitator.test.stuff.TestValueBuilder:[],com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]");
    }

    @Test
    public void testFullLoad() throws Exception {
        ConfigurationFile.loadFile("classpath:/BuildParameter_fullLoad.json");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidJsonMissingBuilder() throws Exception {
        loadFromFile("classpath:/BuildParameter_missingBuilder.json");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidJsonEmptyBuilder() throws Exception {
        loadFromFile("classpath:/BuildParameter_emptyBuilder.json");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidJsonEmptyProcessor() throws Exception {
        loadFromFile("classpath:/BuildParameter_emptyProcessor.json");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidJsonMissingBuilderClass() throws Exception {
        loadFromFile("classpath:/BuildParameter_missingBuilderClass.json");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidJsonMissingProcessorClass() throws Exception {
        loadFromFile("classpath:/BuildParameter_missingProcessorClass.json");
    }
}
