package com.company;

public class Main {
    static Greetings greetings;

    public static void main(String[] args) {
        Greetings lambdaGreet = (int i,int j) -> i+j;
        System.out.println(lambdaGreet.greet2(60 , 50));
        StringLength length = (s) -> s.length();
        System.out.println(length.getLength("Aman"));
        printLambda(length);
        RunnableExample example = new RunnableExample();
        example.printRunnable();
    }
    public static void printLambda(StringLength length){ // type inference
        System.out.println(length.getLength("AmanKumar"));
    }
    interface Greetings{
        int greet2(int i,int j);
    }
}
