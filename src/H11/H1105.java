package H11;

import java.applet.Applet;
import java.awt.*;

public class H1105 extends Applet {

    public void init() {
        setSize(200, 200);
    }

    public void paint(Graphics g) {

        g.drawRect(20, 20, 30, 30);
        g.drawRect(50, 50, 30, 30);
        g.drawRect(80, 80, 30, 30);
        g.drawRect(110, 110, 30, 30);
        g.drawRect(140, 140, 30, 30);
    }
}


