package com.kren.pattern.rev26072023.mediator;

import java.util.Objects;

class MainProblem2 {

    public static void main(String[] args) {
        Button button = new Button();
        PowerSupplier powerSupplier = new PowerSupplier(button);
        button.attachPowerSupplier(powerSupplier);
        Fan fan = new Fan(button, powerSupplier);

        fan.clickButton();
        System.out.println(fan.isOn());

        fan.powerOn();
        System.out.println(fan.isOn());

        fan.clickButton();
        System.out.println(fan.isOn());

        fan.clickButton();
        System.out.println(fan.isOn());

        fan.powerOff();
        System.out.println(fan.isOn());

        fan.clickButton();
        System.out.println(fan.isOn());

        fan.clickButton();
        System.out.println(fan.isOn());

    }

    static class Fan {

        private final Button button;
        private final PowerSupplier powerSupplier;

        public Fan(Button button, PowerSupplier powerSupplier) {
            this.button = button;
            this.powerSupplier = powerSupplier;
        }

        public void clickButton() {
            button.click();
        }

        public void powerOff() {
            powerSupplier.turnOff();
        }

        public void powerOn() {
            powerSupplier.turnOn();
        }

        public boolean isOn() {
            return button.isOn();
        }
    }

    static class Button {

        private boolean isOn = false;
        private PowerSupplier powerSupplier;

        public void attachPowerSupplier(PowerSupplier powerSupplier) {
            this.powerSupplier = powerSupplier;
        }

        public void click() {
            Objects.requireNonNull(powerSupplier);
            if (powerSupplier.isOn()) {
                isOn = !isOn;
            }
        }

        public boolean isOn() {
            return isOn;
        }

    }

    static class PowerSupplier {

        private boolean isOn;
        private Button button;

        public PowerSupplier(Button button) {
            this.isOn = false;
            this.button = button;
        }

        public void turnOn() {
            isOn = true;
        }

        public void turnOff() {
            if (button.isOn()) {
                button.click();
            }
            isOn = false;
        }

        public boolean isOn() {
            return isOn;
        }

    }

}
