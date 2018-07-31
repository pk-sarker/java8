package com.java8.feature.finterface;

public class Log implements InterfaceA {

    public void interfaceAAbstractMethod(String str) {
        System.out.println(">> Log : Interface A Abstract Method Implementation : " + str);
    }

    public void printLogs() {
        InterfaceA.staticMethodLog("Log 1");
    }
}
