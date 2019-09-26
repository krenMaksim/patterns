package com.kren.pattern.interpreter;

import com.kren.pattern.interpreter.sql.SqlQuery;

public class InterpreterMain {

    public static void main(String[] args) {
        String sql = SqlQuery.createQuery()
                             .select("*")
                             .from("user")
                             .where("user.id = 2")
                             .build();
        
        System.out.println("SQL: " + sql);
    }
}
