package com.kren.pattern.kata.v1.composite;

class CompositeMain {

    public static void main(String[] args) {
        Box b1 = new Box();
        b1.addProduct(new Pen());
        b1.addProduct(new Pen());
        b1.addProduct(new Pen());

        Box b2 = new Box();
        b2.addProduct(new Book());
        b2.addProduct(new Book());
        b2.addProduct(new Book());

        Box b3 = new Box();
        b3.addBox(b1);
        b3.addBox(b2);
        b3.addProduct(new Book());
        b3.addProduct(new Pen());

        System.out.println(b3.getPrice());
    }
}
