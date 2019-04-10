/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test.stuff;

import com.emarte.regurgitator.core.JsonLoader;
import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.core.ValueGenerator;
import net.sf.json.JSONObject;

import java.util.Set;

public class TestValueGeneratorJsonLoader implements JsonLoader<ValueGenerator> {
    @Override
    public ValueGenerator load(JSONObject jsonObject, Set<Object> allIds) throws RegurgitatorException {
        return new TestValueGenerator();
    }
}
