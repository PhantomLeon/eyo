package H12;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H1204en5 extends Applet{

    int[] numbers = {-100, -10, -1, 6, 9, 12, 13, 18, 25, 43, 69, 155, 200, 666, -43, 1101, 2345, 5000, 2018};
    int index = -1;
    boolean found = false;
    TextField input = new TextField(10);
    Button ok = new Button("OK");
    String string = "";

    public void init(){
        setSize(340, 100);
        add(input);
        input.addActionListener(new InputListener());
        add(ok);
        ok.addActionListener(new InputListener());
    }

    public void paint(Graphics g){
        g.drawString(string, 50, 50);
    }

    class InputListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int search = Integer.parseInt(input.getText());
            for (int i = 0; i < numbers.length && found == false; i++) {
                index++;
                if (numbers[i] == search)
                {
                    found = true;
                }
            }
            if (found == true) {
                string = "De waarde van de Index   =   "+ index;
            }
            else {
                string = "De waarde van de Index is niet gevonden : /";
            }
            index = -1;
            found = false;
            repaint();
        }
    }
}