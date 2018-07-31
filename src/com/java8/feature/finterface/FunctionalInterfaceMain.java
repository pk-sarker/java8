package com.java8.feature.finterface;

public class FunctionalInterfaceMain {

    public static void main(String agrs[]) {
        Log log = new Log();
        log.interfaceAAbstractMethod("Log - A");
        log.printLogs();
        log.defaultMethodLog("Log - B");
        InterfaceA.staticMethodLog("Log - C");

        Print print = new Print();
        print.interfaceAAbstractMethod("Log - D");
        print.interfaceBAbstractMethod("Log - E");
        print.defaultMethodLog("Log - F");
        print.printLogs();
        InterfaceB.staticMethodLog("Log - G");

        Console console = new Console();
        console.interfaceAAbstractMethod("Log - H");
        console.interfaceBAbstractMethod("Log - I");
        console.defaultMethodLog("Log - J");
        console.iAdefaultMethodLog();

    }
}

