package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.AbstractJsonPackageMap;

import java.util.*;

public class TestJsonPackageMap extends AbstractJsonPackageMap {
    private static final List<String> kinds = Arrays.asList("test-value-generator", "test-value-builder", "test-value-validator", "test-value-processor", "test-step", "test-condition-behaviour", "test-rules-behaviour");

    public TestJsonPackageMap() {
        addPackageMapping(kinds, "com.emarte.regurgitator.test.stuff");
    }
}
