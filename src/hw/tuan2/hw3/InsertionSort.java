package hw.tuan2.hw3;

public class InsertionSort {
    
    public static void insertionSort(int[] array) {

        int length = array.length;
        int counter;
        int key;

        for (int i = 1; i < length; i++) {

            key = array[i];
            counter = i - 1;

            while (counter >= 0 && array[counter] > key) {
                array[counter + 1] = array[counter];
                counter--;
            }

            array[counter + 1] = key;
        }
    }

    public static void printArr(int[] array) {

        System.out.print("[ ");
        for (Integer num : array) {
            System.out.print(num + " ");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {

        int[] iniArr = {3, 4, 1, 2, 6, 5};

        System.out.print("Initial array: ");
        printArr(iniArr);

        insertionSort(iniArr);
        System.out.print("\nSorted array: ");
        printArr(iniArr);
    }
}
