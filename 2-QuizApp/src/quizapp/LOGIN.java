/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizapp;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author saeed
 */
public class LOGIN extends JFrame implements ActionListener
{
    public JButton btn;
    public JTextField field;
    Icon ic = new ImageIcon(this.getClass().getResource("img1.gif"));
    public JLabel icon = new JLabel(ic);
    public void login1()
    {
        setTitle("Quiz");
        setSize(700,600);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.GRAY);
        JLabel label=new JLabel("PLEASE ENTER YOUR NAME TO CONTINE GAME");
        label.setFont(new Font("ALGERIAN", Font.BOLD, 15));
        field=new JTextField();
        btn=new JButton("Start Game");
        btn.setBackground(Color.white);
        label.setBounds(100,440,400,30);
        field.setBounds(100,480,200,30);
        btn.setBounds(100,520,100,30);
        icon.setBounds(0, 0, 700, 400);
        btn.addActionListener(this);
        add(icon);
        add(label);
        add(field);
        add(btn);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     
        if(e.getSource()==btn)
        {
            String str=field.getText();
            DisplayQuiz obj=new DisplayQuiz(str);
            
        try {
            obj.display1();
            dispose();
        } catch (IOException ex) {
            Logger.getLogger(QuizApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
    
}
