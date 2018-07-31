package com.java8.feature.finterface;

import java.util.function.*;

@FunctionalInterface
public interface InterfaceA {

    void interfaceAAbstractMethod(String str);

    default void defaultMethodLog(String logStr) {
        System.out.println(">> Interface A : Default : Log: " + logStr);
    }

    static void staticMethodLog(String logStr) {
        System.out.println(">> Interface A : Static : Log: " + logStr);
    }
}