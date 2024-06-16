
package gui;

import javax.swing.*;
import javax.swing.WindowConstants;
import java.awt.event.*;

/**
 *
 * @author saeed
 */
public class Calculator extends JFrame implements ActionListener
{
    JTextField field1,field2,field3;
    
   // JLabel label1,label2;
    JButton btn1,btn2,btn3,btn4;
    
    public void display()
    {
        setTitle("SIMPLE CALCULATOR");
        //setSize(500,300);
        this.setBounds(300, 250, 500, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        this.setLayout(null);
       JLabel label1=new JLabel("1st Value:");
       JLabel label2=new JLabel("2nd Value:");
       JLabel label3=new JLabel("Result:");
       JLabel label4=new JLabel("SIMPLE CALCULATOR:");
      field1=new JTextField();
       field2=new JTextField();
       field3=new JTextField();
      btn1=new JButton("ADD");
      btn2=new JButton("MINUS");
      btn3=new JButton("MULTIPLY");
      btn4=new JButton("DIVIDE");
      label1.setBounds(50, 50, 100, 30);
      label2.setBounds(50, 100, 100, 30);
      label3.setBounds(50, 200, 100, 30);
      label4.setBounds(150, 10, 400, 40);
      field2.setBounds(150, 100, 100, 30);
      field1.setBounds(150, 50, 100, 30);
      field3.setBounds(150, 200, 100, 30);
      btn1.setBounds(10,150,100,30);
      btn2.setBounds(120,150,100,30);
      btn3.setBounds(240,150,100,30);
      btn4.setBounds(360,150,100,30);
       this.add(field1);
       this.add(field2);
       this.add(field3);
        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(label4);
        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        this.add(btn4);
        setVisible(true);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
       // button1.addActionListener(new EventHandle());
    }
    
    @Override
    public void actionPerformed(ActionEvent a)
    {
      if(a.getSource()==btn1)
      {   
        int num1=Integer.parseInt(field1.getText());
      int num2=Integer.parseInt(field2.getText());
        //System.out.println(num1+num2);
        String str=String.valueOf(num1+num2);
        field3.setText(str);
      }
      else if(a.getSource()==btn2)
      {   
        int num1=Integer.parseInt(field1.getText());
      int num2=Integer.parseInt(field2.getText());
        //System.out.println(num1+num2);
        String str=String.valueOf(num1-num2);
        field3.setText(str);
      }
      else if(a.getSource()==btn3)
      {   
        int num1=Integer.parseInt(field1.getText());
      int num2=Integer.parseInt(field2.getText());
       // System.out.println(num1+num2);
        String str=String.valueOf(num1*num2);
        field3.setText(str);
      }
      if(a.getSource()==btn4)
      {   
        int num1=Integer.parseInt(field1.getText());
      int num2=Integer.parseInt(field2.getText());
       // System.out.println(num1+num2);
        String str=String.valueOf(num1/num2);
        field3.setText(str);
      }
      
    }
    
}