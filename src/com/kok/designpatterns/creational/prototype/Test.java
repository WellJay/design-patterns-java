package com.kok.designpatterns.creational.prototype;

/**
 * @author wenjie
 * @description
 * @time 2019/6/14 0014 16:43
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher teacher = new Teacher();
        teacher.setName("jax");
        teacher.setAge(25);

        Teacher teacherClone = (Teacher) teacher.clone();
        Integer age = teacherClone.getAge();
        System.out.println(age);
    }

}
