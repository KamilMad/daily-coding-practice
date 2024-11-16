import searching.BinarySearch;
import sorting.*;

import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000);
        }

        Arrays.stream(numbers).forEach(e -> System.out.print(e+ ","));
        System.out.println();
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(numbers, 0, numbers.length-1);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + ","));

    }
}