package sorting;

public class SelectionSort {

    public void sort(int[] array) {
       // int min = array[0];
        int minIndex;
        int temp;

        for (int i = 0; i < array.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;

        }
    }
}
