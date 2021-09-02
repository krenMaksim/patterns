package com.kren.pattern.interpreter;

class InterpreterMain {

    public static void main(String[] args) {
        String sql = SqlQuery.createQuery()
                             .select("*")
                             .from("user")
                             .where("user.id = 2")
                             .build();

        System.out.println("SQL: " + sql);
    }
}
