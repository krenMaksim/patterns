package com.kren.pattern.rev26072023.mediator;

class MainProblem {

    public static void main(String[] args) {
        Fan fan = new Fan(new Button(), new PowerSupplier());

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
            return button.isOn() && powerSupplier.isOn();
        }
    }

    static class Button {

        private boolean isOn = false;

        public void click() {
            isOn = !isOn;
        }

        public boolean isOn() {
            return isOn;
        }

    }

    static class PowerSupplier {

        private boolean isOn = false;

        public void turnOn() {
            isOn = true;
        }

        public void turnOff() {
            isOn = false;
        }

        public boolean isOn() {
            return isOn;
        }

    }

}
