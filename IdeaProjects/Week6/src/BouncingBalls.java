import java.awt.Color;
import java.util.Random;
public class BouncingBalls {
    public static void main(String[] args) {
        //sets the scale for stddraw
        StdDraw.setXscale(-1.0, +1.0);
        StdDraw.setYscale(-1.0, +1.0);
        Color c = new Color(100, 100, 100);
        //x and y movement positions of first ball
        double rx = 0.48, ry = 0.86;
        double vx = .015, vy = .023;
        // x and y movement positions of second ball
        double rx2 = 0.48, ry2 = 0.86;
        double vx2 = -.015, vy2 = -.023;
        // the size of each ball
        double sz = .05;
        while (true) {
            //setting the color of the pen
            StdDraw.setPenColor(c);
            //creating the square
            StdDraw.filledSquare(0.0, 0.0, 1);
            // walls collision
            // first ball
            if (rx - sz + vx < -1.0 || rx + sz + vx > 1.0) vx = -vx;
            if (ry - sz + vy < -1.0 || ry + sz + vy > 1.0) vy = -vy;
            //second ball
            if (rx2 - sz + vx2 < -1.0 || rx2 + sz + vx2 > 1.0) vx2 = -vx2;
            if (ry2 - sz + vy2 < -1.0 || ry2 + sz + vy2 > 1.0) vy2 = -vy2;
            //ball collision
            if ((Math.abs((rx + sz / 2) - (rx2 + sz / 2)) <= sz) && (Math.abs((ry + sz / 2) - (ry2 + sz / 2)) <= sz)) {
                // change directions
                vx = -vx;
                vx2 = -vx2;
                //making random color
                c = randomColor();
            }
            //apply movement
            //first ball
            rx = rx + vx;
            ry = ry + vy;
            //second ball
            rx2 = rx2 + vx2;
            ry2 = ry2 + vy2;
            // setting the balls to be black and drawing them
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledCircle(rx, ry, sz);
            // second ball
            StdDraw.filledCircle(rx2, ry2, sz);
            //Showing it all and setting the animation speed to 20
            StdDraw.show(20);
        }
    }

    public static Color randomColor() {
        Random rand = new Random();
        int r = rand.nextInt(255 + 1);
        int g = rand.nextInt(255 + 1);
        int b = rand.nextInt(255 + 1);
        return new Color(r, g, b);
    }
}