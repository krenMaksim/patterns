package com.kren.pattern.proxy;

class RealImage implements Image {

    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println(String.format("Displaying %s", fileName));
    }

    private void loadFromDisk(String fileName) {
        System.out.println(String.format("Loading %s", fileName));
    }
}
