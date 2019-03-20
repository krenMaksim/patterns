package com.kren.pattern.facade.shape.main;

import com.kren.pattern.facade.shape.ShapeFacade;

public class FacadeShapeMain {

    public static void main(String[] args) {
        ShapeFacade shape = new ShapeFacade();
        shape.drawAll();
        shape.drawCircle();
    }
}
