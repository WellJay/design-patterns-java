package com.kok.designpatterns.behavioral.observer;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class AbstractSubject implements Subject {
  
    private List<Observer> observerList = new CopyOnWriteArrayList<Observer>();
    @Override  
    public void add(Observer observer) {
        observerList.add(observer);
    }  
  
    @Override  
    public void del(Observer observer) {
        observerList.remove(observer);
    }  
  
    @Override  
    public void notifyObservers() {
        Iterator<Observer> iterator = observerList.iterator();
        while(iterator.hasNext()){
            iterator.next().update();
        }
    }  
}  