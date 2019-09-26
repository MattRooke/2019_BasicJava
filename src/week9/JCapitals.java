package week9;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class JCapitals implements ListSelectionListener {

    private static String[] COUNTRIES = {"Australia", "France", "New Zealand", "Italy", "Scotland", "Indonesia", "Japan"};
    private static String[] CAPITALS = {"Canberra", "Paris", "Wellington", "Rome", "Edinburgh", "Jakarta", "Tokyo"};
    private JFrame window;
    private JList selectionList;
    private JLabel capitalName;


    JCapitals() {
        window = new JFrame("Capital city finder");
        selectionList = new JList<>(COUNTRIES);
        capitalName = new JLabel();
        window.setVisible(true);
        window.setLayout(new BorderLayout());
        window.setSize(300, 600);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.add(selectionList, BorderLayout.WEST);
        window.add(capitalName, BorderLayout.CENTER);
        capitalName.setFont(new Font("Arial", Font.BOLD, 22));
        capitalName.setHorizontalAlignment(JTextField.HORIZONTAL);
        selectionList.addListSelectionListener(this);
    }

    public static void main(String[] args) {
        new JCapitals();
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            capitalName.setText(CAPITALS[selectionList.getSelectedIndex()]);
        }
        window.validate();
        window.repaint();
    }


}
