/**
 * Created by Andy on 05.01.2016.
 */
public class Integration {
    public static double monteCarlo(float a, float b, float precision) {
        double area;

        //Calculating function minimum and maximum between 'a' and 'b'
        float min = minimum(a, b);
        float max = maximum(a, b);

        //Starting iteration
        int counter = 0; //counter of accurate points
        float x, y;

        //Number of point throws
        int number = (int)(1 / Math.pow(precision, 2));

        for (int i = 1; i <= number; i++) {
            x = (float)Math.random() * (b - a) + a;
            y = (float)Math.random() * (max - min) + min;
            if (y <= Func.Parabolic(x)) {
                counter++;
            }
        }

        area = (b - a) * (max - min) * counter / number;

        return area;
    }

    protected static float minimum(float a, float b) {
        float min = Func.Parabolic(a);

        for (float i = a; i <= b ; i += (b - a) / 1000) {
            if (Func.Parabolic(i) < min) {
                min = Func.Parabolic(i);
            }
        }
        System.out.println("The minimum is: " + min);
        return min;
    }

    protected static float maximum(float a, float b) {
        float max = Func.Parabolic(a);

        for (float i = a; i <= b ; i += (b - a) / 1000) {
            if (Func.Parabolic(i) > max) {
                max = Func.Parabolic(i);
            }
        }
        System.out.println("The maximum is: " + max);
        return max;
    }

}