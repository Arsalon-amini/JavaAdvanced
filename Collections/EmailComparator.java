package com.codeWithArsalon.Collections;

import java.util.Comparator;

public class EmailComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer customerOne, Customer CustomerTwo) {
        return customerOne.getEmail().toLowerCase().compareTo(CustomerTwo.getEmail().toLowerCase()); //.getEmail( ) returns string, uses String .compareTo method
    }
}
