package com.emarte.regurgitator.test.stuff;

import com.emarte.regurgitator.core.*;
import net.sf.json.JSONObject;

import java.util.Set;

public class TestValueBuilderJsonLoader implements JsonLoader<ValueBuilder> {
	@Override
	public ValueBuilder load(JSONObject jsonObject, Set<Object> allIds) throws RegurgitatorException {
		return new TestValueBuilder();
	}
}
