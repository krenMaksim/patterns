package com.kren.pattern.visitor.insurance.building;

import com.kren.pattern.visitor.insurance.BuildingVisitor;

public interface Building {

    void host(BuildingVisitor visitor);
}
