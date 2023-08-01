package com.kren.pattern.rev26072023.mediator;

class MainSolution {

    public static void main(String[] args) {
        Controller controller = new Controller();
        Button button = new Button(controller);
        PowerSupplier powerSupplier = new PowerSupplier(controller);
        controller.add(button);
        controller.add(powerSupplier);
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

        private Button button;
        private PowerSupplier powerSupplier;

        public void add(Button button) {
            this.button = button;
        }

        public void add(PowerSupplier powerSupplier) {
            this.powerSupplier = powerSupplier;
        }

        public boolean isButtonOn() {
            return button.isOn();
        }

        public boolean isPowerSupplierOn() {
            return powerSupplier.isOn();
        }

        public void clickButton() {
            button.click();
        }

        public void powerSupplierOff() {
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
            return controller.isButtonOn();
        }
    }

    static class Button {

        private boolean isOn;
        private final Controller controller;

        public Button(Controller controller) {
            this.isOn = false;
            this.controller = controller;
        }

        public void click() {
            if (controller.isPowerSupplierOn()) {
                isOn = !isOn;
            }
        }

        public boolean isOn() {
            return isOn;
        }

    }

    static class PowerSupplier {

        private boolean isOn;
        private final Controller controller;

        public PowerSupplier(Controller controller) {
            this.isOn = false;
            this.controller = controller;
        }

        public void turnOn() {
            isOn = true;
        }

        public void turnOff() {
            if (controller.isButtonOn()) {
                controller.clickButton();
            }
            isOn = false;
        }

        public boolean isOn() {
            return isOn;
        }

    }

}
