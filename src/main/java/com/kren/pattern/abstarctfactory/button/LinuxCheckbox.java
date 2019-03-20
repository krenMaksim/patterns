package com.kren.pattern.abstarctfactory.button;

class LinuxCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("linux checkbox");
    }
}
