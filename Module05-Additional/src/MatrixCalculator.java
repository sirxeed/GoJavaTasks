/**
 * Created by Andy on 05.01.2016.
 */
public class MatrixCalculator {
    public static int determinant(int[][] matrix) {
        int determinant = 0;

        //Якщо матриця 2x2, то рахуємовизначник як різницю добутків діагоналей
        if (matrix.length == 2) {
            determinant = matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1];
        } else {
            int[][] matrixNew = new int[matrix.length - 1][matrix.length - 1];

            //Рахуємо визначники матриць, які отримуються методом виключення (за опорним рядком 1)
            for (int k = 0; k < matrix.length; k++) {
                int indexI = 0; //номер стовпця нової матриці
                for (int i = 0; i < matrix.length; i++) {
                    int indexJ = 0; //номер рядка нової матриці
                    for (int j = 0; j < matrix.length; j++) {
                        if (i != k && j != 0) {
                            matrixNew[indexI][indexJ] = matrix[i][j];
                            indexJ++;
                        }
                    }
                    if (i != k) {
                        indexI++;
                    }
                }
                determinant += Math.pow(-1, 2 + k) * matrix[k][0] * determinant(matrixNew);
            }
        }

        return determinant;
    }
}
