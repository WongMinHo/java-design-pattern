package com.minhow.iterator.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : MinHow
 * 迭代器模式
 */
@Slf4j
public class IteratorPatternApplication {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        Iterator iterator = nameRepository.getIterator();
        while (iterator.hasNext()) {
            log.info((String) iterator.next());
        }

    }

}
