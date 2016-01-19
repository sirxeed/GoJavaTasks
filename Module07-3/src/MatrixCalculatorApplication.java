import java.util.Scanner;

public class MatrixCalculatorApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Вводимо розмір матриці
        System.out.println("---Determinant program---");
        System.out.print("Enter matrix size: ");
        int matrixSize = scanner.nextInt();

        //Створимо матрицю
        int[][] matrix = new int[matrixSize][matrixSize];

        //Заповнимо матрицю довільними значеннями -10...10
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 20) - 10;
            }
        }

        //Друкуємо вихідну матрицю
        for (int i = 0; i < matrix[0].length; i++) {
            for (int[] aMatrix : matrix) {
                System.out.print(aMatrix[i] + " \t\t\t");
            }
            System.out.println();
        }

        try {
            System.out.print("Matrix determinant is: " + MatrixCalculator.determinant(matrix));
        } catch (IllegalMatrixSizeException e) {
            System.out.println("You entered a non-square matrix");
        }


        //Multiply matrix program
        System.out.println("\n" + "---Matrix multiply program---");
        System.out.print("Enter the number of first matrix rows: ");
        int ai = scanner.nextInt();
        System.out.print("Enter the number of first matrix columns: ");
        int aj = scanner.nextInt();

        System.out.print("Enter the number of second matrix rows: ");
        int bi = scanner.nextInt();
        System.out.print("Enter the number of second matrix columns: ");
        int bj = scanner.nextInt();


        int[][] a = new int[ai][aj];
        int[][] b = new int[bi][bj];

        //FILLING OF MATRIXES CAN BE MOVED INTO THE METHOD
        //Let's fill matrixes with random -10...10 values
        matrixFillRandom(a, 10);
        matrixFillRandom(b, 10);

        //Run matrix multiplier
        int[][] c = new int[a.length][b[0].length];

        if (a.length == b[0].length) {
            c = MatrixCalculator.multiply(a, b);

            //Print a 'a'
            System.out.println("First matrix:");
            matrixPrint(a);
            System.out.println();

            //Print a 'b'
            System.out.println("Second matrix:");
            matrixPrint(b);
            System.out.println();

            //Print a result
            System.out.println("Multiply result matrix:");
            matrixPrint(c);
        } else {
            System.out.println("Rows of first matrix must be equal to columns of second one");
        }
    }

    public static void matrixPrint(int[][] matrix) {
        for (int[] amatrix : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(amatrix[j] + "\t\t");
            }
            System.out.println();

        }
    }

    public static void matrixFillRandom(int[][] matrix, int numberLimit) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * numberLimit*2) - numberLimit;
            }
        }
    }
}