package H6;

import java.awt.*;
import java.applet.*;

public class H601 extends Applet {

    int a;
    int b;
    int uitkomst;


    public void init() {
        a = 113;
        b = 4;
        uitkomst = a / b;





    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
        g.drawString(" Leon   €28", 20, 60);
        g.drawString(" Jan   €28", 20, 75);
        g.drawString(" Ali   €28", 20, 90);
        g.drawString(" Jeanette   €28", 20, 105);
        g.drawString(" €28 X 4 = €112", 20, 120);
        g.drawString(" €1 over voor Leon", 20, 135);
        g.drawRoundRect(20, 40, 110, 110, 10, 10);

    }
}