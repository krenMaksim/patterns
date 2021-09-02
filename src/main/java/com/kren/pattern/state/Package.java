package com.kren.pattern.state;

class Package {

    private State state;

    public Package() {
        state = new OrderedState();
    }

    public void previousState() {
        state.setPreviousState(this);
    }

    public void nextState() {
        state.setNextState(this);
    }

    public void printStatus() {
        System.out.println("Package Status: " + state.getStatus());
    }

    public void setState(State state) {
        this.state = state;
    }

    public static enum Status {
        ORDERED, DELIVERED, RECEIVED
    }
}
