package com.java8.feature.foreach;

import java.util.function.Consumer;

public class TestConsumer implements Consumer<Integer> {

    public void accept(Integer t) {
        System.out.println("Consumer implementation Value::"+t);
    }
}
