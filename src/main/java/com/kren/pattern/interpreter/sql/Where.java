package com.kren.pattern.interpreter.sql;

class Where implements SqlCommand {
    private static final String WHERE = "WHERE";

    private final String whereCondition;

    public Where(String where) {
        this.whereCondition = createWhereCondition(where);
    }

    private static String createWhereCondition(String where) {
        return String.join(" ", WHERE, where);
    }

    @Override
    public String interpret(SqlQuery query) {
        query.addCommand(whereCondition);
        return query.getSqlQuery();
    }
}
