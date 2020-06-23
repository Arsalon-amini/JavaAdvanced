package com.codeWithArsalon.Lambdas;

import java.util.function.*;

public class LambdasDemo {

    public LambdasDemo(String message) {
    }

    public LambdasDemo() {
    }

    public static void print(String message){
        System.out.println("Static method");
    }

    public void printAnother(String message){
        System.out.println("Instance Method");
    }

    public void show(){
        UnaryOperator<Integer> square = n -> n * n; //small function
        UnaryOperator<Integer> increment = n -> n + 1; //small function

        var result = increment.andThen(square).apply(1);
        System.out.println(result);
    }


    public static void greet(Printer printer){
        printer.print("Hello World");
    }

    public void methodLambdas(){
        greet(message -> new LambdasDemo(message)); //regular lambda -> passing parameter to constructor
        greet(LambdasDemo::new); //method reference passing parameter to constructor method using new keyword

        greet(message -> print(message)); //regular lambda -> passing parameter to existing static method
        greet(LambdasDemo::print); //Class w/ static method :: static method w/o ( )

        greet(message -> printAnother(message));//regular lambda -> passing parameter to existing instance method
        var demo = new LambdasDemo();
        greet(demo::printAnother); //Object w/ method : : method name w/o ( )
    }
}



