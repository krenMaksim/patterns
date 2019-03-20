package com.kren.pattern.abstarctfactory.button;

class WinButton implements Button {

    @Override
    public void paint() {
        System.out.println("win button");
    }
}
