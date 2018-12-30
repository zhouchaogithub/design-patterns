package com.zc.lazy;

/**
 * 懒汉式单例模式/线程安全
 */
public class LazySingleSafe {
    private static LazySingleSafe instance;

    private LazySingleSafe(){}

    public static synchronized LazySingleSafe getInstance() {
        if (instance==null){
            return new LazySingleSafe();
        }
        return instance;
    }
}
