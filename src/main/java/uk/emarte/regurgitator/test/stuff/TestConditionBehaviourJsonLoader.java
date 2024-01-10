/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test.stuff;

import net.sf.json.JSONObject;
import uk.emarte.regurgitator.core.JsonLoader;

import java.util.Set;

public class TestConditionBehaviourJsonLoader implements JsonLoader<TestConditionBehaviour> {
    @Override
    public TestConditionBehaviour load(JSONObject jsonObject, Set<Object> allIds) {
        return new TestConditionBehaviour();
    }
}
