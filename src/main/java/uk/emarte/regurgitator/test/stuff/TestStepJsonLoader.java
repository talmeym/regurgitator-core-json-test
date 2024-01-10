/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test.stuff;

import net.sf.json.JSONObject;
import uk.emarte.regurgitator.core.JsonLoader;
import uk.emarte.regurgitator.core.RegurgitatorException;
import uk.emarte.regurgitator.core.Step;

import java.util.Set;

import static uk.emarte.regurgitator.core.JsonConfigUtil.loadId;

public class TestStepJsonLoader implements JsonLoader<Step> {
    @Override
    public Step load(JSONObject jsonObject, Set<Object> allIds) throws RegurgitatorException {
        return new TestStep(loadId(jsonObject, allIds));
    }
}
