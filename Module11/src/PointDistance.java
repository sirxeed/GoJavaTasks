public class PointDistance {
    public static float distance (int x1, int y1, int x2, int y2) {
        int deltaX = x2 - x1;
        int deltaY = y2 - y1;
        
        //negative distance check
        if (deltaX < 0) {
            deltaX *= -1;
        }
        if (deltaY < 0) {
            deltaY *= -1;
        }
        
        return (float) Math.pow(Math.pow(deltaX, 2) + Math.pow(deltaY, 2), 0.5);
    }
}
