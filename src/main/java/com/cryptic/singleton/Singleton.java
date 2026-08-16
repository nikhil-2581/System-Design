package com.cryptic.singleton;

public class Singleton {
    private static Singleton instance = new Singleton(); //eager loading
    // eager loading should be avoided, if object creation is very expensive for that particular class

    private Singleton() {
        System.out.println("Singleton Created");
    }

    public static Singleton getInstance() {
        return instance;
    }
}
