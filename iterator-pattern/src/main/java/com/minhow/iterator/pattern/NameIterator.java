package com.minhow.iterator.pattern;

/**
 * @author : MinHow
 */
public class NameIterator implements Iterator {
    private String[] names;
    private int index = 0;

    public NameIterator(String[] names) {
        this.names = names;
    }

    public Object next() {
        if (this.hasNext()) {
            return names[index++];
        }
        return null;
    }

    public boolean hasNext() {
        if (index < names.length) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
