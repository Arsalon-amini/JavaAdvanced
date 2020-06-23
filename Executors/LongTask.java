package com.codeWithArsalon.Executors;

public class LongTask {
    public static void simulate(){
        try {
            Thread.sleep(3000); //put current thread to sleep for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void simulate(int delay){
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
