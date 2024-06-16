/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import javax.swing.*;
import javax.swing.WindowConstants;
import java.awt.event.*;
public class JCHECKBOX extends JFrame
{
    //JCHECKBOX AND JRADIOBUTTON DETAIL
    public void display()
    {
        setTitle("Hello");
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        JCheckBox check1=new JCheckBox("1st");
        JCheckBox check2=new JCheckBox("2nd");
        JCheckBox check3=new JCheckBox("3rd");
        JRadioButton btn1 =new JRadioButton("1stradio");
        JRadioButton btn2 =new JRadioButton("2ndradio");
        JRadioButton btn3 =new JRadioButton("3rdradio");
        check1.setBounds(50,50,50,50);
        check2.setBounds(50,100,50,50);
        check3.setBounds(50,150,50,50);
        btn1.setBounds(150,50,150,50);
        btn2.setBounds(150,100,150,50);
        btn3.setBounds(150,150,150,50);
        add(check1);
        add(check2);
        add(check3);
        add(btn1);
        add(btn2);
        add(btn3);
        //Essential For RadioButton to add IN ButtonGroup
        ButtonGroup abc=new ButtonGroup();
        abc.add(btn1);
        abc.add(btn2);
        abc.add(btn3);
        //SetEnabled method to disapper or apper and setSelected method to auto previous select
        btn1.setSelected(true);
        check1.setSelected(true);
        check2.setSelected(true);
        this.setLayout(null);
        setVisible(true);
    }
}
