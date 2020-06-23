package com.codeWithArsalon.Collections;


import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {

    public static void show(){
        Queue<String> queue = new ArrayDeque<>();

        queue.add("c");
        queue.add("a");
        queue.add("d");
        queue.offer("d"); //if queue has a limited size, .add throws exception, .offer returns false
        var front = queue.remove(); //removes item at front, throws exception if .isEmpty
        System.out.println(front);
        var frontTwo = queue.poll(); //removes item at front, returns null if .isEmpty


    }
}
