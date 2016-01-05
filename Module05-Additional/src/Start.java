import java.util.Scanner;

/**
 * Created by Andy on 05.01.2016.
 */
public class Start {
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

        */
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(matrix[j][i] + "   ");
            }
            System.out.println();
        }
        matrix[2][0] += 1;

        System.out.print("Matrix determinant is: " + MatrixCalculator.determinant(matrix));
    }
}
