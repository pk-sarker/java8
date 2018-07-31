package com.java8.feature.finterface;

public interface InterfaceC extends InterfaceA, InterfaceB {

    default void defaultMethodLog(String logStr) {
        System.out.println(">> Interface C : Default : Log: " + logStr);
    }

    default void iAdefaultMethodLog() {
        InterfaceA.staticMethodLog("Interface C : Static : Log :");
    }
    static void staticMethodLog(String logStr) {
        System.out.println(">> Interface C : Static : Log: " + logStr);
    }
}
