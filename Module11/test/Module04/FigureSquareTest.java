package Module04;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FigureSquareTest {

    @Test
    public void testTriangleSquare() throws Exception {
        final float side = 15;
        final float height = 10;

        assertEquals(side * height / 2, FigureSquare.triangleSquare(side, height), 0);
    }

    @Test
    public void testRectangleSquare() throws Exception {
        final float a = 5;
        final float b = 2;

        assertEquals(10, FigureSquare.rectangleSquare(a, b), 0);

    }

    @Test
    public void testCircleSquare() throws Exception {
        assertEquals(Math.pow(10, 2) * Math.PI, FigureSquare.circleSquare(10), 0.0001f);
    }
}