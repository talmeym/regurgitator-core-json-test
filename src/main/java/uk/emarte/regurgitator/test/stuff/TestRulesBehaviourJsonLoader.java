/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test.stuff;

import uk.emarte.regurgitator.core.JsonLoader;
import uk.emarte.regurgitator.core.RulesBehaviour;
import net.sf.json.JSONObject;

import java.util.Set;

public class TestRulesBehaviourJsonLoader implements JsonLoader<RulesBehaviour> {
    @Override
    public RulesBehaviour load(JSONObject jsonObject, Set<Object> allIds) {
        return new TestRulesBehaviour();
    }
}
