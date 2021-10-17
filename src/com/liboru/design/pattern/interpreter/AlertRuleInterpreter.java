package com.liboru.design.pattern.interpreter;

import java.util.Map;

/**
 * 报警规则解释器
 */

public class AlertRuleInterpreter {
    private final Expression expression;

    public AlertRuleInterpreter(String ruleExpression) {
        this.expression = new OrExpression(ruleExpression);
    }

    public boolean interpret(Map<String, Long> stats) {
        return expression.interpret(stats);
    }
}
