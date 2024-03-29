/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import uk.emarte.regurgitator.core.AbstractJsonPackageMap;

import java.util.Arrays;
import java.util.List;

public class TestJsonPackageMap extends AbstractJsonPackageMap {
    private static final List<String> kinds = Arrays.asList("test-value-generator", "test-value-builder", "test-value-validator", "test-value-processor", "test-step", "test-condition-behaviour", "test-rules-behaviour");

    public TestJsonPackageMap() {
        addPackageMapping(kinds, "uk.emarte.regurgitator.test.stuff");
    }
}
