package org.example.Streams;

import java.util.List;
import java.util.function.Function;

public class FlatMap {
    public static void main(String[] args) {
        /*
        Exercise 1: Flatten a List of Words from Sentences
        Task:
        You are given a list of sentences. Extract all the words from these sentences into a single list.
        Input:
        List<String> sentences = List.of("Hello World", "Java Streams are powerful", "Practice makes perfect");
        Expected Output:
        [Hello, World, Java, Streams, are, powerful, Practice, makes, perfect]
         */

        List<String> sentences = List.of("Hello World", "Java Streams are powerful", "Practice makes perfect");
        sentences.stream()
                .flatMap(sentence -> List.of(sentence.split(" "))
                        .stream())
                .toList();

        /*
        Exercise 2: Combine Two Lists of Pairs
        Task:
        You are given two lists of numbers. Create all possible pairs (combinations) of numbers, with one number taken from each list.
        Input:
        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(4, 5);
        Expected Output:
        [(1, 4), (1, 5), (2, 4), (2, 5), (3, 4), (3, 5)]
         */
        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(4, 5);

        List<String> pairs = list1.stream()
                .flatMap(num1 -> list2.stream()
                        .map(num2 -> "(" + num1 + ", " + num2 + ")"))
                .toList();
    }
}
