package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.*;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class SubstituteProcessorJsonLoaderTest extends JsonLoaderTest {
    public SubstituteProcessorJsonLoaderTest() {
        super(new SubstituteProcessorJsonLoader());
    }

    @Test
    public void testMinimumJson() throws Exception {
        assertExpectation("classpath:/SubstituteProcessor_min.json", "com.emarte.regurgitator.core.SubstituteProcessor:['this','that']");
    }

    @Test
    public void testFullLoadJson() throws RegurgitatorException {
        loadFile("classpath:/SubstituteProcessor_fullLoad.json");
    }
}
