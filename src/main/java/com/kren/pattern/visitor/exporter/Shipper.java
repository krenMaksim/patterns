package com.kren.pattern.visitor.exporter;

import com.kren.pattern.visitor.node.CommercialNode;
import com.kren.pattern.visitor.node.IndustrialNode;
import com.kren.pattern.visitor.node.ResidentialNode;


public interface Shipper { // Visitor abstraction!

    void exportData(CommercialNode node);
    void exportData(IndustrialNode node);
    void exportData(ResidentialNode node);
}
