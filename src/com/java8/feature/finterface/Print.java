package com.java8.feature.finterface;

public class Print implements InterfaceA, InterfaceB {

    public void interfaceAAbstractMethod(String str) {
        System.out.println(">> Print: Interface A Abstract Method Implementation : " + str);
    }

    public void interfaceBAbstractMethod(String str) {
        System.out.println(">> Print : Interface B Abstract Method Implementation : " + str);
    }

    public void defaultMethodLog(String str) {
        System.out.println(">> Print : " + str);
    }

    public void printLogs() {
        InterfaceA.staticMethodLog("Log 1");
        InterfaceA.staticMethodLog("Log 2");
    }
}
