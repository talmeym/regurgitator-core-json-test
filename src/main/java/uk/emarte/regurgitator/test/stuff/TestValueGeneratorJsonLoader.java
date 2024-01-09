/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test.stuff;

import uk.emarte.regurgitator.core.JsonLoader;
import uk.emarte.regurgitator.core.ValueGenerator;
import net.sf.json.JSONObject;

import java.util.Set;

public class TestValueGeneratorJsonLoader implements JsonLoader<ValueGenerator> {
    @Override
    public ValueGenerator load(JSONObject jsonObject, Set<Object> allIds) {
        return new TestValueGenerator();
    }
}
