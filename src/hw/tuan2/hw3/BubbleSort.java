package hw.tuan2.hw3;

public class BubbleSort {

    public static void bubbleSort(int[] array) {

        int temp;
        int n = array.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; ++i) {
                if (array[i - 1] > array[i]) {
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
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

        bubbleSort(iniArr);
        System.out.print("\nSorted array: ");
        printArr(iniArr);
    }
}
