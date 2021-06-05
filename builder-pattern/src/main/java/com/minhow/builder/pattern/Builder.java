package com.minhow.builder.pattern;

/**
 * @author : MinHow
 *
 */
abstract class Builder {
    public abstract void setPart(String name, String type);

    public abstract Product getProduct();
}
