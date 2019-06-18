package com.kok.designpatterns.behavioral.iterator;

/**
 * @author wenjie
 * @description
 * @time 2019/6/18 0018 10:57
 */
public class MyCollection implements Collection {

    private String[] arr = {"1", "2", "3", "4", "5"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        if (i >= arr.length) {
            throw new IndexOutOfBoundsException("数组下标越界");
        }
        return arr[i];
    }

    @Override
    public Integer size() {
        return arr.length;
    }
}
