package oopsw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class colorGame {
    private JPanel panel_colorGame;
    private JPanel panel_btn;
    private JButton backButton;
    private JButton helpButton;
    private JButton checkButton;
    private JTextField clr1;
    private JTextField clr2;
    private JTextField clr3;
    private static boolean stateColor = false;

    public colorGame()
    {
        final JFrame f1 = new JFrame("Colours!");
        f1.setContentPane(this.panel_colorGame);
        f1.setVisible(true);
        f1.pack();
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        backButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                clrYellow cy = new clrYellow();
            }
        });


        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Type in the correct answer based on the picture given!\nYou can always go back if you need to!");
            }
        });
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (clr1.getText().toLowerCase().equals("orange") && clr2.getText().toLowerCase().equals("green") && clr3.getText().toLowerCase().equals("blue"))
                {
                    JOptionPane.showMessageDialog(null, "Congratulations! All Correct!");
                    stateColor = true;
                    f1.dispose();
                    main_page m = new main_page();
                }
            }
        });
    }

    static public boolean getColorState() {return stateColor;}
}
