package com.kren.pattern.abstract_.factory;

class WinOsFactory extends OsFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }

}
