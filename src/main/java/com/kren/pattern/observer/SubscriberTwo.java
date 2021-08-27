package com.kren.pattern.observer;

class SubscriberTwo implements Subscriber {

    @Override
    public void update(String issueNumber) {
        System.out.println(String.format("%s has recieved %s", this.getClass().getName(), issueNumber));
    }

}
