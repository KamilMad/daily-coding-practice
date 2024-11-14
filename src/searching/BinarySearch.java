package searching;

public class BinarySearch {

    public int binarySearch(int[] array, int num) {

        if (array == null || array.length == 0)
            return -1;

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (num == array[mid])
                return mid;
            else if (num < array[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }

        return -1;
    }

    public int binarySearchRecursive(int[] array, int num) {
        return recursiveBinary(array, num, 0, array.length-1);
    }

    public int recursiveBinary(int[] array, int num, int low, int high) {
        if (array == null || array.length == 0)
            return -1;

        if (low > high)
            return -1;


        int mid = (low+high)/2;

        if (num == array[mid])
            return mid;
        else if (num < array[mid])
            return recursiveBinary(array,num,low, mid-1);
        else
            return recursiveBinary(array,num, mid+1, high);
    }
}
