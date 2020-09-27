package oopsw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class numbersGame3 {
    private JRadioButton sixRadioButton;
    private JRadioButton threeRadioButton;
    private JRadioButton twoRadioButton;
    private JRadioButton nineRadioButton;
    private ButtonGroup bGroup = new ButtonGroup();
    private JButton backButton;
    private JButton helpButton;
    private JButton answerButton;
    private JPanel panel_numbersGame3;
    private static boolean stateNumber = false;

    public numbersGame3() {
        bGroup.add(sixRadioButton);
        bGroup.add(threeRadioButton);
        bGroup.add(twoRadioButton);
        bGroup.add(nineRadioButton);

        final JFrame f1 = new JFrame("Numbers: Quiz 3");
        f1.setContentPane(this.panel_numbersGame3);
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
                numbersGame2 n = new numbersGame2();
            }
        });

        answerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(twoRadioButton.isSelected()) {
                    stateNumber = true;
                    JOptionPane.showMessageDialog(null, "Congratulations!! You have completed Numbers.");
                    f1.dispose();
                    main_page m = new main_page();
                }
                else if(sixRadioButton.isSelected() || nineRadioButton.isSelected() || threeRadioButton.isSelected())
                    JOptionPane.showMessageDialog(null, "Wrong answer!!");
                else
                    JOptionPane.showMessageDialog(null, "PLease select one answer!!");
            }
        });
    }

    public static boolean getNumberState() { return stateNumber;}
}