
package gui;

import javax.swing.*;
import javax.swing.WindowConstants;
import java.awt.event.*;

/**
 *
 * @author saeed
 */
public class MainFrame extends JFrame implements ActionListener
{
    JTextField field1;
    JPasswordField pass;
   // JLabel label1,label2;
    //JButton button1;
    
    public void display()
    {
        setTitle("Hello");
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        this.setLayout(null);
//        add(button1);
//        button1.setBounds(100 ,100, 100, 100);
//        button1.setText("abc");
//        //field1.setBounds(, WIDTH, WIDTH, HEIGHT);

       JLabel label1=new JLabel("Usename");
       JLabel label2=new JLabel("Password");
      field1=new JTextField();
       pass=new JPasswordField(10);
      JButton btn1=new JButton("LOGIN");
        label1.setBounds(50, 50, 100, 30);
        label2.setBounds(50, 100, 100, 30);
        pass.setBounds(150, 100, 100, 30);
      field1.setBounds(150, 50, 100, 30);
      btn1.setBounds(100,150,100,30);
       this.add(field1);
        this.add(label1);
        this.add(label2);
        this.add(pass);
        this.add(btn1);
        setVisible(true);
        //btn1.addActionListener(this);
        btn1.addActionListener(new EventHandle());
    }
    
    @Override
    public void actionPerformed(ActionEvent a)
    {
       System.out.printf("Username:%s\nPassword:",field1.getText());
        //System.out.println(field1.getText());
        System.out.println(pass.getText());
    }
    
}