package com.codeWithArsalon.Concurrency;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;

public class ThreadDemo {

    public static void show() {
        var executor = Executors.newFixedThreadPool(2);

        try {
            var future = executor.submit(() -> {
                System.out.println(Thread.currentThread().getName());
                return 1; //represents a callable .call lambda
            });
        }
        finally {
        executor.shutdown();
        }
    }
}


