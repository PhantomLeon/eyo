package H11;

import java.applet.Applet;
import java.awt.*;

public class H1107 extends Applet {

    public void init(){

        setSize(450, 450);
    }

    public void paint(Graphics g) {


        int straal = 200, breedte = 400, hoogte = 400;

        do {
            int x = breedte / 2 - straal;
            int y = hoogte / 2- straal;
            g.drawOval(x, y, 2 * straal, 2 * straal);
            straal -= 4;
        }
        while (straal > 1);

    }
}