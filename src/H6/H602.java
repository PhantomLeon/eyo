package H6;

import java.awt.*;
import java.applet.*;

public class H602 extends Applet {

int uur, dag, jaar, minuut;

    public void init() {
        minuut = 60;
        uur = 60 * minuut;
        dag = 24 * uur;
        jaar = dag * 365;

    }

    public void paint(Graphics g) {
        g.drawString("Een uur heeft " +uur+ " seconden" ,50,50);
        g.drawString("Een dag heeft " +dag+ " seconden" ,50,100);
        g.drawString("Een jaar heeft " +jaar+ " seconden" ,50,150);
        g.drawRoundRect(20, 20, 250, 160, 10, 10);

    }
}