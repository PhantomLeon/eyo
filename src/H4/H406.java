package H4;
import java.awt.*;
import java.applet.*;

public class H406 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.fillRect(90, 190, 10, 130);
        g.setColor(Color.black);
        g.drawRoundRect(68, 50, 50, 140, 10, 10);
        g.setColor(Color.red);
        g.fillOval(73, 55, 40, 40);
        g.setColor(Color.orange);
        g.fillOval(73, 100, 40, 40);
        g.setColor(Color.green);
        g.fillOval(73, 145, 40, 40);

    }
}
