package sorting;

public class BubbleSort2 {

    public void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public void selectionSort(int[] array) {
        int n = array.length;
        int minIndex;
        int temp;

        for (int i = 0; i < n; i++) {
            minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (array[j] < array[i]) {
                 minIndex = j;
                }
            }

            temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
