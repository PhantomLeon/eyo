package H12;

import java.applet.Applet;
import java.awt.*;
import java.util.Arrays;

public class H1203 extends Applet {

    private TextField[] textFields;
    private final int Vakken = 5;

    public void init() {

        setSize(350,55);

        textFields = new TextField[Vakken];

        for (int i = 0; i < Vakken; i++) {
            TextField tf = new TextField(5);
            textFields[i] = tf;
            add(tf);
        }
        Button button = new Button("OK");
        add(button);

        button.addActionListener(e -> {
            int[] invoer = new int[Vakken];
            for (int i = 0; i < Vakken; i++) {
                String s = textFields[i].getText();
                int input = Integer.parseInt(s);
                invoer[i] = input;
            }
            Arrays.sort(invoer);

            for (int i = 0; i < Vakken; i++) {
                textFields[i].setText(String.valueOf(invoer[i]));
            }
        }
        );
    }
}