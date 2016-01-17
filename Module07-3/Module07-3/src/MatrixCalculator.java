public class MatrixCalculator {
    public static int determinant(int[][] matrix) throws IllegalMatrixSizeException {
        int determinant = 0;

        //Check if matrix is a single number
        if (matrix.length == 1) {
            return matrix[0][0];
        }

        //Check if matrix is not a square
        if (matrix.length != matrix[0].length || matrix.length == 0) {
            throw new IllegalMatrixSizeException(matrix.length, matrix[0].length);
        }

        //Якщо матриця 2x2, то рахуємо визначник як різницю добутків діагоналей
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

    public static int[][] multiply(int[][] a, int[][] b) {
        int ci = a.length;              //number of rows of first matrix
        int cj = b[0].length;           //number of columns of second matrix
        //Check if matrix is not a square
        int[][] c = new int[ci][cj];    //Multiply result matrix
        for (int i = 0; i < ci; i++) {
            for (int j = 0; j < cj; j++) {
                c[i][j] = 1;
            }
        }

        for (int i = 0; i < ci; i++) {
            for (int j = 0; j < cj; j++) {
                for (int k = 0; k < a[i].length; k++) {
                    c[i][j] *= a[i][k];
                }
                for (int k = 0; k < b.length; k++) {
                    c[i][j] *= b[k][j];
                }
            }
        }
        return c;
    }
}
