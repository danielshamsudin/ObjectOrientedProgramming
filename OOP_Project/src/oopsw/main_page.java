package oopsw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_page {
    private JButton btnAlpha;
    private JPanel panel_main;
    private JButton colorsButton;
    private JButton clothesButton;
    private JButton animalButton;
    private JButton foodButton;
    private JButton numbersButton;
    public static JFrame f = new JFrame("Let's Learn English!");

    public main_page()
    {
        f.setContentPane(this.panel_main);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);
        //f.pack();
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        btnAlpha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                alphabet a = new alphabet();
            }
        });

        colorsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                colors c = new colors();
            }
        });

        animalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                animalsFarm1 af1 = new animalsFarm1();
            }
        });

        numbersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                numbers nn = new numbers();
            }
        });

        foodButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                food ff = new food();
            }
        });

        clothesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                clothes cc = new clothes();
            }
        });
        if (alphabetGame.getAlphaState())
            btnAlpha.setText("Alphabets! (✓)");

        if (colorGame.getColorState())
            colorsButton.setText("Colours! (✓)");

        if (animalsGame3.getAnimalState())
            animalButton.setText("Animals! (✓)");

        if (numbersGame3.getNumberState())
            numbersButton.setText("Numbers! (✓)");

        if (clothesGame.getClothesState())
            clothesButton.setText("Clothes! (✓)");


    }

    public static void main(String[] args)
    {
        new main_page();
    }
}
