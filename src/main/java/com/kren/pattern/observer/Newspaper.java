package com.kren.pattern.observer;

import java.util.HashSet;
import java.util.Set;

public class Newspaper {

    private Set<Subscriber> subscribers;

    public Newspaper() {
        subscribers = new HashSet<>();
    }

    public void subsribe(Subscriber s) {
        subscribers.add(s);
    }

    public void unsubsribe(Subscriber s) {
        subscribers.remove(s);
    }

    public void releaseNewIssue(String issueNumber) {
        subscribers.forEach(s -> s.update(issueNumber));
    }
}
