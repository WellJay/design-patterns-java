package com.kok.designpatterns.behavioral.observer;

public class MySubject extends AbstractSubject {
  
    @Override  
    public void operation() {  
        System.out.println("update self!");  
        notifyObservers();  
    }  
  
}  