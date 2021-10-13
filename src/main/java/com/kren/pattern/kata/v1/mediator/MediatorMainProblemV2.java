package com.kren.pattern.kata.v1.mediator;

import lombok.Getter;

import java.util.Objects;

class MediatorMainProblemV2 {

    public static void main(String[] args) {

        // The problem here is how to make Fan not to depend PowerSupplier and Button

        PowerSupplier powerSupplier = new PowerSupplier();
        Button button = new Button();
        Fan fan = new Fan(powerSupplier, button);

        fan.pressButton();
        fan.pressButton();
        fan.pressButton();
        fan.pressButton();
        fan.pressButton();
    }

    @Getter
    private static class Fan {

        private final PowerSupplier powerSupplier;
        private final Button button;

        private boolean isOn = false;

        public Fan(PowerSupplier powerSupplier, Button button) {
            this.powerSupplier = powerSupplier;
            this.button = button;
            button.setFan(this);
        }

        public void turnOn() {
            powerSupplier.turnOn();
            isOn = true;
        }

        public void turnOff() {
            isOn = false;
            powerSupplier.turnOff();
        }

        public void pressButton() {
            button.press();
        }
    }

    private static class Button {

        private Fan fan;

        public void press() {
            if (fan.isOn()) {
                fan.turnOff();
            } else {
                fan.turnOn();
            }
        }

        public void setFan(Fan fan) {
            if (Objects.isNull(this.fan)) {
                this.fan = fan;
            } else {
                throw new IllegalStateException("Fan is already set!");
            }
        }
    }

    private static class PowerSupplier {

        public void turnOn() {
            System.out.println("Power supplier ON");
        }

        public void turnOff() {
            System.out.println("Power supplier OFF");
        }
    }
}
