package com.kren.pattern.prototype.kata.v1;

class PrototypeMain {

    public static void main(String[] args) {
        User u = new User("Nik", "Bishop");
        System.out.println(u);
        System.out.println(u.copy());
    }

}
