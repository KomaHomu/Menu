package hw.tuan2.hw3;

public class RecursiveBinarySearch {

    public boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {

        int midIdx = (fromIdx + toIdx) / 2;

        if (fromIdx == toIdx) {
            return false;
        }

        if (key == array[midIdx]) {
            return true;
        }

        if (key < array[midIdx]) {
            return binarySearch(array, key, fromIdx, midIdx);
        } else {
            return binarySearch(array, key, midIdx, toIdx);
        }

    }

    public static void main(String[] args) {

        RecursiveBinarySearch rbs = new RecursiveBinarySearch();

        int[] array = {11, 14, 16, 18, 20, 25, 28, 30, 34, 40, 45};
        int key = 18;

        System.out.println("Array has the given key: " + rbs.binarySearch(array, key, 0, array.length - 1));
    }
}
