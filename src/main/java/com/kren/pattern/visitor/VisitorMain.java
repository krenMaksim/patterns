package com.kren.pattern.visitor;

import com.kren.pattern.visitor.exporter.Shipper;
import com.kren.pattern.visitor.exporter.XmlExporter;
import com.kren.pattern.visitor.node.CommercialNode;
import com.kren.pattern.visitor.node.IndustrialNode;
import com.kren.pattern.visitor.node.Node;
import com.kren.pattern.visitor.node.ResidentialNode;

import java.util.List;

class VisitorMain {

    public static void main(String[] args) {
        List<Node> nodes = List.of(new CommercialNode(), new IndustrialNode(), new ResidentialNode());
        Shipper exporter = new XmlExporter();

        nodes.forEach(node -> node.moveDataBy(exporter));
    }
}
