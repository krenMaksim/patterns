package com.kren.pattern.decorator;

public class DecoratorMain {

    public static void main(String[] args) {
        Coffee coffee = new WithMilk(new WithMilk(new Latte()));
        System.out.println(coffee);
        System.out.println(new Latte());
    }
}
