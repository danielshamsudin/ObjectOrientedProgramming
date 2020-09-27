package oopsw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class colors {
    private JPanel panel_colors;
    private JPanel panel_btn;
    private JPanel panel_colorItem;
    private JButton whiteButton;
    private JButton blackButton;
    private JButton blueButton;
    private JButton greenButton;
    private JButton yellowButton;
    private JButton purpleButton;
    private JButton redButton;
    private JButton orangeButton;
    private JButton backButton;
    private JButton helpButton;

    public colors()
    {
        final JFrame f1 = new JFrame("Colours");
        f1.setContentPane(this.panel_colors);
        f1.setVisible(true);
        f1.pack();
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                main_page mp = new main_page();
            }
        });
        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Press on each color to learn more about it!", "Help", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        whiteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                clrWhite cw = new clrWhite();
            }
        });
        blackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                clrBlack cb = new clrBlack();
            }
        });
        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                clrBlue cb = new clrBlue();
            }
        });
        greenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                clrGreen cg = new clrGreen();
            }
        });
        orangeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                clrOrange co = new clrOrange();
            }
        });
        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                clrRed cr = new clrRed();
            }
        });
        purpleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                clrPurple cp = new clrPurple();
            }
        });
        yellowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                clrYellow cy = new clrYellow();
            }
        });
    }
}
