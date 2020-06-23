package com.codeWithArsalon.Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsDemo {

    public static void show(){
        IntStream.range(1, 5)
                .forEach(System.out::println);

    }
}
