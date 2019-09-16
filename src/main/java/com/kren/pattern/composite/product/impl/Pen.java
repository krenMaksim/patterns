package com.kren.pattern.composite.product.impl;

import com.kren.pattern.composite.product.Product;

public class Pen extends Product {
    private static final int PRICE = 1;

    public Pen() {
        super(PRICE);
    }
}
