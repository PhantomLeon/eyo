package H6;

import java.awt.*;
import java.applet.*;

public class H603 extends Applet {

    int a;
    int b;
    int uitkomst;


    public void init() {
        a = 66;
        b = 55;
        uitkomst = -(a + b);
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 30, 38);
        g.drawLine(30, 40, 190, 40);
    }
}

