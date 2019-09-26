package com.kren.pattern.interpreter.sql;

class Select implements SqlCommand {
    private static final String SELECT = "SELECT";
    private static final String COLUMN_DELIMITER = ", ";

    private final String selectCondition;
    private final SqlCommand from;

    public Select(From from, String... column) {
        this.selectCondition = createSelectCondition(column);
        this.from = from;
    }

    private static String createSelectCondition(String... column) {
        String columns = String.join(COLUMN_DELIMITER, column);
        return String.join(" ", SELECT, columns);
    }

    @Override
    public String interpret(SqlQuery query) {
        query.addCommand(selectCondition);
        return from.interpret(query);
    }
}
