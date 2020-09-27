package oopsw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class foodGame3 {
    private ButtonGroup bGroup = new ButtonGroup();
    private JButton backButton;
    private JButton helpButton;
    private JButton answerButton;
    private JPanel panel_foodGame3;
    private JTextField answerTextfield;
    private static boolean stateFood = false;

    public foodGame3() {

        final JFrame f1 = new JFrame("Food: Quiz 3");
        f1.setContentPane(this.panel_foodGame3);
        f1.setVisible(true);
        f1.pack();
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Type the name of the food in the box and answer!");
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                foodGame2 f = new foodGame2();
            }
        });

        answerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (answerTextfield.getText().toLowerCase().equals("eggs")) {
                    stateFood = true;
                    JOptionPane.showMessageDialog(null, "Congratulations!! You have completed Food.");
                    f1.dispose();
                    main_page m = new main_page();
                }
                else JOptionPane.showMessageDialog(null, "Wrong answer, try again!!");
            }
        });
    }

    public static boolean getFoodState(){return stateFood;}
}