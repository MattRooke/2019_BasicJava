package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class JHistoricalFacts {

    String[] factStrings = {"PCs went by the name “Electronic Brains” in the 1950s.",
            "Email has been around longer than the World Wide Web.",
            "HP, Google, Microsoft and Apple have just one thing in common, other than the fact that they are IT companies. They were all started in garages.",
            "Bill Gates’ house was designed used a Mac computer.",
            "The original name of Windows was Interface Manager.",
            "The QWERTY keyboard was designed to slow you down. If you want to type faster, try the Dvorak Keyboard",
            "The first computer was almost 2.5 meters high and weighed nearly 30,000kg.",
            "The name Google was created accidentally. A spelling error was made by the original founders who were under the impression they were going for Googol.",
            "The Apple II had a hard drive of only 5 megabytes when it was released.",
            "TIME Magazine named the computer the “Man of the Year” in 1982.",
            "The first computer mouse was invented by Doug Engelbart and it was carved from wood.",};

    public JHistoricalFacts() {
        JFrame window = new JFrame("Historical IT Facts");
        window.setVisible(true);
        window.setLayout(new BoxLayout(window.getContentPane(), BoxLayout.Y_AXIS));

        JLabel windowTitle = new JLabel("Facts:");
        windowTitle.setFont(new Font("Arial", Font.PLAIN, 16));
        window.add(windowTitle);

        for (int i = 0; i < 4; i++) {
            window.add(new JLabel((i + 1) + ". " + factStrings[i]));
        }

        JLabel changingFactLabel = new JLabel("5. " + factStrings[4]);
        window.add(changingFactLabel);

        JButton newFactButton = new JButton("New Fact!");
        window.add(newFactButton);

        ActionListener factButtonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                int randIndex = random.nextInt(7) + 4;
                changingFactLabel.setText(("5. " + factStrings[randIndex]));
                window.pack();
            }
        };

        newFactButton.addActionListener(factButtonListener);

        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.pack();
    }

    public static void main(String[] args) {
        new JHistoricalFacts();
    }
}
