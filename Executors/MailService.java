package com.codeWithArsalon.Executors;

import java.util.concurrent.CompletableFuture;

public class MailService {
    public void send(){
        LongTask.simulate(); //accessing files or network is long, don't use Main thread
        System.out.println("Mail was sent");
    }

    public CompletableFuture<Void> sendAsynch(){
        return CompletableFuture.runAsync(() -> send()); //starting the task on a separate thread
    }
}
