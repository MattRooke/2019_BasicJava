package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class JTVDownload2 extends JFrame {

    private String[] availableShows = {"Game of Thrones", "Star Trek: Discovery",
            "Another Life", "The I-Land", "Nightflyers"};
    private String[] showSynopsis = {"<html>From the scheming south and the savage eastern lands, \n" +
            "to the frozen north and ancient Wall that protects the realm from the mysterious darkness beyond, " +
            "the powerful families of the Seven Kingdoms are locked in a battle for the Iron Throne<html>",

            "<html>Star Trek: Discovery follows the voyages of Starfleet on their missions to discover new worlds and " +
                    "new lifeforms, and one Starfleet officer who must learn that to truly understand " +
                    "all things alien, you must first understand yourself.<html>",

            "<html>A deep space mission led by an astronaut, Niko Breckinridge. The thrilling ride begins when a " +
                    "mysterious UFO arrives on Earth. This UFO drops onto the planet and forms a crystal shell " +
                    "that is as mysterious as it gets.<html>",

            "<html>When ten people wake up on a treacherous island with no memory of who they are and how they got there," +
                    " they set off on a trek to try to get back home, only to discover the world is not as it seems.<html>",

            "<html>A crew of scientists embark on a mission aboard a ship called the Nightflyer to investigate a " +
                    "mysterious alien signal, but soon begin to question if there is already something on-board " +
                    "the Nightflyer with them.<html>"};

    private JTVDownload2() {
        setVisible(true);
        setTitle("On Demand TV");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JLabel selectorTitle = new JLabel("Select a show:");
        selectorTitle.setFont(new Font("Arial", Font.BOLD, 18));
        selectorTitle.setAlignmentX(-1);
        add(selectorTitle);

        JComboBox<String> showSelector = new JComboBox<>(availableShows);
        showSelector.setSelectedIndex(-1);
        showSelector.setEditable(true);
        add(showSelector);

        JLabel synopsisTitle = new JLabel("Synopsis:");
        synopsisTitle.setFont(new Font("Arial", Font.PLAIN, 16));
        add(synopsisTitle);

        JLabel synopsis = new JLabel();
        add(synopsis, BorderLayout.CENTER);

        ActionListener showSelectorListener = e -> {
            try {
                synopsis.setText(showSynopsis[showSelector.getSelectedIndex()]);
                repaint();
            } catch (Exception ex) {
                synopsis.setText("Sorry that show is not available");
            }

        };

        showSelector.addActionListener(showSelectorListener);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
    }


    public static void main(String[] args) {
        new JTVDownload2();
    }
}
