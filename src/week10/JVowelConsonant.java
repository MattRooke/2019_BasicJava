package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class JVowelConsonant implements ActionListener {
    static String[] vowels = {"a", "e", "i", "o", "u"};
    private static String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
            "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private static int[] group1;
    private static int[] group2;

    JLabel info = new JLabel("");
    JFrame frame = new JFrame();

    JVowelConsonant() {
        List<JButton> buttons = new ArrayList<>();
        for (String letter : letters
        ) {
            buttons.add(new JButton(letter));

        }

        for (JButton button : buttons
        ) {
            button.addActionListener(this);
        }

        eightRandomButtons();

        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(0, 2));

        JPanel buttonsLeft = new JPanel();
        frame.add(buttonsLeft);
        buttonsLeft.setLayout(new GridLayout(2, 2));
        for (int buttonIndex : group1
        ) {
            buttonsLeft.add(buttons.get(buttonIndex));

        }

        JPanel buttonsRight = new JPanel();
        frame.add(buttonsRight);
        buttonsRight.setLayout(new GridLayout(2, 2));
        for (int buttonIndex : group2
        ) {
            buttonsRight.add(buttons.get(buttonIndex));
        }

        JPanel labelLeft = new JPanel();
        frame.add(labelLeft);
        labelLeft.add(info);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void eightRandomButtons() {
        List<Integer> randNumbers = new ArrayList<>();
        Random random = new Random();
        int randNum = random.nextInt(26);
        randNumbers.add(randNum);
        while (randNumbers.size() < 8) {
            randNum = random.nextInt(26);
            if (!randNumbers.contains(randNum))
                randNumbers.add(randNum);
        }
        group1 = new int[]{randNumbers.get(0), randNumbers.get(1), randNumbers.get(2), randNumbers.get(3)};
        group2 = new int[]{randNumbers.get(4), randNumbers.get(5), randNumbers.get(6), randNumbers.get(7)};
    }

    public static void main(String[] args) {
        new JVowelConsonant();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String letterPressed = e.getActionCommand();
        if (Arrays.asList(vowels).contains(letterPressed)) {
            info.setText("The letter \"" + letterPressed + "\" is a vowel.");
        } else {
            info.setText("The letter \"" + letterPressed + "\" is a consonant.");
        }
        Random random = new Random();
        int newRandIndex = random.nextInt(26);
        JButton button = (JButton) e.getSource();
        button.setText(letters[newRandIndex]);
        frame.repaint();
    }
}
