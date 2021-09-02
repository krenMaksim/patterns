package com.kren.pattern.state;

import com.kren.pattern.state.Package.Status;

class ReceivedState implements State {

    @Override
    public void setPreviousState(Package p) {
        p.setState(new DeliveredState());
    }

    @Override
    public void setNextState(Package p) {
        throw new IllegalStateException("Package has RECEIVED status");
    }

    @Override
    public Status getStatus() {
        return Status.RECEIVED;
    }
}
