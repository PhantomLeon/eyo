package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class H105 extends Applet {

    private TextField tekstvak;
    private String resultaat;

    public void init() {

        setSize(300, 100);

        tekstvak =  new TextField(20);
        add(tekstvak);

        Button knop = new Button("Bereken Cijfer");
        cijferListener cL = new cijferListener();
        knop.addActionListener( cL );
        add(knop);


    }

    public void paint(Graphics g) {
        g.drawString("Je Cijfer is een:  " + resultaat, 20, 60);

    }

    class cijferListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String s = tekstvak.getText();
            int invoer = Integer.parseInt(s);
            for (int i = 0; i <5.5 ; i++) {


                if (invoer < 5.4){
                    resultaat = "Onvoldoende";
                }
                else if(invoer >=5.5 ){
                    resultaat = "Voldoende";
                }
            }
            repaint();

        }
    }

}