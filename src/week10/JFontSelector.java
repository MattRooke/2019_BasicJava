package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class JFontSelector implements ActionListener {

    JLabel example = new JLabel("1234 Aa Bb Cc Dd Ee Ff Gg Hh Ii Jj Kk Ll Mn ");
    String[] fontsNames = {"Trebuchet MS", "Arial", "Century Gothic", "Ebrima", "Georgia"};
    List<Font> fontObjs = new ArrayList<>();
    List<JButton> buttonObjs = new ArrayList<>();
    JFrame frame = new JFrame();
    JButton fontSizeButton = new JButton("Font Size");
    int clicks = 0;

    JFontSelector() {
        for (String font : fontsNames
        ) {
            fontObjs.add(new Font(font, Font.PLAIN, 12));
            buttonObjs.add(new JButton(font));
        }

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.LINE_AXIS));

        for (JButton button : buttonObjs
        ) {
            frame.add(button);
            button.addActionListener(this);
        }

        frame.add(fontSizeButton);
        fontSizeButton.addActionListener(this);

        frame.add(example);
        example.setVisible(false);
        example.setFont(fontObjs.get(0));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new JFontSelector();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object buttonPressed = e.getSource();
        if (clicks == 4)
            clicks = 0;
        if (buttonPressed.equals(fontSizeButton)) {
            clicks += 1;
            switch (clicks) {
                case 1:
                    Font font12pt = example.getFont().deriveFont(12F);
                    example.setFont(font12pt);
                    break;
                case 2:
                    Font font16pt = example.getFont().deriveFont(16F);
                    example.setFont(font16pt);
                    break;
                case 3:
                    Font font18pt = example.getFont().deriveFont(18F);
                    example.setFont(font18pt);
                    break;
                case 4:
                    Font font22pt = example.getFont().deriveFont(22F);
                    example.setFont(font22pt);
                    break;
            }

        } else if (buttonPressed.equals(buttonObjs.get(0))) {
            example.setFont(fontObjs.get(0));
            clicks = 1;
        } else if (buttonPressed.equals(buttonObjs.get(1))) {
            example.setFont(fontObjs.get(1));
            clicks = 1;
        } else if (buttonPressed.equals(buttonObjs.get(2))) {
            example.setFont(fontObjs.get(2));
            clicks = 1;
        } else if (buttonPressed.equals(buttonObjs.get(3))) {
            example.setFont(fontObjs.get(3));
            clicks = 1;
        } else if (buttonPressed.equals(buttonObjs.get(4))) {
            example.setFont(fontObjs.get(4));
            clicks = 1;
        }
        example.setVisible(true);
        frame.pack();
        frame.validate();
    }
}
