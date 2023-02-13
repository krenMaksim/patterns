package com.kren.pattern.visitor.insurance.building;

import com.kren.pattern.visitor.insurance.BuildingVisitor;

public class CoffeeShop implements Building {

    @Override
    public void host(BuildingVisitor visitor) {
        visitor.visitCoffeeShop();
    }

}
