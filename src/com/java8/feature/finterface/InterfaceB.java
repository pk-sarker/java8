package com.java8.feature.finterface;

@FunctionalInterface
public interface InterfaceB {
    void interfaceBAbstractMethod(String str);

    default void defaultMethodLog(String logStr) {
        System.out.println(">> Interface B : Default : Log: " + logStr);
    }

    static void staticMethodLog(String logStr) {
        System.out.println(">> Interface B : Static : Log: " + logStr);
    }
}
