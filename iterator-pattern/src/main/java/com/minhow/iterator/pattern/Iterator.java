package com.minhow.iterator.pattern;

/**
 * @author : MinHow
 *
 */
public interface Iterator {
    //遍历到下一个元素
    Object next();
    //是否已经遍历到尾部
    boolean hasNext();
}
