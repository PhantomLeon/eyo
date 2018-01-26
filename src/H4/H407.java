package H4;
import java.awt.*;
import java.applet.*;

public class H407 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        g.drawRoundRect(20, 20, 200, 200, 10, 10);
        g.setColor(Color.black);
        g.fillOval(50, 40, 50, 50);
        g.fillOval(135, 40, 50, 50);
        g.fillOval(135, 130, 50, 50);
        g.fillOval(50, 130, 50, 50);
    }
}