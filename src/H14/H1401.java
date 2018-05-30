package H14;

import java.applet.Applet;
import java.awt.*;

public class H1401 extends Applet {

    private String[] soorten = {"♠","♣","♥","♦"};
    private String[] cijfers = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jester","Queen","King","Ace"};
    private String cijfer;
    private String soort;

    public void init() {

        setSize(300, 100);

        double c = Math.random();
        int randomCijfer = (int) (c * 13);
        cijfer = cijfers[randomCijfer];

        double s = Math.random();
        int randomSoort = (int) (s * 4);
        cijfer = cijfers[randomCijfer];
        soort = soorten[randomSoort];
    }

    public void paint(Graphics g) {
        Font font = new Font ("Serif", Font.PLAIN, 24);
        g.setFont (font);
        g.drawString("You got "+ cijfer +" of "+ soort,50,50);

    }
}