/* * Copyright (C) 2017 Miles Talmey. * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT). */package com.emarte.regurgitator.test;import com.emarte.regurgitator.core.IdentifySessionJsonLoader;import com.emarte.regurgitator.core.RegurgitatorException;import org.junit.Test;import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;public class IdentifySessionJsonLoaderTest extends JsonLoaderTest {    public IdentifySessionJsonLoaderTest() {        super(new IdentifySessionJsonLoader());    }    @Test    public void testSourceJson() throws Exception {        assertExpectation("classpath:/IdentifySession_source.json", "com.emarte.regurgitator.core.IdentifySession:['identify-session-1',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null]]");    }    @Test    public void testValueJson() throws Exception {        assertExpectation("classpath:/IdentifySession_value.json", "com.emarte.regurgitator.core.IdentifySession:['identify-session-1',com.emarte.regurgitator.core.ValueSource:[null,'value']]");    }    @Test    public void testSourceAndValueJson() throws Exception {        assertExpectation("classpath:/IdentifySession_sourceAndValue.json", "com.emarte.regurgitator.core.IdentifySession:['identify-session-1',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],'value']]");    }    @Test    public void testFullLoadJson() throws Exception {        loadFile("classpath:/IdentifySession_fullLoad.json");    }    @Test(expected = RegurgitatorException.class)    public void testNothingExceptionJson() throws Exception {        loadFromFile("classpath:/IdentifySession_nothing.json");    }}