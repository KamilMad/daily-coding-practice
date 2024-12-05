package Streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*
        Exercise 1: Filter and Collect
        Task:
        Given a list of integers, filter out all the even numbers and collect the remaining odd numbers into a new list.
        Input:
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Expected Output:
        [1, 3, 5, 7, 9]
         */

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
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

        List<String> words = List.of("java", "streams", "are", "cool");
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

        List<Integer> numberss = List.of(1, 2, 3, 4, 5);
        Integer suma = numberss.stream().reduce(0,(a,b) -> a+b);
        System.out.println(suma);

    }
}