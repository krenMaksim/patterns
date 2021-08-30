package com.kren.pattern.singleton;

import java.util.Objects;

class ReflectionAccessProtectedSingleton { // it is thread safe as well

    private static final ReflectionAccessProtectedSingleton INSTANCE = new ReflectionAccessProtectedSingleton();

    public static final ReflectionAccessProtectedSingleton getInstance() {
        return INSTANCE;
    }

    private ReflectionAccessProtectedSingleton() {
        if (Objects.nonNull(INSTANCE)) throw new AssertionError();
    }
    
}
