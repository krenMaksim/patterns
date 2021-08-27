package com.kren.pattern.observer;

class ObserverMain {

    public static void main(String[] args) {
        Newspaper theNewYorkTimes = new Newspaper();

        Subscriber one = new SubscriberOne();
        Subscriber two = new SubscriberTwo();

        theNewYorkTimes.subsribe(one);
        theNewYorkTimes.subsribe(two);

        theNewYorkTimes.releaseNewIssue("The New York Times #23");
        theNewYorkTimes.releaseNewIssue("The New York Times #25");

    }

}
