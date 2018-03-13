package H11;

import java.awt.*;
import java.applet.*;


public class H1101 extends Applet {

    public void init() {

        setSize(350, 350);
    }

    public void paint(Graphics g) {
        int teller;
        int x = 1;

        for(teller = 1; teller < 11; teller++) {
            x += 30;
            g.drawLine( x , 50, x , 300 );
            g.drawString("" + teller, x , 350 );
        }
    }
}