package com.kren.pattern.abstarctfactory.button;

class LinuxButton implements Button {

    @Override
    public void paint() {
        System.out.println("linux button");
    }
}
