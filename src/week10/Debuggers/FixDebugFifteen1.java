package week10.Debuggers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FixDebugFifteen1 extends JFrame implements ActionListener {
   JButton button1 = new JButton("Red");
   JButton button2 = new JButton("Pink");
   JButton button3 = new JButton("Orange");
   JButton button4 = new JButton("Yellow");
   JButton button5 = new JButton("Black");

   JPanel panel1 = new JPanel(new FlowLayout());
   JPanel panel2 = new JPanel();

   public FixDebugFifteen1() {
      setLayout(new GridLayout(1, 2));
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      add(panel1);
      add(panel2);
      panel1.add(button1);
      panel1.add(button2);
      panel1.add(button3);
      panel1.add(button4);
      panel1.add(button5);

      button1.addActionListener(this);
      button2.addActionListener(this);
      button3.addActionListener(this);
      button4.addActionListener(this);
      button5.addActionListener(this);
      setSize(400, 200);
      setVisible(true);
   }

   public static void main(String[] args) {
      new FixDebugFifteen1();
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      Object source = e.getSource();
      if (source == button1)
         panel2.setBackground(Color.RED);
      else if (source == button2)
         panel2.setBackground(Color.PINK);
      else if (source == button3)
         panel2.setBackground(Color.ORANGE);
      else if (source == button4)
         panel2.setBackground(Color.YELLOW);
      else
         panel2.setBackground(Color.YELLOW);
   }
}