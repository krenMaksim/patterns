package com.kren.pattern.singleton;

import java.util.Objects;

class ClassicSingleton {

    private static ClassicSingleton instance;

    public static ClassicSingleton getInstance() {
        if (Objects.isNull(instance)) {
            instance = new ClassicSingleton();
        }
        return instance;
    }

    private ClassicSingleton() {}

}
