package com.kren.pattern.interpreter.sql;

interface SqlCommand {
    String interpret(SqlQuery query);
}
