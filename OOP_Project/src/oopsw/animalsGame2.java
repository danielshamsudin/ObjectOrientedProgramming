package oopsw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class animalsGame2 {
    private JRadioButton henRadioButton;
    private JRadioButton ducklingRadioButton;
    private JRadioButton gooseRadioButton;
    private JRadioButton chickRadioButton;
    private ButtonGroup bGroup = new ButtonGroup();
    private JButton backButton;
    private JButton helpButton;
    private JButton answerButton;
    private JPanel panel_animalsGame2;

    public animalsGame2() {
        bGroup.add(henRadioButton);
        bGroup.add(ducklingRadioButton);
        bGroup.add(gooseRadioButton);
        bGroup.add(chickRadioButton);

        final JFrame f1 = new JFrame("Animals: Quiz 2");
        f1.setContentPane(this.panel_animalsGame2);
        f1.setVisible(true);
        f1.pack();
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Choose one selection and answer!");
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                animalsGame1 a = new animalsGame1();
            }
        });

        answerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (chickRadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Correct answer, congratulations!!");
                    f1.dispose();
                    animalsGame3 a = new animalsGame3();
                } else if (henRadioButton.isSelected() || ducklingRadioButton.isSelected() || gooseRadioButton.isSelected())
                    JOptionPane.showMessageDialog(null, "Wrong answer, try again!!");
                else
                    JOptionPane.showMessageDialog(null, "PLease select one answer!!");
            }
        });


    }
}