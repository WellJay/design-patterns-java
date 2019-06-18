package com.kok.designpatterns.behavioral.iterator;

/**
 * @author wenjie
 * @description
 * @time 2019/6/18 0018 11:03
 */
public class Test {

    public static void main(String[] args) {
        MyCollection myCollection = new MyCollection();

        Iterator iterator = myCollection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
