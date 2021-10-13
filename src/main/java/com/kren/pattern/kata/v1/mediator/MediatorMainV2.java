package com.kren.pattern.kata.v1.mediator;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

class MediatorMainV2 {

    public static void main(String[] args) {

        // The problem here is how to make Fan not to depend PowerSupplier and Button

        Button button = new Button();
        PowerSupplier powerSupplier = new PowerSupplier();

        Mediator mediator = new Mediator(powerSupplier, button);

        // Fan fan = new Fan(powerSupplier, button);
        Fan fan = new Fan(mediator);

        fan.pressButton();
        fan.pressButton();
        fan.pressButton();
        fan.pressButton();
        fan.pressButton();
    }

    @RequiredArgsConstructor
    private static class Mediator {

        private final PowerSupplier powerSupplier;
        private final Button button;

        public void turnOn() {
            powerSupplier.turnOn();
        }

        public void turnOff() {
            powerSupplier.turnOff();
        }

        public void press() {
            button.press();
        }

        public void setFan(Fan fan) {
            button.setFan(fan);
        }
    }

    @Getter
    private static class Fan {

        private final Mediator mediator;

        private boolean isOn = false;

        public Fan(Mediator mediator) {
            this.mediator = mediator;
            mediator.setFan(this);
        }

        public void turnOn() {
            mediator.turnOn();
            isOn = true;
        }

        public void turnOff() {
            mediator.turnOff();
            isOn = false;
        }

        public void pressButton() {
            mediator.press();
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
