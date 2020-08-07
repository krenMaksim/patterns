package com.kren.pattern.state.problem;

public class PackageNaiveImpl {

	private Status status;

	public PackageNaiveImpl() {
		status = Status.ORDERED;
	}

	public void previousState() {
		switch (status) {
			case ORDERED:
				throw new IllegalStateException("Package has ORDERED status");
			case DELIVERED:
				status = Status.ORDERED;
				break;
			case RECEIVED:
				status = Status.DELIVERED;
		}
	}

	public void nextState() {
		switch (status) {
			case ORDERED:
				status = Status.DELIVERED;
				break;
			case DELIVERED:
				status = Status.RECEIVED;
				break;
			case RECEIVED:
				throw new IllegalStateException("Package has RECEIVED status");
		}
	}

	public void printStatus() {
		System.out.println("Package Status: " + status);
	}

	private static enum Status {
		ORDERED, DELIVERED, RECEIVED
	}
}
