package com.kren.pattern.state.impl;

import com.kren.pattern.state.Package;
import com.kren.pattern.state.State;
import com.kren.pattern.state.Package.Status;

public class OrderedState implements State {

	@Override
	public void setPreviousState(Package p) {
		throw new IllegalStateException("Package has ORDERED status");
	}

	@Override
	public void setNextState(Package p) {
		p.setState(new DeliveredState());
	}

	@Override
	public Status getStatus() {
		return Status.ORDERED;
	}
}
