package hw.tuan2.hw1;

import java.util.Scanner;

public class NumberConversion {

    public static String toRadix(String in, int inRadix, int outRadix) {

        try {
            int value = Integer.parseInt(in.toUpperCase(), inRadix);

            return Integer.toString(value, outRadix);
        } catch (NumberFormatException e) {
            e.printStackTrace();

            return "Incorrect input.";
        }
    }

    public void run() {

        String str;
        String result;
        int inRadix;
        int outRadix;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        str = scan.next();
        System.out.print("Enter the input radix: ");
        inRadix = scan.nextInt();
        System.out.print("Enter the output radix: ");
        outRadix = scan.nextInt();

        result = toRadix(str, inRadix, outRadix);

        if (result.equals("Incorrect input.")) {
            System.out.println(result);
        } else {
            System.out.println(str + " in radix " + inRadix + " is " + result + " in radix " + outRadix);
        }

        //scan.close();
    }
}
