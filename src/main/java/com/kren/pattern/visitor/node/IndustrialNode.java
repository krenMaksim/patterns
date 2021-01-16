package com.kren.pattern.visitor.node;

import com.kren.pattern.visitor.exporter.Shipper;

public class IndustrialNode extends Node {

    @Override
    public void moveDataBy(Shipper shipper) {
        shipper.exportData(this);
    }
}
