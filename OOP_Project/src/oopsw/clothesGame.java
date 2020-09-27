package oopsw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class clothesGame {
    private JPanel panel_clothesGame;
    private JLabel lblTitle;
    private JPanel panel_btns;
    private JButton btnBack;
    private JButton btnCheck;
    private JButton btnHelp;
    private JPanel panel_item;
    private JRadioButton ansCap;
    private JRadioButton ans3;
    private JRadioButton ans4;
    private JRadioButton ans2;
    private JRadioButton ans5;
    private JRadioButton ans7;
    private JRadioButton ansShirt;
    private JRadioButton ans6;
    private JRadioButton ans8;
    private JRadioButton ansSocks;
    private JRadioButton ans10;
    private JRadioButton ans9;
    private static boolean stateClothes = false;

    public clothesGame() {
        final JFrame f1 = new JFrame("Alphabets");
        f1.setContentPane(this.panel_clothesGame);
        f1.setVisible(true);
        f1.pack();
        f1.setLocationRelativeTo(null); //center on screen display
        f1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                clothes cc = new clothes();
            }
        });


        btnHelp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Select the correct answer based on the picture given. All the best!");
            }
        });
        btnCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ansCap.isSelected() && ansShirt.isSelected() && ansSocks.isSelected())
                {
                    JOptionPane.showMessageDialog(null, "Congratulations! All Correct!");
                    stateClothes = true;
                    f1.dispose();
                    main_page m = new main_page();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Please Try Again!");
                }
            }
        });
    }

    public static boolean getClothesState(){return stateClothes;}
}
