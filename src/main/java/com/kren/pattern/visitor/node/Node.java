package com.kren.pattern.visitor.node;

import com.kren.pattern.visitor.Traveler;

public abstract class Node implements Traveler {

    @Override
    public String toString() {
        return this.getClass().getName() + " geolocation data stub";
    }
}
