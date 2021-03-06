/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.UuidGeneratorJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.CoreLoaderTestExpectations.UuidGenerator;

public class UuidGeneratorJsonLoaderTest extends JsonLoaderTest {
    public UuidGeneratorJsonLoaderTest() {
        super(new UuidGeneratorJsonLoader());
    }

    @Test
    public void testThis() throws Exception {
        assertExpectation("classpath:/UuidGenerator.json", UuidGenerator);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/UuidGenerator_fullLoad.json");
    }
}
