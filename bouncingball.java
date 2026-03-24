import java.applet.Applet;
import java.awt.Graphics;

public class BouncingBall extends Applet implements Runnable {

    int x = 50, y = 50;
    int dx = 2, dy = 2;

    public void init() {
        Thread t = new Thread(this);
        t.start();
    }

    public void run() {
        while (true) {
            x = x + dx;
            y = y + dy;

            // Bounce from walls
            if (x <= 0 || x >= 300)
                dx = -dx;

            if (y <= 0 || y >= 300)
                dy = -dy;

            repaint();

            try {
                Thread.sleep(20);
            } catch (Exception e) {}
        }
    }

    public void bouncingball(Graphics g) {
        g.fillOval(x, y, 30, 30);
    }
}