package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class JVacationRental extends JFrame {

    private final JRadioButton meals;
    private JLabel totalCostLabel;
    private int locationCost;
    private int roomCost;
    private int mealCost;


    private JVacationRental() {
        setVisible(true);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        JLabel locationTitle = new JLabel("Select Location:");
        c.ipadx = 40;
        c.gridx = 0;
        c.gridy = 0;
        add(locationTitle, c);

        int parkCost = 600;
        JRadioButton locationPark = new JRadioButton("Park ($" + parkCost + ".00)");
        locationPark.setActionCommand(Integer.toString(parkCost));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        add(locationPark, c);

        int poolCost = 750;
        JRadioButton locationPool = new JRadioButton("Pool ($" + poolCost + ".00)");
        locationPool.setActionCommand(Integer.toString(poolCost));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        add(locationPool, c);

        int lakeCost = 825;
        JRadioButton locationLake = new JRadioButton("Lake ($" + lakeCost + ".00)");
        locationLake.setActionCommand(Integer.toString(lakeCost));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 3;
        add(locationLake, c);

        ButtonGroup locationGroup = new ButtonGroup();
        locationGroup.add(locationPark);
        locationGroup.add(locationPool);
        locationGroup.add(locationLake);

        ActionListener locationListener = e -> {
            locationCost = 0;
            locationCost = Integer.parseInt(e.getActionCommand());
            totalCostLabel.setText("Total cost: $" + (locationCost + roomCost + mealCost) + ".00");
        };

        locationPark.addActionListener(locationListener);
        locationPool.addActionListener(locationListener);
        locationLake.addActionListener(locationListener);

        JLabel roomsTitle = new JLabel("Select No. Rooms:");
        c.ipadx = 40;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        add(roomsTitle, c);

        JRadioButton roomsOne = new JRadioButton("1 (Base)");
        roomsOne.setActionCommand(Integer.toString(0));
        roomsOne.setSelected(true);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 1;
        add(roomsOne, c);

        int extraRoomCost = 75;
        JRadioButton roomsTwo = new JRadioButton("2 ($" + extraRoomCost + ".00)");
        roomsTwo.setActionCommand(Integer.toString(extraRoomCost));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 2;
        add(roomsTwo, c);

        JRadioButton roomsThree = new JRadioButton("3 ($" + (extraRoomCost * 2) + ".00)");
        roomsThree.setActionCommand(Integer.toString(extraRoomCost * 2));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 3;
        add(roomsThree, c);

        ButtonGroup roomsGroup = new ButtonGroup();
        roomsGroup.add(roomsOne);
        roomsGroup.add(roomsTwo);
        roomsGroup.add(roomsThree);

        ActionListener roomsListener = e -> {
            roomCost = 0;
            roomCost = Integer.parseInt(e.getActionCommand());
            totalCostLabel.setText("Total cost: $" + (locationCost + roomCost + mealCost) + ".00");
        };

        roomsOne.addActionListener(roomsListener);
        roomsTwo.addActionListener(roomsListener);
        roomsThree.addActionListener(roomsListener);

        int mealCost = 200;
        JLabel mealTitle = new JLabel("Add Meals? ($" + mealCost + ".00)");
        c.ipadx = 40;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 0;
        add(mealTitle, c);

        meals = new JRadioButton();
        meals.setActionCommand(Integer.toString(mealCost));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 1;
        add(meals, c);

        ActionListener mealsListener = e -> {
            if (meals.isSelected()) {
                this.mealCost = 0;
                this.mealCost = Integer.parseInt(e.getActionCommand());
            } else {
                this.mealCost = 0;
            }
            totalCostLabel.setText("Total cost: $" + (locationCost + roomCost + this.mealCost) + ".00");
        };

        meals.addActionListener(mealsListener);

        totalCostLabel = new JLabel("Total cost: $0.00");
        totalCostLabel.setFont(new Font("Sans-Serif", Font.BOLD, 16));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 30;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 4;
        add(totalCostLabel, c);

        setTitle("Lambert's Vacation Rentals Calculator _̴ı̴̴̡ ̡̡ ̡͌l̡̡͌ ̴̡ı̴̴̡ ̡̡͡|̲̲̲͡͡͡ ̲▫̲͡ ̲̲̲͡͡π̲̲͡͡ ̲̲͡▫̲̲͡͡ ̲|̡ ̴̡ı̴̡̡ ̡͌l̡̡̡̡._");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
    }

    public static void main(String[] args) {
        new JVacationRental();
    }

}
