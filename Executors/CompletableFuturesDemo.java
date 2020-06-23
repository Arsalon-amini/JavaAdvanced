package com.codeWithArsalon.Executors;
import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;


public class CompletableFuturesDemo {

    public static void show(){
        var start = LocalTime.now();

        var service = new FlightService();
        var futures = service.getQuotes() //returns stream of CompletableFuture<Quote>
                .map(future -> future.thenAccept(System.out::println))
                .collect(Collectors.toList()); //returns a list of CompletableFuture<Quote>

        CompletableFuture
                .allOf(futures.toArray(new CompletableFuture[0])) //telling method to return CompletableFuture Array
        .thenRun(() -> {
            var end = LocalTime.now();
            var duration = Duration.between(start, end);
            System.out.println("Retrieved all quotes in " + duration.toMillis() + " m sec");
        });

        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
