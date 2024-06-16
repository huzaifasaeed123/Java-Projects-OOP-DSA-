/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import javax.swing.*;
import javax.swing.WindowConstants;
import java.awt.event.*;
public class JCOMBOBOX extends JFrame
{
    public JComboBox a1;
    public JButton btn1;
    public JTextField field1;
    //JCHECKBOX AND JRADIOBUTTON DETAIL
    public void display()
    {
        setTitle("Hello");
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        String [] valaue={"HUZAIFA","SAEED","BASIR","KHOTA"};
        a1=new JComboBox(valaue);
        a1.setBounds(100,100,100,30);
        add(a1);
        a1.setEnabled(true);
        a1.setSelectedIndex(2);
       // a1.setSelectedItem("KHOTA");
        System.out.println(a1.getSelectedItem());
        //a1.addItem("HELLO");
       // a1.removeItem("BASIR");
        btn1=new JButton("OK");
        field1=new JTextField();
        btn1.setBounds(100,200,100,30);
        field1.setBounds(100,300,100,30);
        add(btn1);
        add(field1);
        this.setLayout(null);
        setVisible(true);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                field1.setText((String)a1.getSelectedItem());
            }
        });
        
    }
}
