package com.company.Exercise1;

import java.util.Arrays;

import java.util.List;

public class Unit1Exercise {

    public void display(){
        List<Persons> persons = Arrays.asList(
                new Persons(50,"Nigga" , "Mishra"),
                new Persons(40 , "KK" , "Sharma"),
                new Persons(30 , "Soumyajeet" , "Majumdar"),
                new Persons(20 , "Aman" , "Kumar")
        );

        LambdasWok values = (personsToBePrinted) -> {
            for (Persons p : personsToBePrinted)
            System.out.println(p.toString());
        };

        persons.sort((p1, p2) -> p1.getLast_name().compareTo(p2.getLast_name()));
        values.printEverything(persons);



    }
}
