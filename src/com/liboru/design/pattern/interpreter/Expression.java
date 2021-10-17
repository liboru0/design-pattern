package com.liboru.design.pattern.interpreter;

import java.util.Map;

public interface Expression {
    boolean interpret(Map<String, Long> stats);
}
