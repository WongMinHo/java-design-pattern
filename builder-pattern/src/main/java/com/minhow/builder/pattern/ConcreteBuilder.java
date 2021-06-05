package com.minhow.builder.pattern;

/**
 * @author : MinHow
 *
 */
public class ConcreteBuilder extends Builder {
    private Product product = new Product();
    public Product getProduct() {
        return product;
    }
    public void setPart(String name, String type) {
        this.product.setName(name);
        this.product.setType(type);
    }
}
