package com.kren.pattern.abstarctfactory.button;

import com.kren.pattern.abstarctfactory.button.OsFactory.Os;

class ButtonAbstractFactoryMain {

    public static void main(String[] args) {

        Button button = OsFactory.newInstance(Os.LINUX)
                                 .createButton();

        button.paint();

        button = OsFactory.newInstance(Os.WINDOWS)
                          .createButton();

        button.paint();

        Checkbox checkbox = OsFactory.newInstance(Os.LINUX)
                                     .createCheckbox();

        checkbox.paint();

    }

}
