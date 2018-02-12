package H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H803 extends Applet {

    TextField tekstvak;
    Label label;
    double bedrag;
    double btw;


    public void init(){

        setSize(350, 100);

        label = new Label("Bereken hier uw BTW");
        tekstvak = new TextField("",20);
        tekstvak.addActionListener(new TeksvakListener());
        add(tekstvak);
        add(label);
        btw = 1.21;
    }



    public void paint (Graphics g){

        g.drawString("Bedrag met 21% BTW    €  "+ bedrag*btw,20,80);

    }

    class TeksvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String s = tekstvak.getText();
            bedrag = Double.parseDouble( s );
            repaint();
        }
    }





}
