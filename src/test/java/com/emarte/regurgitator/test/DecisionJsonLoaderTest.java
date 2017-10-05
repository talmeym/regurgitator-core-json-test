package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.*;
import org.junit.Test;

public class DecisionJsonLoaderTest extends JsonLoaderTest {
    public DecisionJsonLoaderTest() {
        super(new DecisionJsonLoader());
    }

    @Test
    public void testMidJson() throws Exception {
        assertExpectation("classpath:/Decision_min.json", "com.emarte.regurgitator.core.Decision:['decision-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1']],[com.emarte.regurgitator.core.Rule:['rule-1',[com.emarte.regurgitator.core.Condition:['condition-1',com.emarte.regurgitator.core.ContextLocation:['context:location'],'value',true,com.emarte.regurgitator.core.ContainsBehaviour:[]]],'test-step-1']],com.emarte.regurgitator.core.FirstMatchBehaviour:[],null]");
    }

    @Test
    public void testMinimumJson() throws Exception {
        assertExpectation("classpath:/Decision_min_min.json", "com.emarte.regurgitator.core.Decision:['decision-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1']],[com.emarte.regurgitator.core.Rule:['rule-1',[com.emarte.regurgitator.core.Condition:['condition-1',com.emarte.regurgitator.core.ContextLocation:['context:location'],'value',true,com.emarte.regurgitator.core.ContainsBehaviour:[]]],'test-step-1']],com.emarte.regurgitator.core.FirstMatchBehaviour:[],null]");
    }

    @Test
    public void testMaximumJson() throws Exception {
        assertExpectation("classpath:/Decision_max.json", "com.emarte.regurgitator.core.Decision:['decision-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1'], com.emarte.regurgitator.test.stuff.TestStep:['test-step-2']],[com.emarte.regurgitator.core.Rule:['rule-1',[com.emarte.regurgitator.core.Condition:['condition-1',com.emarte.regurgitator.core.ContextLocation:['context:location1'],'value1',false,com.emarte.regurgitator.core.EqualsBehaviour:[]], com.emarte.regurgitator.core.Condition:['condition-2',com.emarte.regurgitator.core.ContextLocation:['context:location2'],'value2',true,com.emarte.regurgitator.test.stuff.TestConditionBehaviour:[]]],'test-step-1'], com.emarte.regurgitator.core.Rule:['rule-2',[com.emarte.regurgitator.core.Condition:['condition-3',com.emarte.regurgitator.core.ContextLocation:['context:location3'],'value3',false,com.emarte.regurgitator.core.EqualsBehaviour:[]], com.emarte.regurgitator.core.Condition:['condition-4',com.emarte.regurgitator.core.ContextLocation:['context:location4'],'value4',true,com.emarte.regurgitator.test.stuff.TestConditionBehaviour:[]], com.emarte.regurgitator.core.Condition:['condition-5',com.emarte.regurgitator.core.ContextLocation:['context:location4'],'value5',true,com.emarte.regurgitator.test.stuff.TestConditionBehaviour:[]]],'test-step-2']],com.emarte.regurgitator.test.stuff.TestRulesBehaviour:[],'test-step-2']");
    }

    @Test
    public void testFullLoadJson() throws Exception {
        ConfigurationFile.loadFile("classpath:/Decision_fullLoad.json");
    }

    @Test(expected = RegurgitatorException.class)
    public void testMissingStepJson() throws Exception {
        loadFromFile("classpath:/Decision_missingStep.json");
    }
}
