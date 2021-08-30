package com.kren.pattern.singleton;

import java.util.Objects;

class LazilyCreatedWithDoubleCheckedLockingSingleton {

    private volatile static LazilyCreatedWithDoubleCheckedLockingSingleton instance;

    public static LazilyCreatedWithDoubleCheckedLockingSingleton getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (LazilyCreatedWithDoubleCheckedLockingSingleton.class) {
                if (Objects.isNull(instance)) {
                    instance = new LazilyCreatedWithDoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }

    private LazilyCreatedWithDoubleCheckedLockingSingleton() {}

}
