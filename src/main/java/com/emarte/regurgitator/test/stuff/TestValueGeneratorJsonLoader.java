package com.emarte.regurgitator.test.stuff;

import com.emarte.regurgitator.core.*;
import net.sf.json.JSONObject;

import java.util.Set;

public class TestValueGeneratorJsonLoader implements JsonLoader<ValueGenerator> {
	@Override
	public ValueGenerator load(JSONObject jsonObject, Set<Object> allIds) throws RegurgitatorException {
		return new TestValueGenerator();
	}
}
