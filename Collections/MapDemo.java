package com.codeWithArsalon.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show(){

        var customerOne = new Customer("a", "email 1");
        var customerTwo = new Customer("b", "email 2");

        Map<String, Customer> map = new HashMap<>();
        map.put(customerOne.getEmail(), customerOne);
        map.put(customerTwo.getEmail(), customerTwo);

        var customerDemo = map.get("e1");
        System.out.println(customerDemo);

        var unknown = new Customer("Unknown", "");
        map.getOrDefault("email 10", unknown); //get customer at email ten or return default value (unknown custmr)
        var exists = map.containsKey("email 2"); //returns a boolean

        var customerUpdate = map.replace("email 1", new Customer("a++", "email 1")); //updates a value for given key

        //find items in a map (NOT iterable by itself)
        for (var key : map.keySet()) //returns list of keys in map and it's iterable!
            System.out.println(key);

        for (var entry : map.entrySet()) //returns a Set of Entry<String, Customer>, iterable, each iteration get entry
            System.out.println(entry.getValue()); //access value or key from entry

        for (var customer : map.values()) //returns collection of customers
            System.out.println(customer);
    }
}
