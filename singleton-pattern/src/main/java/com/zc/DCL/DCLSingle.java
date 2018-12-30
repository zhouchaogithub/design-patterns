package com.zc.DCL;

/**
 * 双重锁
 */
public class DCLSingle {

    private volatile static  DCLSingle instance;

    public DCLSingle(){}

    public static  DCLSingle getInstance(){
        if(instance==null){
            synchronized(DCLSingle.class){
                if(instance == null){
                    return new DCLSingle();
                }
            }
        }
        return instance;
    }

}
