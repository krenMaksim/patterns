package com.kren.pattern.visitor;

import com.kren.pattern.visitor.exporter.Shipper;

public interface Traveler {
    void moveDataBy(Shipper shipper);
}
