package com.kren.pattern.abstarctfactory.button;

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
