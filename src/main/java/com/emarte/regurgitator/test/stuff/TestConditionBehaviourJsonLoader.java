package com.emarte.regurgitator.test.stuff;

import com.emarte.regurgitator.core.*;
import net.sf.json.JSONObject;

import java.util.Set;

public class TestConditionBehaviourJsonLoader implements JsonLoader<ConditionBehaviour> {
	@Override
	public ConditionBehaviour load(JSONObject jsonObject, Set<Object> allIds) throws RegurgitatorException {
		return new TestConditionBehaviour();
	}
}
