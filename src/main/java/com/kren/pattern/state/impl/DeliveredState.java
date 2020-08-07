package com.kren.pattern.state.impl;

import com.kren.pattern.state.Package;
import com.kren.pattern.state.Package.Status;
import com.kren.pattern.state.State;

public class DeliveredState implements State {

	@Override
	public void setPreviousState(Package p) {
		p.setState(new OrderedState());
	}

	@Override
	public void setNextState(Package p) {
		p.setState(new ReceivedState());
	}

	@Override
	public Status getStatus() {
		return Status.DELIVERED;
	}
}
