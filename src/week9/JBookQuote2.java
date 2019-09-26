package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JBookQuote2 implements ActionListener {

    private JTextField quoteText;
    private JFrame quoteWindow;
    private JPanel panel;
    private JButton titleButton;

    JBookQuote2() {
        quoteWindow = new JFrame("Book Quote");
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        quoteText = new JTextField("“In a hole in the ground there lived a hobbit. Not a nasty, dirty, wet hole, filled with the " +
                "ends of worms and an oozy smell, nor yet a dry, bare, sandy hole with nothing in it to sit down on or " +
                "to eat: it was a hobbit-hole, and that means comfort.”");

        titleButton = new JButton("Display Book Name");
        titleButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        titleButton.addActionListener(this);

        quoteText.setHorizontalAlignment(JTextField.HORIZONTAL);
        panel.add(quoteText);
        panel.add(titleButton);

        quoteWindow.add(panel);
        quoteWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        quoteWindow.setSize(1280, 300);
        quoteWindow.setLocationRelativeTo(null);
        quoteWindow.setVisible(true);
    }

    public static void main(String[] args) {
        new JBookQuote2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JTextField bookTitle = new JTextField("The Hobbit");
        bookTitle.setHorizontalAlignment(JTextField.HORIZONTAL);
        bookTitle.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
        panel.add(bookTitle);
        titleButton.setEnabled(false);
        quoteWindow.validate();
        quoteWindow.repaint();
    }


}
