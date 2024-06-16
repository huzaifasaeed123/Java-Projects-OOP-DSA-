/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;
import javax.swing.*;
import javax.swing.WindowConstants;
//import java.awt.event.*;
public class RegistraionForm extends JFrame
{
    public static JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9;
    public static JTextField field1,field2;
    public static JTextArea area1,area2;
    public static JRadioButton rbtn1,rbtn2;
    public static JButton btn1;
    public static JCheckBox box1;
    public static JComboBox combo1,combo2,combo3;
    public static ButtonGroup abcd;
     public void display()
    {
        setTitle("Hello");
        setBounds(100,50,800,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        label1=new JLabel("Name:");
        label2=new JLabel("Mobile No:");
        label3=new JLabel("Gender:");
        label4=new JLabel("DOB:");
        label5=new JLabel("Address:");
        label6=new JLabel("Registraion Form");
        label7=new JLabel("Registrion Successful!!");
        field1=new JTextField();
        field2=new JTextField();
        area1=new JTextArea();
        area2=new JTextArea();
        rbtn1=new JRadioButton("Male");
        rbtn2=new JRadioButton("Female");
        btn1=new JButton("SUBMIT");
        abcd=new ButtonGroup();
        abcd.add(rbtn1);
        abcd.add(rbtn2);
        box1=new JCheckBox("Please Accept Term And Condition");
        String [] a={"Jan","Feb","March","April","May","June","July","August","September","October","November","December"};
        String [] b={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String [] c={"1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011"};
        combo1=new JComboBox(b);
        combo2=new JComboBox(a);
        combo3=new JComboBox(c);
        label6.setBounds(50,10,200,50);
        label1.setBounds(20,60,100,30);
        label2.setBounds(20,100,100,30);
        label3.setBounds(20,140,100,30);
        label4.setBounds(20,180,100,30);
        label5.setBounds(20,225,100,30);
        field1.setBounds(90,60,150,25);
        field2.setBounds(90,100,150,25);
        rbtn1.setBounds(110,145,90,25);
        rbtn2.setBounds(200,145,100,25);
        combo1.setBounds(100,185,50,25);
        combo2.setBounds(180,185,90,25);
        combo3.setBounds(300,185,70,25);
        area1.setBounds(85,225,180,80);
        area2.setBounds(400,50,300,400);
        box1.setBounds(60,320,300,40);
        btn1.setBounds(130,360,80,30);
        area1.setLineWrap(true);
        area2.setLineWrap(true);
        
        add(label6);
        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(label5);
        add(field1);
        add(field2);
        add(rbtn1);
        add(rbtn2);
        add(combo1);
        add(combo2);
        add(combo3);
        add(area1);
        add(area2);
        add(box1);
        add(btn1);
        btn1.addActionListener(new EventForm());
        this.setLayout(null);
        setVisible(true);
    }
}
