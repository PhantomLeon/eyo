package H6;

import java.awt.*;
import java.applet.*;

public class H60PraktijkOpdracht extends Applet {

    double a , b , c;
    double uitkomst;


    public void init() {
        a = 7.9;
        b = 8.3;
        c = 10.4;
        uitkomst = (a + b + c) / 3;



    }

    //Het lukte niet helemaal perfect zoals het moest


    public void paint(Graphics g) {
        g.drawString("Het gemiddlede is: " + uitkomst, 20, 20);
        g.setColor(Color.white);
        g.fillRect(145, 10, 600, 50);
    }
}