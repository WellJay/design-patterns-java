package com.kok.designpatterns.behavioral.iterator;

/**
 * @author wenjie
 * @description
 * @time 2019/6/18 0018 10:56
 */
public interface Iterator {

    Object previous();

    Object next();

    Boolean hasNext();

    Object first();

}
