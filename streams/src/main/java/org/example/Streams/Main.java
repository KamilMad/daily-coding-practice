package org.example.Streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers;
        List<String> words;
        /*
        Exercise 1: Filter and Collect
        Task:
        Given a list of integers, filter out all the even numbers and collect the remaining odd numbers into a new list.
        Input:
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Expected Output:
        [1, 3, 5, 7, 9]
         */

        numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> result = numbers.stream()
                .filter(e -> e%2 != 0)
                .toList();
        System.out.println(result);


        /*
        Exercise 2: Map to Upper Case

        Task:
        Given a list of strings, convert all of them to uppercase using a stream.

        Input:
        List<String> words = List.of("java", "streams", "are", "cool");

        Expected Output:
        [JAVA, STREAMS, ARE, COOL]
         */

        words = List.of("java", "streams", "are", "cool");
        words.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);


        /*
            Exercise 3: Find the First Match

            Task:
            From a list of integers, find the first number greater than 10.

            Input:
            List<Integer> numbers = List.of(3, 9, 12, 5, 15);

            Expected Output:
            12
         */
        List<Integer> num = List.of(3, 9, 12, 5, 15);
        var res = num.stream().filter(n -> n>10).findFirst();
        System.out.println(res);

        /*
        Exercise 4: Sum of Numbers

        Task:
        Given a list of integers, find the sum of all the elements using a stream.

        Input:
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        Expected Output:
        15
         */

        numbers = List.of(1, 2, 3, 4, 5);
        Integer suma = numbers.stream().reduce(0,(a,b) -> a+b);
        //or
        Integer suma2 = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(suma );

        /*
        Exercise 5: Count Strings with a Condition

        Task:
        Count how many strings in the list have a length greater than 3.

        Input:
        List<String> words = List.of("java", "is", "fun", "streams", "rocks");

        Expected Output:
        3
         */
        words = List.of("java", "is", "fun", "streams", "rocks");

        Long count = words.stream().filter(w -> w.length() > 3).count();
        System.out.println(count);

        /*
        Exercise 6: Square the number
        Task:
        Given a list of integers, return a new list where each number is squared
        Input:
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Expected Output:
        [1, 4, 9, 16, 25]
         */
        numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> r = numbers.stream().map(n -> n*n).toList();
        System.out.println(r);

        /*
        Exercise 7: Find the Longest Word
        Task:
        From a list of strings, find the longest word.
        Input:
        List<String> words = List.of("java", "streams", "are", "powerful")
        Expected Output:
        "powerful"
         */
        words = List.of("java", "streams", "are", "powerful");
        List<String> el = words.stream().max(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        }).stream().toList();
        //or
        words.stream().max((o1,o2) -> Integer.compare(o1.length(),o2.length()));
        System.out.println(el);

        /*
        Exercise 3: Skip and Limit
        Task:
        Given a list of integers, skip the first 2 elements and
        collect the next 3 elements into a new list.
        Input:
        List<Integer> numbers = List.of(10, 20, 30, 40, 50, 60);
        Expected Output:
        [30, 40, 50]
         */
        numbers = List.of(10, 20, 30, 40, 50, 60);
        System.out.println(numbers.stream().skip(2).limit(3).toList());

        /*
        Exercise 4: Joining Strings
        Task:
        Combine all strings in a list into a single string, separated by commas.
        Input:
        List<String> words = List.of("Java", "is", "awesome");
        Expected Output:
        "Java,is,awesome"
         */
        words = List.of("Java", "is", "awesome");
        String s =words.stream().collect(Collectors.joining(","));
        System.out.println(s);

        /*
        Exercise 5: Count Distinct Elements
        Task:
        Given a list of integers, count how many unique elements are in the list.
        Input:
        List<Integer> numbers = List.of(1, 2, 2, 3, 3, 3, 4, 5);
        Expected Output:
        5*/
        numbers = List.of(1, 2, 2, 3, 3, 3, 4, 5);
        Long sum = numbers.stream().distinct().count();
        System.out.println(sum);
    }
}