package Frame11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Frame2.MyFrame2;

public class MyFrame11 extends JFrame implements ActionListener{

    JFrame frame;
    JPanel panel;
    JLabel label;
    JTextField textField;
    JTextField textField2;
    JLabel label2;
    JButton button;
    JButton button2;
    JLabel label3;

    public MyFrame11(){

        frame = new JFrame();
        panel = new JPanel();
        label = new JLabel("Username:");
        label2 = new JLabel("Password");
        textField = new JTextField(20);
        textField2 = new JTextField(20);
        button = new JButton("Login");
        button2 = new JButton("Exit app");
        label3 = new JLabel("");

        panel.setLayout(null);

        label.setBounds(10, 20, 80, 25);
        panel.add(label);
        textField.setBounds(100, 20, 160, 25);
        panel.add(textField);

        label2.setBounds(10, 50, 80, 25);
        panel.add(label2);

        textField2.setBounds(100, 50, 160, 25);
        panel.add(textField2);

        button.setBounds(10, 80, 80, 25);
        panel.add(button);
        button.setFocusable(false);
        button.addActionListener(this);

        button2.setBounds(120, 80, 80, 25);
        panel.add(button2);
        button2.setFocusable(false);
        button2.addActionListener(this);

        label3.setBounds(10, 110, 300, 25);
        panel.add(label3);

        this.setSize(300, 180);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = textField.getText();
        String pass = textField2.getText();
        if(user.equals("User1") && pass.equals("project123")){
            label3.setText("login successful");
            new MyFrame2();
        }else {
            label3.setText("Login failed, try again");
        }
        if(e.getSource() == button2){
            System.exit(0);
        }
    }
}