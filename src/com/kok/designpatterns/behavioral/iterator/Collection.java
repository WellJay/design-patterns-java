package com.kok.designpatterns.behavioral.iterator;

/**
 * @author wenjie
 * @description
 * @time 2019/6/18 0018 10:57
 */
public interface Collection {

    Iterator iterator();

    Object get(int i);

    Integer size();

}
