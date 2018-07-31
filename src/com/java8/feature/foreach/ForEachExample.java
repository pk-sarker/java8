package com.java8.feature.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.lang.Integer;
import java.util.Random;

public class ForEachExample {

    public static void main(String[] args) {

        List<Integer> randomNumberList = new ArrayList<Integer>();
        Random rand = new Random();

        for(int i=1; i<6; i++) {
            randomNumberList.add(rand.nextInt());
        }

        // traversing using Iterator
        Iterator<Integer> randomItr = randomNumberList.iterator();

        while(randomItr.hasNext()) {
            Integer i = randomItr.next();
            System.out.println("Random Number: " + i);
        }

        // traversing through forEach method of Iterable with anonymous class
        randomItr.forEachRemaining(new Consumer<Integer>() {
            public void accept(Integer t) {
                System.out.println("forEach anonymous class Value::"+t);
            }
        });

        //traversing with Consumer interface implementation
        TestConsumer action = new TestConsumer();
        randomNumberList.forEach(action);
    }
}
