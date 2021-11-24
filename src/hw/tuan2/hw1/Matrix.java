package hw.tuan2.hw1;

public class Matrix {

    public static void print(int[][] matrix) {

        if (isNull(matrix)) {
            return;
        }

        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t"); // print each element from a corresponding row
            }
            System.out.println();
        }
    }

    public static void print(double[][] matrix) {

        if (isNull(matrix)) {
            return;
        }

        for (double[] row : matrix) {
            for (double element : row) {
                System.out.printf("%7.2f", element); // print each element from a corresponding row
            }
            System.out.println();
        }
    }

    public static boolean isNull(int[][] matrix) {

        return matrix == null;
    }

    public static boolean isNull(double[][] matrix) {

        return matrix == null;
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {

        if (isNull(matrix1) || isNull(matrix2)) {
            return false;
        }

        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {

        if (isNull(matrix1) || isNull(matrix2)) {
            return false;
        }

        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {

        if (!haveSameDimension(matrix1, matrix2)) {
            return new int[0][0];
        }

        int[][] sumOfMatrix = new int[matrix1.length][matrix1[0].length];

        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[row].length; col++) {
                sumOfMatrix[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }

        return sumOfMatrix;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {

        if (!haveSameDimension(matrix1, matrix2)) {
            return new double[0][0];
        }

        double[][] sumOfMatrix = new double[matrix1.length][matrix1[0].length];

        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[row].length; col++) {
                sumOfMatrix[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }

        return sumOfMatrix;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {

        if (!haveSameDimension(matrix1, matrix2)) {
            return new int[0][0];
        }

        int[][] diffOfMatrix = new int[matrix1.length][matrix1[0].length];

        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[row].length; col++) {
                diffOfMatrix[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }

        return diffOfMatrix;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {

        if (!haveSameDimension(matrix1, matrix2)) {
            return new double[0][0];
        }

        double[][] diffOfMatrix = new double[matrix1.length][matrix1[0].length];

        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[row].length; col++) {
                diffOfMatrix[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }

        return diffOfMatrix;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {

        if (isNull(matrix1) || isNull(matrix2)) {
            return new int[0][0];
        }

        if (matrix1[0].length != matrix2.length) { // check if multiplication is possible
            return new int[0][0];
        }

        int[][] productOfMatrix = new int[matrix1.length][matrix2[0].length];

        for (int row1 = 0; row1 < matrix1.length; row1++) {
            for (int col2 = 0; col2 < matrix2[0].length; col2++) {
                for (int row2 = 0; row2 < matrix2.length; row2++) {
                    productOfMatrix[row1][col2] += matrix1[row1][row2] * matrix2[row2][col2];
                }
            }
        }

        return productOfMatrix;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {

        if (isNull(matrix1) || isNull(matrix2)) {
            return new double[0][0];
        }

        if (matrix1[0].length != matrix2.length) { // check if multiplication is possible
            return new double[0][0];
        }

        double[][] productOfMatrix = new double[matrix1.length][matrix2[0].length];

        for (int row1 = 0; row1 < matrix1.length; row1++) {
            for (int col2 = 0; col2 < matrix2[0].length; col2++) {
                for (int row2 = 0; row2 < matrix2.length; row2++) {
                    productOfMatrix[row1][col2] += matrix1[row1][row2] * matrix2[row2][col2];
                }
            }
        }

        return productOfMatrix;
    }

    public void run() {

        int[][] matrix1 = {{3, 2, 1, 7},
                {9, 11, 5, 4},
                {6, 0, 13, 17},
                {7, 21, 14, 15}};
        int[][] matrix2 = {{4, 3, 2, 8},
                {9, 11, 5, 4},
                {6, 0, 13, 17},
                {7, 21, 14, 15}};
        int[][] matrix3 = {{4, 3, 2},
                {9, 11, 5},
                {6, 0, 13},
                {6, 0, 13}};

        double[][] matrix4 = {{3.3, 2, 1, 7},
                {9, 11, 5, 4},
                {6, 0, 13, 17},
                {7, 21, 14, 15}};
        double[][] matrix5 = {{4.3, 3, 2, 8},
                {9, 11, 5, 4},
                {6, 0, 13, 17},
                {7, 21, 14, 15}};
        double[][] matrix6 = {{4.5, 3, 2},
                {9, 11, 5},
                {6, 0, 13},
                {6, 0, 13}};

        int[][] sumOfMatrix = add(matrix1, matrix2);
        int[][] diffOfMatrix = subtract(matrix1, matrix2);
        int[][] productOfMatrix = multiply(matrix1, matrix3);

        print(sumOfMatrix);
        print(diffOfMatrix);
        print(productOfMatrix);

        double[][] doubleSumOfMatrix = add(matrix4, matrix5);
        double[][] doubleDiffOfMatrix = subtract(matrix4, matrix5);
        double[][] doubleProductOfMatrix = multiply(matrix4, matrix6);

        print(doubleSumOfMatrix);
        print(doubleDiffOfMatrix);
        print(doubleProductOfMatrix);

    }
}
