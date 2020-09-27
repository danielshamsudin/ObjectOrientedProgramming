package oopsw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class numbersGame1 {
    private JRadioButton fourRadioButton;
    private JRadioButton sixRadioButton;
    private JRadioButton eightRadioButton;
    private JRadioButton fiveRadioButton;
    private ButtonGroup bGroup = new ButtonGroup();
    private JButton backButton;
    private JButton helpButton;
    private JButton answerButton;
    private JPanel panel_numbersGame1;

    public numbersGame1() {
        bGroup.add(fourRadioButton);
        bGroup.add(sixRadioButton);
        bGroup.add(eightRadioButton);
        bGroup.add(fiveRadioButton);

        final JFrame f1 = new JFrame("Numbers: Quiz 1");
        f1.setContentPane(this.panel_numbersGame1);
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
                numbers n = new numbers();
            }
        });

        answerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(fiveRadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Correct answer, congratulations!!");
                    f1.dispose();
                    numbersGame2 n = new numbersGame2();
                }
                else if(fourRadioButton.isSelected() || sixRadioButton.isSelected() || eightRadioButton.isSelected())
                    JOptionPane.showMessageDialog(null, "Wrong answer, try again!!");
                else
                    JOptionPane.showMessageDialog(null, "PLease select one answer!!");
            }
        });



    }
}
