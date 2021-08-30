package com.kren.pattern.proxy;

import java.util.Objects;

class ProxyImage implements Image {

    private final String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (Objects.isNull(realImage)) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
