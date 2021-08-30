package com.kren.pattern.facade.shape;

class FacadeMain {

    public static void main(String[] args) {
        ShapeFacade shape = new ShapeFacade();
        shape.drawAll();
        shape.drawCircle();
    }
}
