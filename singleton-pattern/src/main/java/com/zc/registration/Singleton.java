package com.zc.registration;

public class Singleton {
    private static class SingletonHolfer{
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton(){}

    public static final Singleton getInstance(){
        return SingletonHolfer.INSTANCE;
    }
}
