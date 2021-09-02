package com.kren.pattern.interpreter;

interface SqlCommand {
    String interpret(SqlQuery query);
}
