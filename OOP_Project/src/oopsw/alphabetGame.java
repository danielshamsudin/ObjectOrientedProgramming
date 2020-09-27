package oopsw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class alphabetGame {

    private JPanel panel_alphagame;
    private JLabel lblTitle;
    private JPanel panel_btns;
    private JPanel panel_item;
    private JButton btnCheck;
    private JButton btnBack;
    private JButton btnHelp;
    private JRadioButton radioButton1;
    private JRadioButton ansA;
    private JRadioButton ansW;
    private JRadioButton ansK;
    private JRadioButton ansM;
    private JRadioButton ansB;
    private JRadioButton ansE;
    private JRadioButton ansZ;
    private JRadioButton ansC;
    private JRadioButton ansJ;
    private JRadioButton ansQ;
    private JRadioButton ansO;
    private JRadioButton ansI;
    private static boolean stateAlphabet = false;

    public alphabetGame()
    {
        final JFrame f1 = new JFrame("Alphabets");
        f1.setContentPane(this.panel_alphagame);
        f1.setVisible(true);
        f1.pack();
        f1.setLocationRelativeTo(null); //center on screen display
        f1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        btnCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ansM.isSelected() && ansZ.isSelected() && ansI.isSelected())
                {
                    JOptionPane.showMessageDialog(null, "Congratulations! All Correct!");
                    stateAlphabet = true;
                    f1.dispose();
                    main_page m = new main_page();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Please Try Again!");
                }
            }
        });
        btnHelp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Select the correct answer based on the picture given. All the best!");
            }
        });
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                alphabet aa = new alphabet();
            }
        });
    }

    static public boolean getAlphaState()
    {
        return stateAlphabet;
    }


}
