package com.kren.pattern.kata.v1.prototype;

class PrototypeMain {

    public static void main(String[] args) {
        User u = new User("Nik", "Bishop");
        System.out.println(u);
        System.out.println(u.copy());
    }

}
