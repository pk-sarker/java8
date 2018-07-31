package com.java8.feature.finterface;

public class Console implements InterfaceC {

    public void interfaceAAbstractMethod(String str) {
        System.out.println(">> Console : Interface A Abstract Method Implementation : " + str);
    }

    public void interfaceBAbstractMethod(String str) {
        System.out.println(">> Console : Interface B Abstract Method Implementation: " + str);
    }
}
