package com.codeWithArsalon.Concurrency;

public class FileDownloadTask implements Runnable {

    private DownloadStatus status;

    public FileDownloadTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a file: " + Thread.currentThread().getName());

        for (var i = 0; i < 1_000_000; i++){
            if(Thread.currentThread().isInterrupted()) return;
            status.incrementTotalBytes();
        }

        status.done();
        System.out.println("Download Complete" + Thread.currentThread().getName());

    }

    public DownloadStatus getStatus() {
        return status;
    }
}
