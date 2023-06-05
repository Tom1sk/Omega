package Frame2;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Frame1.MyFrame1;
import Frame6.MyFrame6;
import TicTacToe.TicTacToe;

public class MyFrame2 extends JFrame implements ActionListener {
    JLabel label;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;

    public MyFrame2() {
        
        ImageIcon image = new ImageIcon("MainMenu.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.GRAY);
        
        label = new JLabel();
        label.setText("What do you want to do?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.DARK_GRAY);
        label.setFont(new Font("Arial", Font.PLAIN, 30));
        label.setIconTextGap(20);
        label.setBackground(new Color(0xF1F1F1));
        label.setOpaque(true);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 1265, 60);


        ImageIcon restaurant = new ImageIcon("Restaurant.png");
        button2 = new JButton();
        button2.setBounds(160, 180, 320, 240);
        button2.addActionListener(this);
        button2.setText("Restaurant");
        button2.setFocusable(false);
        button2.setIcon(restaurant);

        ImageIcon calculator = new ImageIcon("Calculator.png");
        button3 = new JButton();
        button3.setBounds(480, 180, 320, 240);
        button3.addActionListener(this);
        button3.setText("Calculator");
        button3.setFocusable(false);
        button3.setIcon(calculator);

        ImageIcon ticTacToe = new ImageIcon("TicTacToe.png");
        button4 = new JButton();
        button4.setBounds(800, 180, 320, 240);
        button4.addActionListener(this);
        button4.setText("TicTacToe");
        button4.setFocusable(false);
        button4.setIcon(ticTacToe);

        button5 = new JButton();
        button5.setBounds(1100, 600, 100, 40);
        button5.addActionListener(this);
        button5.setText("Exit app");
        button5.setFocusable(false);

        this.setTitle("Main menu");
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setResizable(true);
        this.setSize(1280, 720);
        this.setLayout(null);
        this.setVisible(true);
        this.add(label);
        this.setResizable(false);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button2){
            new MyFrame1();
        }
        if(e.getSource() == button3){
            new MyFrame6();
        }
        if(e.getSource() == button4){
            new TicTacToe();
        }
        if(e.getSource() == button5){
            System.exit(0);
        }
    }
}
