/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test.stuff;

import com.emarte.regurgitator.core.*;
import net.sf.json.JSONObject;

import java.util.Set;

import static com.emarte.regurgitator.core.JsonConfigUtil.loadId;

public class TestStepJsonLoader implements JsonLoader<Step> {
    @Override
    public Step load(JSONObject jsonObject, Set<Object> allIds) throws RegurgitatorException {
        return new TestStep(loadId(jsonObject, allIds));
    }
}
