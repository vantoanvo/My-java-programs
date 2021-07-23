public class Test {
    public static void main(String[] args) {

        // set the scale of the coordinate system
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);

        // initial values, random velocity and size
        double rx = 0.0, ry = 0.0;                    // position
        double vx = 0.05 + Math.random() * 0.03;     // x velocity
        double vy = 0.05 + Math.random() * 0.03;     // y velocity
        double radius = 0.02 + Math.random() * 0.05; // size

        // main animation loop
        while (true)  {
            // bounce off wall according to law of elastic collision
            if (Math.abs(rx + vx) > 1.0 - radius) vx = -vx;
            if (Math.abs(ry + vy) > 1.0 - radius) vy = -vy;

            // update position
            rx = rx + vx;
            ry = ry + vy;

            // clear the background
            StdDraw.setPenColor(StdDraw.GRAY);
            StdDraw.filledSquare(0, 0, 1.0);

            // draw ball on the screen
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledCircle(rx, ry, radius);

            // display and pause for 20 ms
            StdDraw.show(20);
        }
    }
}