package com.codeWithArsalon.Executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class ExecutorsDemo {

    public static void show() {
        var executor = Executors.newFixedThreadPool(2);

        try {
            var future = executor.submit(() -> {
                LongTask.simulate(); //simulating a long task operation
                return 1; //result of LongTask simulation
            });

            System.out.println("Do more Work");
            try {
                var result = future.get(); //blocks current thread until operation is completed
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        finally {
            executor.shutdown();
        }
    }
}
