package com.emarte.regurgitator.test.stuff;

import com.emarte.regurgitator.core.*;
import net.sf.json.JSONObject;

import java.util.Set;

public class TestValueProcessorJsonLoader implements JsonLoader<TestValueProcessor> {
    @Override
    public TestValueProcessor load(JSONObject jsonObject, Set<Object> allIds) throws RegurgitatorException {
        return new TestValueProcessor();
    }
}
