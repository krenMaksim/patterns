package com.kren.pattern.abstract_.factory;

class WinCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("win checkbox");
    }
}
