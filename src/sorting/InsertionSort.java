package sorting;

public class InsertionSort {

    public void sort(int[] array) {

        int currentValue;

        // iterate over unsorted part
        // i = 1 because first element is 'sorted'
        for (int i = 1; i < array.length; i++) {
            currentValue = array[i]; // value of first unsorted value
            int j = i - 1; // index of the last sorted value
            while (j >= 0 && array[j] > currentValue) { // decrementing till index >= 0 and sorted value is bigger than unsorted
                array[j+1] = array[j]; // swapping bigger elements to the "right"
                j--;
            }
            array[j+1] = currentValue; // inserting unsorted value in right place
        }
    }
}
