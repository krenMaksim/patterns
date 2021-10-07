package com.kren.pattern.kata.v1.mediator;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

class MediatorMainProblem {

    public static void main(String[] args) {

        PowerSupplier powerSupplier = new PowerSupplier();

        // Button button = new Button(fan); here is a probelm which makes allocating setter
        Button button = new Button();

        Fan fan = new Fan(button, powerSupplier);

        button.setFan(fan);

    }

    @Setter
    @RequiredArgsConstructor
    private static class Button {

        private Fan fan;

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

        private final Button button;
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
