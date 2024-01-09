/* * Copyright (C) 2017 Miles Talmey. * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT). */package uk.emarte.regurgitator.test;import uk.emarte.regurgitator.core.IdentifySessionJsonLoader;import uk.emarte.regurgitator.core.RegurgitatorException;import org.junit.Test;import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;import static uk.emarte.regurgitator.test.CoreLoaderTestExpectations.*;public class IdentifySessionJsonLoaderTest extends JsonLoaderTest {    public IdentifySessionJsonLoaderTest() {        super(new IdentifySessionJsonLoader());    }    @Test    public void testValue() throws Exception {        assertExpectation("classpath:/IdentifySession_value.json", IdentifySession_value);    }    @Test    public void testSource() throws Exception {        assertExpectation("classpath:/IdentifySession_source.json", IdentifySession_source);    }    @Test    public void testSourceAndValue() throws Exception {        assertExpectation("classpath:/IdentifySession_sourceAndValue.json", IdentifySession_sourceAndValue);    }    @Test    public void testFullLoad() throws Exception {        loadFile("classpath:/IdentifySession_fullLoad.json");    }    @Test(expected = RegurgitatorException.class)    public void testNothingException() throws Exception {        loadFromFile("classpath:/IdentifySession_nothing.json");    }}