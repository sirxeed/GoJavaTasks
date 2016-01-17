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

        //Let's fill matrixes with random -10...10 values
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (int)(Math.random() * 20) - 10;
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j] = (int)(Math.random() * 10) - 5;
            }
        }

        //Run matrix multiplier
        int[][] c = new int[a.length][b[0].length];

        if (a.length == b[0].length) {
            c = MatrixCalculator.multiply(a, b);

            //Print a 'a'
            for (int[] anA : a) {
                for (int j = 0; j < a[0].length; j++) {
                    System.out.print(anA[j] + "\t\t");
                }
                System.out.println();
            }
            System.out.println();

            //Print a 'b'
            for (int[] aB : b) {
                for (int j = 0; j < b[0].length; j++) {
                    System.out.print(aB[j] + "\t\t");
                }
                System.out.println();
            }
            System.out.println();

            //Print a result
            for (int[] aC : c) {
                for (int j = 0; j < c[0].length; j++) {
                    System.out.print(aC[j] + "\t\t");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Rows of first matrix must be equal to columns of second one");
        }
    }
}
