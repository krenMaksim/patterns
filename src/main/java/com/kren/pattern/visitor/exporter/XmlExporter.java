package com.kren.pattern.visitor.exporter;

import com.kren.pattern.visitor.node.CommercialNode;
import com.kren.pattern.visitor.node.IndustrialNode;
import com.kren.pattern.visitor.node.ResidentialNode;

public class XmlExporter implements Shipper {

    @Override
    public void exportData(CommercialNode node) {
        System.out.println("Export to Xml CommercialNode " + node);
    }

    @Override
    public void exportData(IndustrialNode node) {
        System.out.println("Export to Xml IndustrialNode " + node);
    }

    @Override
    public void exportData(ResidentialNode node) {
        System.out.println("Export to Xml ResidentialNode " + node);
    }
}
