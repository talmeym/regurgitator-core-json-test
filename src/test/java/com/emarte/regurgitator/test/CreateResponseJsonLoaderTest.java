/* * Copyright (C) 2017 Miles Talmey. * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT). */package com.emarte.regurgitator.test;import com.emarte.regurgitator.core.CreateResponseJsonLoader;import com.emarte.regurgitator.core.RegurgitatorException;import org.junit.Test;import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;import static com.emarte.regurgitator.test.CoreLoaderTestExpectations.*;public class CreateResponseJsonLoaderTest extends JsonLoaderTest {    public CreateResponseJsonLoaderTest() {        super(new CreateResponseJsonLoader());    }    @Test    public void testValue() throws Exception {        assertExpectation("classpath:/CreateResponse_value.json", CreateResponse_value);    }    @Test    public void testFile() throws Exception {        assertExpectation("classpath:/CreateResponse_file.json", CreateResponse_file);    }    @Test    public void testSource() throws Exception {        assertExpectation("classpath:/CreateResponse_source.json", CreateResponse_source);    }    @Test    public void testSourceAndValue() throws Exception {        assertExpectation("classpath:/CreateResponse_sourceAndValue.json", CreateResponse_sourceAndValue);    }    @Test    public void testSourceAndFile() throws Exception {        assertExpectation("classpath:/CreateResponse_sourceAndFile.json", CreateResponse_sourceAndFile);    }    @Test    public void testProcessor() throws Exception {        assertExpectation("classpath:/CreateResponse_processor.json", CreateResponse_processor);    }    @Test    public void testProcessorFlat() throws Exception {        assertExpectation("classpath:/CreateResponse_processorFlat.json", CreateResponse_processorFlat);    }    @Test    public void testFullLoad() throws Exception {        loadFile("classpath:/CreateResponse_fullLoad.json");    }    @Test(expected = RegurgitatorException.class)    public void testValueAndFileException() throws Exception {        loadFromFile("classpath:/CreateResponse_valueAndFile.json");    }    @Test(expected = RegurgitatorException.class)    public void testNothingException() throws Exception {        loadFromFile("classpath:/CreateResponse_nothing.json");    }    @Test(expected = RegurgitatorException.class)    public void testMissingFileException() throws Exception {        loadFromFile("classpath:/CreateResponse_missingFile.json");    }}