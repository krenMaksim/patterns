package com.kren.pattern.visitor.insurance.building;

import com.kren.pattern.visitor.insurance.BuildingVisitor;

public class Hospital implements Building {

    @Override
    public void host(BuildingVisitor visitor) {
        visitor.visitHospital();
    }

}
