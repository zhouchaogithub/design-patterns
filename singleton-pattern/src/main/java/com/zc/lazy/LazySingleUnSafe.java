package com.zc.lazy;

/**
 * 线程不安全的单例模式
 */
public class LazySingleUnSafe {

    private static LazySingleUnSafe instance;

    private LazySingleUnSafe(){}

    public static LazySingleUnSafe getInstance(){
        if (instance==null){
            return new LazySingleUnSafe();
        }
        return instance;
    }
}
