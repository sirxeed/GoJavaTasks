/**
 * Created by Andy on 05.01.2016.
 */
public class Integration {
    public static double monteCarloParabolic(int precision, double verticalLimit) {
        //Для функції x = y^2
        double area;

        //Знайдемо межі фігури по осі абсцис
        double horizontalLimit = Math.sqrt(verticalLimit);

        int counter = 0; //К-ть точок, які потрапляють в фігуру
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
