package H11;

import java.applet.Applet;
import java.awt.*;

public class H1103 extends Applet{

    public void init(){

        setSize(50, 300);
    }

    public void paint(Graphics g) {
        int a1 = -1;
        int a2 = 1;
        int a3;
        int y = 10;

        for( int a = -3; a<10; a++ )  {
            y+=20;
            a3= a1+a2;
            a1=a2;
            a2=a3;

            g.drawString(""+ a3 ,20, y );

        }
    }
}