package com.kren.pattern.abstract_.factory;

class WinButton implements Button {

    @Override
    public void paint() {
        System.out.println("win button");
    }
}
