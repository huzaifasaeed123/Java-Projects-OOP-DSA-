/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testattandance1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author saeed
 */
public class Main extends JFrame implements ActionListener
{
    public static JButton btn3=new JButton("New");
    public static JButton btn4=new JButton("Update");
    public void mainstart()
    {
        setTitle("Class Selection");
        setSize(300,300);
        setLocation(100,10);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        btn3.setBounds(10,20,100,30);
        btn4.setBounds(10,60,100,30);
        add(btn3);
        add(btn4);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        
        setLayout(null);
        setVisible(true); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource()==btn3)
        {
            MainFrame obj=new MainFrame();
            obj.start1();
            
        }
        else if(e.getSource()==btn4)
        {
            Update obj1=new Update();
            obj1.update1();
            
        }
    }
}
