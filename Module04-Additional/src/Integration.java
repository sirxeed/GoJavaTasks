/**
 * Created by Andy on 05.01.2016.
 */
public class Integration {
    public static double monteCarloParabolic(int precision, double verticalLimit) {
        //��� ������� x = y^2
        double area;

        //�������� ��� ������ �� �� ������
        double horizontalLimit = Math.sqrt(verticalLimit);

        int counter = 0; //�-�� �����, �� ����������� � ������
        double x, y;
        for (int i = 1; i <= precision; i++) {
            x = Math.random() * horizontalLimit * 2 - horizontalLimit;
            y = Math.random() * verticalLimit;
            if (y >= Math.pow(x, 2)) {
                counter++;
            }
        }

        area = (verticalLimit * horizontalLimit * 2) * counter / precision;

        return area;
    }
}