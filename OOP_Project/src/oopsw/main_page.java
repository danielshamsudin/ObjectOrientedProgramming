package oopsw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_page {
    private JButton btn1;
    private JPanel panel_main;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    public static JFrame f = new JFrame("Let's Learn English!");

    public main_page()
    {
        f.setContentPane(this.panel_main);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);
        //f.pack();
        f.setVisible(true);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                alphabet a = new alphabet();
            }
        });
        f.setLocationRelativeTo(null);
    }

    public static void main(String[] args)
    {
        new main_page();
    }
}