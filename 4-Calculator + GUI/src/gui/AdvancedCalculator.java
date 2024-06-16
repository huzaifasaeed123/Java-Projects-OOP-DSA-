
package gui;

import javax.swing.*;
import javax.swing.WindowConstants;
import java.awt.event.*;

/**
 *
 * @author saeed
 */
public class AdvancedCalculator extends JFrame implements ActionListener
{
    JTextField field1,field3;
    public static String str1="";
    public static int num3=0;
   // JLabel label1,label2;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14;
    
    public void display()
    {
        setTitle("SIMPLE CALCULATOR");
        //setSize(500,300);
        this.setBounds(300, 50, 300, 450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        this.setLayout(null);
       JLabel label1=new JLabel("Result:");
      // JLabel label2=new JLabel("2nd Value:");
       JLabel label3=new JLabel("TYPED :");
       JLabel label4=new JLabel("ADVANCE CALCULATOR BY HUZAIFA SAEED:");
      field1=new JTextField();
      // field2=new JTextField();
       field3=new JTextField();
       btn1=new JButton("1");
       btn2=new JButton("2");
       btn3=new JButton("3");
       btn4=new JButton("4");
       btn5=new JButton("5");
       btn6=new JButton("6");
       btn7=new JButton("7");
       btn8=new JButton("8");
       btn9=new JButton("9");
       btn10=new JButton("0");
      btn11=new JButton("ADD");
      btn12=new JButton("MINUS");
      btn13=new JButton("MULTIPLY");
      btn14=new JButton("DIVIDE");
      label1.setBounds(10, 50, 100, 30);
     // label2.setBounds(50, 100, 100, 30);
      label3.setBounds(10, 100, 100, 30);
      label4.setBounds(10, 10, 400, 40);
     // field2.setBounds(150, 100, 100, 30);
      field1.setBounds(70, 50, 200, 30);
      field3.setBounds(70, 100, 200, 30);
      btn11.setBounds(10,150,100,30);
      btn12.setBounds(120,150,100,30);
      btn13.setBounds(10,200,100,30);
      btn14.setBounds(120,200,100,30);
      btn1.setBounds(10,250,70,30);
      btn2.setBounds(85,250,70,30);
      btn3.setBounds(160,250,70,30);
      btn4.setBounds(10,285,70,30);
      btn5.setBounds(85,285,70,30);
      btn6.setBounds(160,285,70,30);
      btn7.setBounds(10,320,70,30);
      btn8.setBounds(85,320,70,30);
      btn9.setBounds(160,320,70,30);
      btn10.setBounds(85,355,70,30);
       this.add(field1);
      // this.add(field2);
       this.add(field3);
        this.add(label1);
       // this.add(label2);
        this.add(label3);
        this.add(label4);
        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        this.add(btn4);
        this.add(btn5);
        this.add(btn6);
        this.add(btn7);
        this.add(btn8);
        this.add(btn9);
        this.add(btn10);
        this.add(btn11);
        this.add(btn12);
        this.add(btn13);
        this.add(btn14);
        setVisible(true);
       btn1.addActionListener(this);
       btn2.addActionListener(this);
       btn3.addActionListener(this);
       btn4.addActionListener(this);
       btn5.addActionListener(this);
       btn6.addActionListener(this);
       btn7.addActionListener(this);
       btn8.addActionListener(this);
       btn9.addActionListener(this);
       btn10.addActionListener(this);
        btn11.addActionListener(this);
        btn12.addActionListener(this);
        btn13.addActionListener(this);
        btn14.addActionListener(this);
       // button1.addActionListener(new EventHandle());
    }
    
    @Override
    public void actionPerformed(ActionEvent a)
    {
          if(a.getSource()==btn1)
      {   
        int num1=Integer.parseInt("1");
        String str2=String.valueOf(num1);
         str1=str1+str2;
        field3.setText(str1);
      }
        else  if(a.getSource()==btn2)
      {   
        int num1=Integer.parseInt("2");
        String str2=String.valueOf(num1);
         str1=str1+str2;
        field3.setText(str1);
      }
         else  if(a.getSource()==btn3)
      {   
        int num1=Integer.parseInt("3");
        String str2=String.valueOf(num1);
         str1=str1+str2;
        field3.setText(str1);
      }
         else  if(a.getSource()==btn4)
      {   
        int num1=Integer.parseInt("4");
        String str2=String.valueOf(num1);
         str1=str1+str2;
        field3.setText(str1);
      }
       else  if(a.getSource()==btn5)
      {   
        int num1=Integer.parseInt("5");
        String str2=String.valueOf(num1);
         str1=str1+str2;
        field3.setText(str1);
      }
       else  if(a.getSource()==btn6)
      {   
        int num1=Integer.parseInt("6");
        String str2=String.valueOf(num1);
         str1=str1+str2;
        field3.setText(str1);
      }
       else  if(a.getSource()==btn7)
      {   
        int num1=Integer.parseInt("7");
        String str2=String.valueOf(num1);
         str1=str1+str2;
        field3.setText(str1);
      }
       else  if(a.getSource()==btn8)
      {   
        int num1=Integer.parseInt("8");
        String str2=String.valueOf(num1);
         str1=str1+str2;
        field3.setText(str1);
      }
       else  if(a.getSource()==btn9)
      {   
        int num1=Integer.parseInt("9");
        String str2=String.valueOf(num1);
         str1=str1+str2;
        field3.setText(str1);
      }
       else  if(a.getSource()==btn10)
      {   
        int num1=Integer.parseInt("0");
        String str2=String.valueOf(num1);
         str1=str1+str2;
        field3.setText(str1);
      }
       
        
        
     else if(a.getSource()==btn11)
      {   
        int num1=Integer.parseInt(str1);
        num3=num3+num1;
        String str=String.valueOf(num3);
        field1.setText(str);
        cleartext();
//      int num2=Integer.parseInt(field2.getText());
//        //System.out.println(num1+num2);
//        String str=String.valueOf(num1+num2);
//        field3.setText(str);
      }
      else if(a.getSource()==btn12)
      {   
        int num1=Integer.parseInt(str1);
        num3=num3-num1;
        String str=String.valueOf(num3);
        field1.setText(str);
        cleartext();
      }
      else if(a.getSource()==btn13)
      {   
        int num1=Integer.parseInt(str1);
        num3=num3*num1;
        String str=String.valueOf(num3);
        field1.setText(str);
        cleartext();
      }
      if(a.getSource()==btn14)
      {   
        int num1=Integer.parseInt(str1);
        num3=num3/num1;
        String str=String.valueOf(num3);
        field1.setText(str);
        cleartext();
      }
      
    }
    public void cleartext()
    {
        field3.setText("");
        str1="";
    }
}