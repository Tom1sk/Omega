package Frame6;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame6 extends JFrame implements ActionListener , FocusListener{

    JFrame frame;
    JLabel label1;
    JLabel label2;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JTextField textField;
    JTextField textField2;
    public static int cislo1;
    public static int cislo2;
    public static int vysledek1;
    public static int vysledek2;
    public static int vysledek3;
    public static int vysledek4;

    public MyFrame6(){
        label1 = new JLabel();
        label1.setText("Calculator");
        //label.setIcon(image2);
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.CENTER);
        label1.setForeground(new Color(0x000000));
        label1.setFont(new Font("Arial",Font.PLAIN, 80));
        //label.setIconTextGap();
        label1.setBackground(new Color(0xF1F1F1));
        label1.setOpaque(true);
        //label.setBorder(border);
        label1.setVerticalAlignment(JLabel.TOP);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setBounds(0, 0, 200, 40);

        textField = new JTextField();
        textField2 = new JTextField();
        //textField.setPreferredSize(new Dimension(250, 40));
        //textField2.setPreferredSize(new Dimension(250, 40));
        textField.setBounds(440, 140, 400, 50);
        textField.setText("Enter first number than submit it ");
        textField2.setBounds(440, 200, 400, 50);
        textField2.setText("Enter second number than submit it ");

        button1 = new JButton();
        button1.setBounds(290, 270, 100, 50);
        button1.addActionListener(this);
        button1.setText("+");
        button1.setFocusable(false);

        button2 = new JButton();
        button2.setBounds(490, 270, 100, 50);
        button2.addActionListener(this);
        button2.setText("-");
        button2.setFocusable(false);

        button3 = new JButton();
        button3.setBounds(690, 270, 100, 50);
        button3.addActionListener(this);
        button3.setText("*");
        button3.setFocusable(false);

        button4 = new JButton();
        button4.setBounds(890, 270, 100, 50);
        button4.addActionListener(this);
        button4.setText("/");
        button4.setFocusable(false);

        button5 = new JButton();
        button5.setBounds(860, 140, 100, 50);
        button5.addActionListener(this);
        button5.setText("Submit number1");
        button5.setFocusable(false);

        button6 = new JButton();
        button6.setBounds(860, 200, 100, 50);
        button6.addActionListener(this);
        button6.setText("Submit number2");
        button6.setFocusable(false);

        button7 = new JButton();
        button7.setBounds(1100, 600, 100, 40);
        button7.addActionListener(this);
        button7.setText("Exit app");
        button7.setFocusable(false);
        this.add(button7);

        label2 = new JLabel();
        label2.setText(" ");
        //label.setIcon(image2);
        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setVerticalTextPosition(JLabel.TOP);
        label2.setForeground(new Color(0x000000));
        label2.setFont(new Font("MV Boli", Font.BOLD, 30));
        //label.setIconTextGap();
        label2.setBackground(new Color(0xF1F1F1));
        label2.setOpaque(true);
        //label.setBorder(border);
        label2.setVerticalAlignment(JLabel.TOP);
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setBounds(0, 0, 1265, 160);

        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1280, 720);
        this.setLayout(null);
        //this.add(label2);
        this.setResizable(true);
        this.setVisible(true);
        this.add(textField);
        this.add(textField2);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.add(button6);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button5){
            String cislo1String = textField.getText();
            cislo1 = Integer.parseInt(cislo1String);
        }
        if(e.getSource() == button6){
            String cislo2String = textField2.getText();
            cislo2 = Integer.parseInt(cislo2String);
        }
        if(e.getSource() == button1){
            MyFrame6.vysledek1 = cislo1 + cislo2;
            new Frame7.MyFrame7();
        }
        if(e.getSource() == button2){
            MyFrame6.vysledek2 = cislo1 - cislo2;
            new Frame8.MyFrame8();
        }
        if(e.getSource() == button3){
            MyFrame6.vysledek3 = cislo1 * cislo2;
            new Frame9.MyFrame9();
        }
        if(e.getSource() == button4){
            MyFrame6.vysledek4 = cislo1 / cislo2;
            new Frame10.MyFrame10();
        }
        if(e.getSource() == button7){
            System.exit(0);
        }
    }
    @Override
    public void focusGained(FocusEvent e) {
        if (textField.getText().equals("Enter first number than submit it ")) {
            textField.setText("");
            textField.setForeground(Color.BLACK);
        }
        if (textField2.getText().equals("Enter second number than submit it ")) {
            textField2.setText("");
            textField2.setForeground(Color.BLACK);
        }
    }
    @Override
    public void focusLost(FocusEvent e) {
        if (textField.getText().isEmpty()) {
            textField.setForeground(Color.GRAY);
            textField.setText("Enter first number than submit it ");
        }
        if (textField2.getText().isEmpty()) {
            textField2.setForeground(Color.GRAY);
            textField2.setText("Enter second number than submit it ");
        }
    }
}
