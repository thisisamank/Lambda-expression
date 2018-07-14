package com.company;

public class RunnableExample {
    void printRunnable(){
        Thread thread = new Thread(() -> System.out.println("its inside Runnable"));
        thread.run();
    }
}
