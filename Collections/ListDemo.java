package com.codeWithArsalon.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show(){
        List<String> list = new ArrayList<>(); //programming against List interface using ArrayList implementation
        Collections.addAll(list, "A", "b", "c", "d", "a");
        list.set(0, "a+"); //update element in collection at index
        list.remove(0); //remove element in collection by index
        list.subList(0, 2); //pass from and to, indexes returns objects between 0 (inclusive) and 2 (exclusive) in collection
        list.lastIndexOf("a"); //returns index of last occurence of element in collection
    }
}
