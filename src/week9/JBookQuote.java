package week9;

import javax.swing.*;

public class JBookQuote {
    public static void main(String[] args) {
        JFrame quote = new JFrame("Book Quote");
        quote.setSize(1250, 100);
        quote.setLocationRelativeTo(null);
        quote.add(new JTextField("“In a hole in the ground there lived a hobbit. Not a nasty, dirty, wet hole, filled with the " +
                "ends of worms and an oozy smell, nor yet a dry, bare, sandy hole with nothing in it to sit down on or " +
                "to eat: it was a hobbit-hole, and that means comfort.”"));
        quote.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        quote.setVisible(true);
    }
}
