package com.kok.designpatterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wenjie
 * @description
 * @time 2019/6/14 0014 16:42
 */
@Getter
@Setter
public class Teacher implements Cloneable {

    private String name;

    private Integer age;

    /**
     * 浅拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
