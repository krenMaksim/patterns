package com.kren.pattern.composite;

import com.kren.pattern.composite.order.Box;
import com.kren.pattern.composite.order.Order;
import com.kren.pattern.composite.product.Product;
import com.kren.pattern.composite.product.impl.MobilePhone;
import com.kren.pattern.composite.product.impl.Pen;
import com.kren.pattern.composite.product.impl.Sweet;

import java.util.ArrayList;
import java.util.List;

public class CompositeMain {

    public static void main(String[] args) {
        Box box = getBoxWithProducts();
        Order order = new Order(box);

        System.out.println("orderPrice: " + order.getOrderPrice());
    }

    private static Box getBoxWithProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new MobilePhone());
        products.add(new Pen());
        products.add(new Sweet());

        return Box.newInstanceHasOnlyProducts(products);
    }
}
