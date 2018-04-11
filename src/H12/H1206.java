package H12;

import java.applet.Applet;
import java.awt.*;

public class H1206 extends Applet {

    private TextField textField;
    private int[] cijfer = {1, 1, 4, 7, 8, 8, 8, 2, 0, 0, 0, 11, 26, 26, 26, 26, 27, 27, 22, 29, 33, 33, 33, 38, 42, 55, 69, 69};
    private int input;
    private int aantal;
    private boolean knop;

    public void init() {

        setSize(250, 60);

        Button button = new Button("OK");
        button.addActionListener(e -> {
            aantal = 0;
            knop = true;
            input = Integer.parseInt(textField.getText());

            for (int getal : cijfer) {
                if (getal == input) {
                    aantal++;
                }
            }
            repaint();

        });
        add(button);

        textField = new TextField(10);
        add(textField);

    }

    public void paint(Graphics g) {
        if (knop) {
            g.drawString("Waarde " + input + " komt " + aantal + " keer voor", 30, 50);
        }
    }
}