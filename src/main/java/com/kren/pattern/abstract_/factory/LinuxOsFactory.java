package com.kren.pattern.abstract_.factory;

class LinuxOsFactory extends OsFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }

}
