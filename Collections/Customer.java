package com.codeWithArsalon.Collections;

public class Customer implements Comparable<Customer>{
    private String name;
    private String email;

    public Customer(String name, String email)  {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Customer other) {
        return name.compareTo(other.name); //String class has .compareTo which compares based on lexicographically (ABC series)
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
