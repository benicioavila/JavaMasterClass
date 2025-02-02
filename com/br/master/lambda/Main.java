package com.br.master.lambda;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Main {

    record Person (String firstName, String lastName){

        @Override
        public String toString(){
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Main.Person("Benicio", "Avila"),
                new Person("Maria", "Feitosa")
        ));

        //Using anonymou class
        var comparatorLasName = new Comparator<Person>(){
                public int compare(Person o1, Person o2){
                    return o1.lastName().compareTo(o2.lastName);
                }
        };

        people.sort(comparatorLasName);

        people.sort( new Comparator<Person>(){
            public int compare(Person o1, Person o2){
                return o1.lastName().compareTo(o2.lastName);
            }
        });

        people.sort((o1, o2) -> o1.lastName().compareTo(o2.lastName));

        System.out.println(people);

    }
}

