package com.codeWithArsalon.Collections;

import java.util.*;

public class SetDemo {
    public static void show(){

        Set<String> setOne = new HashSet<>(Arrays.asList("a", "b", "c", "c"));
        Set<String> setTwo = new HashSet<>(Arrays.asList("b", "c", "d", "f"));

        //Difference - gives items we have in first set but don't have in second set
        setOne.removeAll(setTwo);
        System.out.println(setOne);


    }
}

//         remove duplicates from a collection
//        Collection<String> collection = new ArrayList<>();
//        Collections.addAll(collection, "a", "b", "c", "c");
//        Set<String> set = new HashSet<>(collection);
//        System.out.println(set);
