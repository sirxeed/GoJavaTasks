import java.util.Scanner;

/**
 * Created by Andy on 05.01.2016.
 */
public class MatrixCalculatorApplication {
    public static void main(String[] args) {
        //Вводимо розмір матриці
        System.out.print("Enter matrix size: ");
        Scanner scanner = new Scanner(System.in);
        int matrixSize = scanner.nextInt();

        //Створимо матрицю
        int[][] matrix = new int[matrixSize][matrixSize];

        //Заповнимо матрицю довільними знааченнями -10...10
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = (int)(Math.random() * 20) - 10;
            }
        }

        /* Для дебагінга
        //Тимчасово заповнюємо матрицю 3x3 відомими значеннями
        int counter = 0;
        int[][] matrix = new int[3][3];
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                matrix[i][j] = (i + 1) * (j + 1) + counter;
                counter++;
            }
        }
        matrix[2][0] += 1;

        //Для дебагінга №2
        matrix[0][0] = -1;
        matrix[0][1] = -8;
        matrix[0][2] = 4;
        matrix[0][3] = -9;

        matrix[1][0] = -4;
        matrix[1][1] = 5;
        matrix[1][2] = -7;
        matrix[1][3] = -3;

        matrix[2][0] = -6;
        matrix[2][1] = 2;
        matrix[2][2] = 9;
        matrix[2][3] = 2;

        matrix[3][0] = -4;
        matrix[3][1] = -9;
        matrix[3][2] = 6;
        matrix[3][3] = -5;
        */

        //Друкуємо вихідну матрицю
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(matrix[j][i] + " \t\t\t");
            }
            System.out.println();
        }

        System.out.print("Matrix determinant is: " + MatrixCalculator.determinant(matrix));
    }
}
