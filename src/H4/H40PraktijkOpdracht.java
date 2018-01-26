package H4;
import java.awt.*;
import java.applet.*;

public class H40PraktijkOpdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        g.setColor(Color.magenta);
        g.fillRect(20, 30, 200, 100);
        g.setColor(Color.magenta);
        g.fillRect(250, 30, 200, 100);
        g.setColor(Color.black);
        g.drawOval(250, 30, 200, 100);
        g.setColor(Color.magenta);
        g.fillRoundRect(20, 150, 200, 100, 30, 30);
        g.setColor(Color.magenta);
        g.fillOval(250, 150, 200, 100);
        g.fillOval(500, 150, 100, 100);
        g.fillArc(500, 30, 200, 100, 0, 45);
        g.setColor(Color.black);
        g.drawOval(500, 30, 200, 100);
        g.drawString("Gevulde Rechthoek", 40, 143);
        g.drawString("Gevulde Afgeronde rechthoek", 40, 270);
        g.drawString("Gevulde ovaal", 300, 270);
        g.drawString("Gevulde Cirkel", 500, 270);
        g.drawString("Gevulde Rechthoek met ovaal", 250, 143);
        g.drawString("Taartpunt met ovaal eromheen", 515, 143);
        g.drawLine(50, 300, 270, 300);
        g.drawString("Lijn", 50, 320);
    }
}
