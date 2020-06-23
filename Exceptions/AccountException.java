package com.codeWithArsalon.Exceptions;

public class AccountException extends Exception {
    public AccountException(Exception cause) {
        super(cause); //constructor is overloaded, we can pass this object
    }
}
