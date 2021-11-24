package hw.tuan2.hw2;

public class RunningNumSeq {

    public static long numOfDigit(int num) {

        long temp = 0;

        for (int index = 0; index < num; index++) {
            temp *= 10;
            temp += 1;
        }

        return temp;
    }

    public static long len(int num) {

        if (num == 0) {
            return 0;
        }

        return len(num - 1) + numOfDigit(num);
    }

    public static void main(String[] args) {

        int num = 9;

        long len = len(num);

        System.out.println("Seq (" + num + ") = " + len);
    }
}
