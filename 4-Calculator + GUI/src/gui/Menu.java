/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import javax.swing.*;
import javax.swing.WindowConstants;
import java.awt.event.*;
public class Menu extends JFrame
{
     public void display()
    {
        setTitle("Hello");
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        JMenuBar a1=new JMenuBar();
        
        JMenu file1=new JMenu("NEW FILE");
        JMenu file2=new JMenu("EDIT NOW");
        
        JMenuItem i1=new JMenuItem("AAA");
        JMenuItem i2=new JMenuItem("bbb");
        JMenuItem i3=new JMenuItem("ccc");
        JMenuItem i4=new JMenuItem("ddd");
        JMenuItem i5=new JMenuItem("eeeeee");
        JMenuItem i6=new JMenuItem("fffff");
        file1.add(i1);
        file1.add(i2);
        file1.add(i3);
        file1.add(file2);
        file2.add(i4);
        file2.add(i5);
        file2.add(i6);
        a1.add(file1);
        a1.add(file2);
        this.setJMenuBar(a1);
        
        
        
        this.setLayout(null);
        setVisible(true);
        
    }
    
}
