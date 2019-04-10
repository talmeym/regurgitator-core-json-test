/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test.stuff;

import com.emarte.regurgitator.core.JsonLoader;
import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.core.ValueBuilder;
import net.sf.json.JSONObject;

import java.util.Set;

public class TestValueBuilderJsonLoader implements JsonLoader<ValueBuilder> {
    @Override
    public ValueBuilder load(JSONObject jsonObject, Set<Object> allIds) throws RegurgitatorException {
        return new TestValueBuilder();
    }
}
