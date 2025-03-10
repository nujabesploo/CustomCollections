package com.pluralsight.collection;

import java.time.LocalDate;

/**
 * Main class demonstrating the usage of a generic FixedList with different data
 * types.
 */
public class Main {
    public static void main(String[] args) {

        // Create and populate a FixedList of Integers
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        System.out.println("Numbers list size after adding 3 items: " + numbers.getItems().size());

        // Create and populate a FixedList of LocalDate objects
        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        // Fixed: Print the size of dates list instead of numbers
        System.out.println("Dates list size after adding 2 items: " + dates.getItems().size());

        // Create and populate a FixedList of Strings
        FixedList<String> names = new FixedList<>(2);
        names.add("John");
        names.add("Jane");
        // Fixed: Print the size of names list instead of numbers
        System.out.println("Names list size after adding 2 items: " + names.getItems().size());

        // Create and populate a FixedList of Doubles
        FixedList<Double> doubles = new FixedList<>(2);
        doubles.add(1.0);
        doubles.add(2.0);
        // Fixed: Print the size of doubles list instead of numbers
        System.out.println("Doubles list size after adding 2 items: " + doubles.getItems().size());

        // Create and populate a FixedList of Booleans
        FixedList<Boolean> booleans = new FixedList<>(2);
        booleans.add(true);
        booleans.add(false);
        // Fixed: Print the size of booleans list instead of numbers
        System.out.println("Booleans list size after adding 2 items: " + booleans.getItems().size());

        // Try adding a third element to a fixed list with capacity 2
        try {
            names.add("Alice"); // This should fail as the capacity is 2
        } catch (IllegalStateException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }
    }
}