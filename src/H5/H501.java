package H5;
import java.awt.*;
import java.applet.*;

public class H501 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        g.drawRect(20, 30, 200, 100);
        g.setColor(Color.magenta);
        g.fillRect(250, 30, 200, 100);
        g.setColor(Color.black);
        g.drawOval(250, 30, 200, 100);
        g.drawRoundRect(20, 150, 200, 100, 10, 10);
        g.setColor(Color.magenta);
        g.fillOval(250, 150, 200, 100);

    }
}
