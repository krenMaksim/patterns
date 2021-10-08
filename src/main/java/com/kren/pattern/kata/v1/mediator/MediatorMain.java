package com.kren.pattern.kata.v1.mediator;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

class MediatorMain {

    public static void main(String[] args) {

        // The problem here is how to make Fan not to depend PowerSupplier and Button not to depend Fan

        PowerSupplier powerSupplier = new PowerSupplier();
        Fan fan = new Fan(powerSupplier);
        Button button = new Button(fan);

        button.press();
    }

    @RequiredArgsConstructor
    private static class Button {

        private final Fan fan;

        public void press() {
            if (fan.isOn()) {
                fan.turnOff();
            } else {
                fan.turnOn();
            }
        }
    }

    @Getter
    @RequiredArgsConstructor
    private static class Fan {

        private final PowerSupplier powerSupplier;
        private boolean isOn = false;

        public void turnOn() {
            powerSupplier.turnOn();
            isOn = true;
        }

        public void turnOff() {
            isOn = false;
            powerSupplier.turnOff();
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
