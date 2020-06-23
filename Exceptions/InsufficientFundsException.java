package com.codeWithArsalon.Exceptions;

//Checked -> extend Exception class
//Unchecked (runtime) -> extend RuntimeException

public class InsufficientFundsException extends Exception {

    public InsufficientFundsException() {
        super("Insufficient funds in your account."); //if nothing passed, show this message
    }

    public InsufficientFundsException(String message) {
        super(message); //custom message supplied used
    }
}
