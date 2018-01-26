package H4;
import java.awt.*;
import java.applet.*;

public class H402 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(80, 20, 140, 140);
        g.drawLine(30, 140, 80, 20);
        g.drawLine(30, 140, 140, 140);
        g.drawRect(30, 140, 110, 150);
        g.drawRoundRect(40, 180, 35, 35, 10, 10);
        g.drawRect(100, 245, 25, 45);


    }
}
