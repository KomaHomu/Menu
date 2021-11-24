package hw.tuan2.hw3;

public class LinearSearch {

    public static boolean linearSearch(int[] array, int key) {

        for (Integer search : array) {
            if (key == search) {
                return true;
            }
        }

        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {

        for (int index = 1; index <= array.length; index++) {
            if (key == array[index]) {
                return index;
            }
        }

        return 0;
    }

    public void run() {

        int[] array = {1, 2, 3, 4, 5, 6};
        int key1 = 4;
        int key2 = 9;

        System.out.println("Array has key 1: " + linearSearch(array, key1));
        System.out.println("Array has key 2: " + linearSearch(array, key2));

        System.out.println("Index of key 1 in array: " + (linearSearchIndex(array, key1) - 1));
    }
}
