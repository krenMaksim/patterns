package com.kren.pattern.rev26072023.mediator;

class MainSolution2 {

    public static void main(String[] args) {
        Controller controller = new Controller(new Button(), new PowerSupplier());
        Fan fan = new Fan(controller);

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

    static class Controller {

        private final Button button;
        private final PowerSupplier powerSupplier;

        public Controller(Button button, PowerSupplier powerSupplier) {
            this.button = button;
            this.powerSupplier = powerSupplier;
        }

        public boolean isButtonOn() {
            return button.isOn();
        }

        public boolean isPowerSupplierOn() {
            return powerSupplier.isOn();
        }

        public void clickButton() {
            if (powerSupplier.isOn()) {
                button.click();
            } else {
                if (button.isOn()) {
                    button.click();
                }
            }
        }

        public void powerSupplierOff() {
            if (button.isOn()) {
                button.click();
            }
            powerSupplier.turnOff();
        }

        public void powerSupplierOn() {
            powerSupplier.turnOn();
        }

    }

    static class Fan {

        private final Controller controller;

        public Fan(Controller controller) {
            this.controller = controller;
        }

        public void clickButton() {
            controller.clickButton();
        }

        public void powerOff() {
            controller.powerSupplierOff();
        }

        public void powerOn() {
            controller.powerSupplierOn();
        }

        public boolean isOn() {
            return controller.isButtonOn() && controller.isPowerSupplierOn();
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
