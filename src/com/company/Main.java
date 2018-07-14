package com.company;

public class Main {
    static Greetings greetings;

    public static void main(String[] args) {
        Greetings lambdaGreet = (int i,int j) -> {
            int k = 50;
            return i*k+j;
        };
        System.out.println(lambdaGreet.greet2(60 , 50));
    }

    interface Greetings{
        int greet2(int i,int j);
    }
}
