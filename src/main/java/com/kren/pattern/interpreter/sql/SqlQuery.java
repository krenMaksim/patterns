package com.kren.pattern.interpreter.sql;

import java.util.Objects;

public class SqlQuery {
    public static Builder createQuery() {
        return new Builder();
    }

    private final StringBuilder sqlQuery;

    private SqlQuery() {
        this.sqlQuery = new StringBuilder();
    }

    void addCommand(String command) {
        addSpaceBetweenCommands();
        sqlQuery.append(command);
    }

    String getSqlQuery() {
        sqlQuery.append(";");
        return sqlQuery.toString();
    }

    private void addSpaceBetweenCommands() {
        sqlQuery.append(" ");
    }

    public static class Builder {
        private String[] columns;
        private String table;
        private Where where;

        private Builder() {}

        public Builder select(String... column) {
            this.columns = column;
            return this;
        }

        public Builder from(String table) {
            this.table = table;
            return this;
        }

        public Builder where(String where) {
            this.where = new Where(where);
            return this;
        }

        public String build() {
            checkObligatoryParams();
            SqlQuery sql = new SqlQuery();
            From from = new From(table, where);
            Select select = new Select(from, columns);

            return select.interpret(sql);
        }

        private void checkObligatoryParams() {
            Objects.requireNonNull(columns);
            Objects.requireNonNull(table);
        }
    }
}
