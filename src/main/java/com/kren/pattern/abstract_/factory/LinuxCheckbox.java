package com.kren.pattern.abstract_.factory;

class LinuxCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("linux checkbox");
    }
}
