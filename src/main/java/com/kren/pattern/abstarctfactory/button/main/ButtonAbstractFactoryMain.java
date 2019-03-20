package com.kren.pattern.abstarctfactory.button.main;

import com.kren.pattern.abstarctfactory.button.Button;
import com.kren.pattern.abstarctfactory.button.Checkbox;
import com.kren.pattern.abstarctfactory.button.OsFactory;
import com.kren.pattern.abstarctfactory.button.OsFactory.Os;

public class ButtonAbstractFactoryMain {

    public static void main(String[] args) {

        Button button = OsFactory.getOs(Os.LINUX)
                                 .createButton();

        button.paint();

        button = OsFactory.getOs(Os.WINDOWS)
                          .createButton();

        button.paint();

        Checkbox checkbox = OsFactory.getOs(Os.LINUX)
                                     .createCheckbox();

        checkbox.paint();

    }

}
