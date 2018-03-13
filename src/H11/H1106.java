package H11;

import java.applet.Applet;
import java.awt.*;

public class H1106 extends Applet {

    public void init() {
        setSize(100, 100);
    }

    public void paint(Graphics g) {

        g.drawOval(20, 20, 55, 55);
        g.drawOval(25, 25, 45, 45);
        g.drawOval(30, 30, 35, 35);
        g.drawOval(35, 35, 25, 25);
        g.drawOval(40, 40, 15, 15);
    }
}


