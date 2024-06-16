/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testattandance1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author saeed
 */
public class Main extends JFrame implements ActionListener
{
    public static JButton btn3=new JButton(" Attendance For New Class");
    public static JButton btn4=new JButton(" Attendance To Update");
     Icon b = new ImageIcon(this.getClass().getResource("Lab project 4.jpg"));
    public JLabel icon2 = new JLabel(b);
    
    public void mainstart()
    {
       
        setTitle("Class Selection");
        setSize(450,480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE );
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        btn3.setBounds(125,320,190,40);
        btn4.setBounds(125,370,190,40);
        add(btn3);
        add(btn4);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        icon2.setBounds(0, 0, 450, 300);
        add(icon2);
       
        
        setLayout(null);
        setVisible(true); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource()==btn3)
        {
            MainFrame obj=new MainFrame();
            obj.start1();
            dispose();
        }
        else if(e.getSource()==btn4)
        {
            Update obj1=new Update();
            obj1.update1();
            dispose();
        }
    }
}
