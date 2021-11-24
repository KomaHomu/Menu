package hw.tuan2.hw3;

public class SelectionSort {
    
    public static void selectionSort(int[] array) {

        int length = array.length;
        int counter = 0;
        int minIdx;
        int temp;

        for (int i = 0; i < length; i++) {

            minIdx = minIdx(array, counter);

            temp = array[minIdx];
            array[minIdx] = array[counter];
            array[counter] = temp;

            counter++;
        }
    }

    public static int minIdx(int[] array, int counter) {

        int min = array[counter];
        int minIdx = counter;

        for (int i = counter; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIdx = i;
            }
        }

        return minIdx;
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

        selectionSort(iniArr);
        System.out.print("\nSorted array: ");
        printArr(iniArr);
    }
}
