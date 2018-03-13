package H11;

import java.awt.*;
import java.applet.*;


public class H1102 extends Applet {

    public void init() {

        setSize(250, 50);
    }

    public void paint(Graphics g) {
        int teller = 10;
        int x = 0;

        while(teller < 21) {
            x += 20;
            g.drawString("" + teller, x , 40 );
            teller++;
        }
    }
}
