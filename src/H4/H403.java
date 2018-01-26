package H4;
import java.awt.*;
import java.applet.*;

public class H403 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        g.drawLine(20, 20, 20, 180);
        g.setColor(Color.red);
        g.fillRect(20, 20, 100, 30);
        g.drawRect(20, 50, 100, 30);
        g.setColor(Color.blue);
        g.fillRect(20, 80, 100, 30);

    }
}
