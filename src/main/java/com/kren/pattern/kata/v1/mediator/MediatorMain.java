package com.kren.pattern.kata.v1.mediator;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

class MediatorMain {

    public static void main(String[] args) {

        // The problem here is how to make Fan not to depend PowerSupplier and Button not to depend Fan

        PowerSupplier powerSupplier = new PowerSupplier();
        Mediator mediator = new Mediator(powerSupplier);
        Fan fan = new Fan(mediator);
        mediator.setFan(fan);

        Button button = new Button(mediator);

        button.press();
        button.press();
        button.press();
        button.press();
    }

    @RequiredArgsConstructor
    private static class Mediator {

        private Fan fan;
        private final PowerSupplier powerSupplier;

        public void powerSupplierTurnOn() {
            powerSupplier.turnOn();
        }

        public void powerSupplierTurnOff() {
            powerSupplier.turnOff();
        }

        public void press() {
            if (fan.isOn()) {
                fan.turnOff();
            } else {
                fan.turnOn();
            }
        }

        public void setFan(Fan fan) {
            Optional.ofNullable(this.fan)
                    .ifPresentOrElse(f -> {
                        throw new IllegalStateException("Fan value has been set");
                    }, () -> this.fan = fan);
        }
    }

    // it looks a bit strange that Button has Fan.
    @RequiredArgsConstructor
    private static class Button {

        private final Mediator mediator;

        public void press() {
            mediator.press();
        }
    }

    @Getter
    @RequiredArgsConstructor
    private static class Fan {

        private final Mediator mediator;
        private boolean isOn = false;

        public void turnOn() {
            mediator.powerSupplierTurnOn();
            isOn = true;
        }

        public void turnOff() {
            isOn = false;
            mediator.powerSupplierTurnOff();
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
