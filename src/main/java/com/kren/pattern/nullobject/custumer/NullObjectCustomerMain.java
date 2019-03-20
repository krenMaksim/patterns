package com.kren.pattern.nullobject.custumer;

public class NullObjectCustomerMain {

    public static void main(String[] args) {
        Customer customer = new Customer(10, "testcompany");
        System.out.println(customer);

        customer = Customer.NULL_CUSTOMER;
        System.out.println(customer);
    }
}
