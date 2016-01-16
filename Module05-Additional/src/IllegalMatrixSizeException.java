/**
 * Created by Андрій on 16.01.2016.
 */
public class IllegalMatrixSizeException extends Throwable {
    private int matrixRows;
    private int matrixCols;

    public IllegalMatrixSizeException(int matrixRows, int matrixCols) {
        this.matrixRows = matrixRows;
        this.matrixCols = matrixCols;
    }

    public int getMatrixCols() {
        return matrixCols;
    }

    public int getMatrixRows() {
        return matrixRows;
    }
}
