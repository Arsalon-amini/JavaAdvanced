package com.codeWithArsalon.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "A", "B", "C", "D");

        Collection<String> other = new ArrayList<>();
        other.addAll(collection);

        System.out.println(collection.equals(other));

    }
}
