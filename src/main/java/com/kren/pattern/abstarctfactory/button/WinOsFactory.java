package com.kren.pattern.abstarctfactory.button;

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
