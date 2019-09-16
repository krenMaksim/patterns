package com.kren.pattern.composite.product.impl;

import com.kren.pattern.composite.product.Product;

public class MobilePhone extends Product {
    private static final int PRICE = 50;

    public MobilePhone() {
        super(PRICE);
    }
}
