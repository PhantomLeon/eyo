package H11;

import java.applet.Applet;
import java.awt.*;

public class H1108 extends Applet {

    public void init(){

        setSize(500, 500);
    }

    public void paint(Graphics g) {

        int straal = 200, breedte = 500, hoogte = 500;

        do {
            int x = breedte / 2 - straal;
            int y = hoogte / 2- straal;
            g.drawOval(x, y, 2 * straal, 2 * straal);
            straal -= 2;
        }
        while (straal > 4);

    }
}