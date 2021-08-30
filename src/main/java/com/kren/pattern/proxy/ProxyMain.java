package com.kren.pattern.proxy;

class ProxyMain {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        System.out.println("Image will be loaded from disk");
        image.display();


        System.out.println("Image will not be loaded from disk");
        image.display();
    }
}
