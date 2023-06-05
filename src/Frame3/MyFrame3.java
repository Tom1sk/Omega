package Frame3;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Frame4.MyFrame4;
import Frame5.MyFrame5;

public class MyFrame3 extends JFrame implements ActionListener {
    JLabel label;
    JFrame frame;
    JButton button1;
    JButton button2;
    JTextField textField;
    JTextField textField2;
    public MyFrame3() {

        label = new JLabel();
        label.setText("Log in");
        //label.setIcon(image2);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x000000));
        label.setFont(new Font("MV Boli",Font.BOLD, 30));
        //label.setIconTextGap();
        label.setBackground(new Color(0xF1F1F1));
        label.setOpaque(true);
        //label.setBorder(border);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 1265, 50);
        ////////////////////////////////////////////
        //ImageIcon Fries = new ImageIcon("Fries.png");
        button1 = new JButton();
        button1.setText("");
        button1.setBounds(450, 250, 150, 50);
        button1.addActionListener(this);
        button1.setText("Log in");
        button1.setFocusable(false);
        //button1.setIcon(Fries);

        //ImageIcon hamburger = new ImageIcon("Hamburger.png");
        button2 = new JButton();
        button2.setBounds(700, 250, 150, 50);
        button2.addActionListener(this);
        button2.setText("Cancel");
        button2.setFocusable(false);
        //button2.setIcon(hamburger);

        textField = new JTextField();
        textField2 = new JTextField();
        //textField.setPreferredSize(new Dimension(250, 40));
        //textField2.setPreferredSize(new Dimension(250, 40));
        textField.setBounds(450, 100, 400, 50);
        textField.setText("Enter your username: ");
        textField2.setBounds(450, 200, 400, 50);
        textField2.setText("Enter your password(4-8char.): ");

        this.setTitle("Login menu");
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setResizable(true);
        this.setSize(1280, 720);
        this.setLayout(null);
        this.add(label);
        this.setResizable(false);
        this.add(textField);
        this.add(textField2);
        this.add(button1);
        this.add(button2);
        this.setVisible(true);
        /*
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.add(button6);
          */
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            if(textField2.getText().length() > 3 && textField2.getText().length() < 9){
                new MyFrame4();
            }else {
                new MyFrame5();
            }
        }
        if(e.getSource() == button2) {
            System.exit(0);
        }
    }
}

