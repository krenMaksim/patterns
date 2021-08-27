package com.kren.pattern.abstract_.factory;

class LinuxButton implements Button {

    @Override
    public void paint() {
        System.out.println("linux button");
    }
}
