package com.kren.pattern.interpreter;

class From implements SqlCommand {
    private static final String FROM = "FROM";

    private final String fromCondition;
    private final SqlCommand where;

    public From(String table, Where where) {
        this.fromCondition = createFromCondition(table);
        this.where = where;
    }

    private static String createFromCondition(String table) {
        return FROM + " " + table;
    }

    @Override
    public String interpret(SqlQuery query) {
        query.addCommand(fromCondition);
        if (whereExists()) {
            return where.interpret(query);
        }

        return query.getSqlQuery();
    }

    private boolean whereExists() {
        return where != null;
    }
}
