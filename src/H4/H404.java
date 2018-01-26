package H4;
import java.awt.*;
import java.applet.*;

public class H404 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        g.setColor(Color.pink);
        g.fillRect(50, 80, 50, 80);
        g.setColor(Color.green);
        g.fillRect(100, 40, 50, 120);
        g.setColor(Color.red);
        g.fillRect(150, 60, 50, 100);
        g.setColor(Color.black);
        g.drawString("Valerie", 55, 170);
        g.drawString("Jeroen", 105, 170);
        g.drawString("Hans", 160, 170);
        g.drawString("Staafdiagram", 20, 20);
        g.drawString("- 80 Kg", 200, 64);
        g.drawString("- 100 Kg", 200, 40);
        g.drawString("- 40 Kg", 200, 83);
    }
}