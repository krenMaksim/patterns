package com.kren.pattern.visitor.insurance;

import com.kren.pattern.visitor.insurance.agent.InsuranceAgent;
import com.kren.pattern.visitor.insurance.building.Bank;
import com.kren.pattern.visitor.insurance.building.Building;
import com.kren.pattern.visitor.insurance.building.CoffeeShop;
import com.kren.pattern.visitor.insurance.building.Hospital;

class Main {

    public static void main(String[] args) {
        BuildingVisitor insuranceAgent = new InsuranceAgent();

        Building bank = new Bank();
        bank.hostVisitor(insuranceAgent);

        Building coffeeShop = new CoffeeShop();
        coffeeShop.hostVisitor(insuranceAgent);

        Building hospital = new Hospital();
        hospital.hostVisitor(insuranceAgent);
    }

}
