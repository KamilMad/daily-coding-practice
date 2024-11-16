package sorting;

public class MergeSort {

    public void sort(int[] array) {
        int arrayLength = array.length;

        if (arrayLength < 2)
            return;

        int midIndex = arrayLength / 2;
        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[arrayLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftArray[i] = array[i];
        }

        for (int i = midIndex; i < arrayLength; i++) {
            rightArray[i - midIndex] = array[i];
        }

        sort(leftArray);
        sort(rightArray);

        merge(array, leftArray, rightArray);
    }

    private void merge(int[] array, int[] leftArray, int[] rightArray) {
        int arrayLength = array.length;
        int leftLength = leftArray.length;
        int rightLength = rightArray.length;

        int i = 0, j = 0, k = 0;

        while (leftLength > i && rightLength > j) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            }
            else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftLength) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightLength) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
