package H11;

import java.applet.Applet;
import java.awt.*;

public class H1109  extends Applet{

    public void init(){

        setSize(270, 270);
    }

    public void paint(Graphics g) {

        int x = 50;
        int y = 50;
        int balk = 0;

        for (int s = 1; s <=64; s++) {
            if (balk % 2 == 0) {
                if (s % 2 == 0) {
                    g.drawRect(x, y, 19, 20);
                }
                else {
                    g.fillRect(x, y, 21, 20);
                }
            }

            else {
                if (s % 2 == 0) {
                    g.fillRect(x, y, 20, 20);
                }
                else {
                    g.drawRect(x, y, 21, 19);
                }
            }

            x+=20;

            if (s % 8 == 0) {
                y += 20;
                x = 50;
                balk++;
            }
        }
    }
}