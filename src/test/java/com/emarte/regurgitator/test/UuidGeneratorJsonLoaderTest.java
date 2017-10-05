package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.UuidGeneratorJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class UuidGeneratorJsonLoaderTest extends JsonLoaderTest {
    public UuidGeneratorJsonLoaderTest() {
        super(new UuidGeneratorJsonLoader());
    }

    @Test
    public void testThis() throws Exception {
        assertExpectation("classpath:/UuidGenerator.json", "com.emarte.regurgitator.core.UuidGenerator:[]");
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/UuidGenerator_fullLoad.json");
    }
}
