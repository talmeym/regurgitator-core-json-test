package com.emarte.regurgitator.test.stuff;

import com.emarte.regurgitator.core.*;
import net.sf.json.JSONObject;

import java.util.Set;

public class TestRulesBehaviourJsonLoader implements JsonLoader<RulesBehaviour> {
	@Override
	public RulesBehaviour load(JSONObject jsonObject, Set<Object> allIds) throws RegurgitatorException {
		return new TestRulesBehaviour();
	}
}
