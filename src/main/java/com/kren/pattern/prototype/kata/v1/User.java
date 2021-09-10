package com.kren.pattern.prototype.kata.v1;

class User implements Cloneable {

    private final String firstName;
    private final String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // v1
    public User copy() {
        return new User(this.firstName, this.lastName);
    }

    // v2 official recomentation
    @Override
    public User clone() {
        return new User(this.firstName, this.lastName);
    }
}
