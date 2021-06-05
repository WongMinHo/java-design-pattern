package com.minhow.iterator.pattern;

/**
 * @author : MinHow
 */
public class NameRepository implements Container {
    private String names[] = {"MinHow", "Julie", "MinHow1", "MinHow3"};

    public Iterator getIterator() {
        return new NameIterator(names);
    }
}
