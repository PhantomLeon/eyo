package H5;
import java.awt.*;
import java.applet.*;

public class H502 extends Applet {

    int balk1;
    int balk2;
    int balk3;
    int hoogteas;

    public void init() {
        setSize(300, 300);
    }

    public void paint(Graphics g) {

        hoogteas = 210;
        balk1 = 30;
        balk2 = 100;
        balk3 = 80;

        g.setColor(Color.green);
        g.fillRect(100, hoogteas-balk1, 50, balk1);
        g.setColor(Color.red);
        g.fillRect(150, hoogteas-balk2, 50, balk2);
        g.setColor(Color.blue);
        g.fillRect(200, hoogteas-balk3, 50, balk3);

        g.setColor(Color.black);
        g.drawString("0", 92, 212);
        g.drawString("20", 85, 193);
        g.drawString("40", 85, 174);
        g.drawString("60", 85, 155);
        g.drawString("80", 85, 134);
        g.drawString("100", 78, 115);

        g.drawString("Valerie", 105, 220);
        g.drawString("Jeroen", 155, 220);
        g.drawString("Hans", 210, 220);



    }
}

