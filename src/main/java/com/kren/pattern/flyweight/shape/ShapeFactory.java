package com.kren.pattern.flyweight.shape;

import com.kren.pattern.flyweight.shape.impl.CircleFlyweight;
import com.kren.pattern.flyweight.template.CircleTemplate;
import com.kren.pattern.flyweight.template.CircleTemplateStorage;

public class ShapeFactory {
    private final CircleTemplateStorage storage;

    public ShapeFactory () {
        storage = new CircleTemplateStorage();
    }

    public Shape createCircle(int coordinateX, int coordinateY, int radius, ShapeColor color) {
        CircleTemplate circleTemplate = storage.getTemplate(radius, color);
        return new CircleFlyweight(coordinateX, coordinateY, circleTemplate);
    }
}