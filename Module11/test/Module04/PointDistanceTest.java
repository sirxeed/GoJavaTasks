package Module04;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointDistanceTest {

    @Test
    public void testDistance() throws Exception {
        assertEquals(1f, PointDistance.distance(0, 0, 0, 1), 0);
        assertEquals(Math.sqrt(2), PointDistance.distance(0, 0, 1, 1), 1e-5);
    }

}