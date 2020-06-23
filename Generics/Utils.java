package com.codeWithArsalon.Generics;

public class Utils {

    public static <T extends Comparable <T>> T max (T first, T second){
        return (first.compareTo(second)) < 0 ? second : first;
    }

    public static void printUser(User user){
        System.out.println(user);
    }

   //cannot read from this
    public static void printUsers(GenericList<? super User> users){
        users.add(new User(10));//all types directly or indirectly derive from Obj class

    }

    public static <K, V> void print (K key, V value){
        System.out.println(key + "=" + value);
    }
}
