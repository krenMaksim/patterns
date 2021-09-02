package com.kren.pattern.iterator;

class IteratorMain {

    public static void main(String[] args) {

        PhoneBook book = new PhoneBook();

        book.forEach(i -> System.out.println(i));

        for (String string : book) {
            System.out.println(string);
        }
    }
}
