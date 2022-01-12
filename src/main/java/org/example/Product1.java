package org.example;

public class Product1 extends Product {
    public Product1(int id, double price, String productName) {
        super(id, price, productName);
    }

    @Override
    String examine() {
        return null;
    }

    @Override
    String use() {
        return null;
    }
}
