/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manageme_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author saeed
 */
public class Login extends JFrame implements ActionListener{
    Frame F = new Frame();
    JLabel li = new JLabel();
    JLabel lun = new JLabel();
    JLabel lup = new JLabel();
    JLabel linv = new JLabel();
    JTextField tun = new JTextField();
    JPasswordField tup = new JPasswordField();
    JButton B = new JButton();
    JButton R = new JButton();
    
    public void intializer(){
        li.setText("LOGIN");
        li.setBounds(0, 15, 400, 50);
        li.setFont(new Font("Time New Roman",Font.PLAIN+Font.BOLD,50));
        li.setHorizontalAlignment(JLabel.CENTER);
        this.add(li);
        
        linv.setText("");
        linv.setBounds(0, 70, 400, 15);
        linv.setFont(new Font("Time New Roman",Font.PLAIN,15));
        linv.setHorizontalAlignment(JLabel.CENTER);
        linv.setForeground(Color.red);
        this.add(linv);
        
        lun.setText("User Name");
        lun.setBounds(20, 80, 150, 40);
        lun.setFont(new Font("Time New Roman",Font.PLAIN+Font.BOLD,25));
        this.add(lun);
        
        tun.setText("");
        tun.setBounds(200, 90, 160, 25);
        tun.setFont(new Font("Time New Roman",Font.PLAIN,18));
        tun.setBackground(Color.lightGray);
        this.add(tun);
        
        lup.setText("Password");
        lup.setBounds(20, 130, 150, 40);
        lup.setFont(new Font("Time New Roman",Font.PLAIN+Font.BOLD,25));
        this.add(lup);
        
        tup.setText("");
        tup.setBounds(200,140, 160, 25);
        tup.setFont(new Font("Time New Roman",Font.PLAIN,18));
        tup.setBackground(Color.lightGray);
        this.add(tup);
        
        B.setText("Submit");
        B.setBounds(20, 180, 150, 30);
        B.addActionListener(this);
        B.setFont(new Font("Time New Roman",Font.PLAIN+Font.BOLD,25));
        this.add(B);
        
        R.setText("Reset");
        R.setBounds(210, 180, 150, 30);
        R.addActionListener(this);
        R.setFont(new Font("Time New Roman",Font.PLAIN+Font.BOLD,25));
        this.add(R);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==B){
        if("fazal".equals(tun.getText()) && "123".equals(tup.getText())){
        F.setExtendedState(JFrame.MAXIMIZED_BOTH);
        F.setTitle("FAST FOOD REST");
        F.intializer();
        F.getContentPane().setBackground(Color.BLACK);
        F.setLayout(null);
        F.setVisible(true);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        else{
            linv.setText("Invalid UserName Or Password");
        }
        }
        if(e.getSource()==R){
            tun.setText("");
            tup.setText("");
            linv.setText("");
        }
    }
}
