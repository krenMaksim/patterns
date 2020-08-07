package com.kren.pattern.state;

import com.kren.pattern.state.Package.Status;

public interface State {
	void setPreviousState(Package p);
	void setNextState(Package p);
	Status getStatus();
}
