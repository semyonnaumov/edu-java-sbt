package com.sberbank;

public class Test<T> {
    private T param;


    public Test(T param) {
        this.param = param;
    }

    public T getParam() {
        return param;
    }
}
