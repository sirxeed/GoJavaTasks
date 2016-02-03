package Module04;

public class FigureSquare {

    public static float triangleSquare (float side, float height) {
        return side * height / 2;
    }

    public static float rectangleSquare (float a, float b) {
        return a * b;
    }

    public static float circleSquare (float radius) {
        return (float) (Math.pow(radius, 2) * Math.PI);
    }
}
