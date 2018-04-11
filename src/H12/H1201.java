package H12;


import java.awt.*;
import java.applet.*;

public class H1201 extends Applet {

    double[] getal = {5, 13, 24, 33, 35, 47, 56, 57, 69, 100};
    double[] kopie;
    double uitkomst;
    public void init() {

        setSize(270, 50);

        uitkomst = 5 + 13 + 24 + 33 + 35 + 47 + 56 + 57 + 69 + 100;
        getal = new double[5];
        kopie = new double[5];

        for (int teller = 0; teller < getal.length; teller ++) {
            getal[teller] = 100 * teller + 100;
        }
        kopie = getal;
        kopie[3] = 1000;
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < getal.length; teller ++) {
            g.drawString("Het Gemiddelde = " + (uitkomst / getal.length), 60, 30 );

        }
    }
}