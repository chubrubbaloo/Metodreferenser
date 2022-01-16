package com.company;

import java.lang.reflect.Constructor;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

class Person {
    private final String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }
}

public class Main {

    public static void main(String[] args) {

        // #1: Vi har ett element som vi applicerar en metod på för att korta ner koden.
        // Om det är en passthrough lambda kan vi oftast omvandla den till en metodreferens.


        // # 2:
        Function<Integer, Integer> addTwo = x -> Integer.sum(x, 2); // Två argument kommer ej att gå.
        Function<Double, Double> squirted = x -> Math.sqrt(x);
        Function<Double, Double> squirtedMR = Math::sqrt; // Funkar.
        Function<Integer, String> intToUpperString = x -> x.toString().toUpperCase(); // Kommer ej att gå.


        // # 3:
        Function<String, String> stringToUpperCase = str -> str.toUpperCase();
        Function<String, String> stringToUpperCaseMR = String::toUpperCase;
        Consumer<String> printMe = str -> System.out.println(str);
        Consumer<String> printMeMR = System.out::println;
        Function<String, Person> getPerson = Person::new;
        Function<String, Integer> intValueOfStr = str -> Integer.valueOf(str);
        Function<String, Integer> intValueOfStrMR = Integer::valueOf;



        // # 4:
        Function<String, Integer> countCharacters = str -> str.length();
        Function<Person, String> getName = person -> person.getName();
        Function<Double, Double> squareMe = x -> Math.sqrt(x);
        Consumer<String> printMeToo = str -> System.out.println(str);


        // # 5:
        BiFunction<Integer, Integer, Integer> sum = Integer::sum;

        // Nivå 2:
        Function<Integer, String> intToString = Object::toString; /* Blir tvetydligt om du inte använder dig utav
         Intager istället för x och därför översätts lambda uttrycket till metodreferensen Object::toString;*/







    }
}
