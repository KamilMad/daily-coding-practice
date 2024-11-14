import searching.BinarySearch;
import sorting.BubbleSort;
import sorting.InsertionSort;
import sorting.SelectionSort;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {6,7,2,4,12,3,1};
        Arrays.stream(numbers).forEach(e -> System.out.print(e + ","));

       // BubbleSort bubbleSort = new BubbleSort();
       // bubbleSort.BubbleSort(numbers);
//        SelectionSort selectionSort = new SelectionSort();
//        selectionSort.sort(numbers);

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(numbers);
        System.out.println();
        Arrays.stream(numbers).forEach(e -> System.out.print(e + ","));

    }
}