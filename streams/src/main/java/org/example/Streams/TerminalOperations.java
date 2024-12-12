package org.example.Streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperations {
    public static void main(String[] args) {

        Collection<String> strings =
                List.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");

        // Count method
        Long count = strings.stream().count();
        System.out.println("Number of elements in the list: " + count);
        // For each
        strings.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
        //Collecting elements in an mutable ArrayList
        List<String> arrayList = strings.stream().collect(Collectors.toList());
        // or in immutable
        List<String> arrayList2 = strings.stream().toList(); // we cant modify this list
        // Collecting elements in the sized ArrayList
        List<String> sizedArrayList = strings.stream().collect(Collectors.toCollection(() -> new ArrayList<>(100)));

    }
}
