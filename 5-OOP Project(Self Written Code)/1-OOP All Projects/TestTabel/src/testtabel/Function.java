/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Admin
 */
public class Function extends JFrame implements MouseListener
{
    
    JLabel lbName=new JLabel();
    JTextField txtName=new JTextField();
    JLabel lbFName=new JLabel();
    JTextField txtFName=new JTextField();
    JLabel lbAge=new JLabel();
    JTextField txtAge=new JTextField();
    JLabel lbGender=new JLabel();
    JRadioButton rdMale=new JRadioButton();
    JRadioButton rdFemale=new JRadioButton();
    Font f=new Font("Times New Roman",Font.PLAIN,24);
    ButtonGroup grp=new ButtonGroup();
    
    JButton btnAdd=new JButton();
    JButton btnRead=new JButton();
    JButton btnDelete=new JButton();
    
    String[][] data={
             // {"Adil","Ahmed","40","Male"},
               // {"Khurram","Niaz","45","Male"},
                 // {"Sadia","Umer","30","Female"},
                   // {"Adnan","Ahmed","40","Male"}                              
                    };
    String [] cols={"Name", "F Name","Age","Gender"};
    
    DefaultTableModel tmod=new DefaultTableModel(data,cols);
    JTable tb;

    public Function() {
        this.tb = new JTable(tmod);
    }
    
    public void intialize()
    {
        setTitle("fskd");
        setSize(1000,1000);
        setVisible(true);
        setLayout(null);
    
        
        
        
        
        
        
        
        tb.addMouseListener(this);
        JScrollPane sc=new JScrollPane(tb);
        //sc.add(tb);
        sc.setBounds(10,400,500,300);
        this.add(sc);
        
        File fr=new File("Record.txt");
        try
        {
        Scanner input=new Scanner(fr);
        while(input.hasNext())
        {
            String str=input.nextLine();
            String[] row=str.split(",");
            tmod.addRow(row);
        }
        input.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        
        lbName.setText("Name");
        lbName.setBounds(20,20,100,30);
        lbName.setFont(f);
        this.add(lbName);
        
        txtName.setBounds(160,20,200,30);
        txtName.setFont(f);
        this.add(txtName);
        
        lbFName.setText("F Name");
        lbFName.setBounds(20,70,100,30);
        lbFName.setFont(f);
        this.add(lbFName);
        
        txtFName.setBounds(160,70,200,30);
        txtFName.setFont(f);
        this.add(txtFName);
        
        lbAge.setText("Age");
        lbAge.setBounds(20,120,100,30);
        lbAge.setFont(f);
        this.add(lbAge);
        
        txtAge.setBounds(160,120,200,30);
        txtAge.setFont(f);
        this.add(txtAge);
        
        lbGender.setText("Gender");
        lbGender.setBounds(20,170,100,30);
        lbGender.setFont(f);
        this.add(lbGender);
        
        rdMale.setText("Male");
        rdMale.setBounds(140,170,100,30);
        rdMale.setFont(f);
        rdMale.setBackground(Color.GRAY);
        this.add(rdMale);
        
        rdFemale.setText("Female");
        rdFemale.setBounds(240,170,100,30);
        rdFemale.setFont(f);
        rdFemale.setBackground(Color.GRAY);
        this.add(rdFemale);
        grp.add(rdMale);
        grp.add(rdFemale);
        
        Icon ic=new ImageIcon(this.getClass().getResource("img1.gif"));
        btnAdd.setText("ADD");
        btnAdd.setFont(f);
        btnAdd.setIcon(ic);
        btnAdd.setBorder(BorderFactory.createLineBorder(Color.BLUE,0));
        btnAdd.setBounds(10,250,250,140);
        btnAdd.setBackground(Color.GRAY);
        btnAdd.addActionListener(new btn_Click());
        this.add(btnAdd);
        
        btnRead.setText("Update");
        btnRead.setFont(f);
        btnRead.setIcon(ic);
        btnRead.setBorder(BorderFactory.createLineBorder(Color.BLUE,0));
        btnRead.setBounds(250,250,250,140);
        btnRead.setBackground(Color.GRAY);
        btnRead.addActionListener(new btn_Click());
        this.add(btnRead);
        
        btnDelete.setText("DELETE");
        btnDelete.setFont(f);
        btnDelete.setIcon(ic);
        btnDelete.setBorder(BorderFactory.createLineBorder(Color.BLUE,0));
        btnDelete.setBounds(500,250,250,140);
        btnDelete.setBackground(Color.GRAY);
        btnDelete.addActionListener(new btn_Click());
        this.add(btnDelete);
        //this.addMouseListener(new btn_Click());
    }   

    @Override
    public void mouseClicked(MouseEvent me) {
 // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    int index=tb.getSelectedRow();
    //System.out.println(tmod.getValueAt(index, 2));
    txtName.setText(tmod.getValueAt(index, 0).toString());
    txtFName.setText(tmod.getValueAt(index, 1).toString());
    txtAge.setText(tmod.getValueAt(index, 2).toString());
    String gen=tmod.getValueAt(index, 3).toString();
    if(gen.compareTo("Male")==0)
    {
        rdMale.setSelected(true);
    }
    else
    {
        rdFemale.setSelected(true);
    }
    }

    @Override
    public void mousePressed(MouseEvent me) {
   // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
     // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public class btn_Click implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            String op=ae.getActionCommand();
            if(op.compareTo("ADD")==0)
            {
               String gen=rdFemale.isSelected()?"Female":"Male";
               String [] row={txtName.getText(),txtFName.getText(),txtAge.getText(),gen};
               tmod.addRow(row);
               try
               {
                   
               File f=new File("Record.txt");
               FileWriter fr=new FileWriter(f,true);
               fr.write(txtName.getText()+","+txtFName.getText()+","+txtAge.getText()+","+gen+"\n");
               fr.close();
               }
               catch(Exception e)
               {
                   
               }
            }
            else
            if(op.compareTo("DELETE")==0)
            {
                if(tb.getSelectedRow()==-1)
                {
                    System.out.println("Please Select Row First......");
                }
                else
                {
                 tmod.removeRow(tb.getSelectedRow());
                }
            }
            else
            if(op.compareTo("Update")==0)
            {
                int index=tb.getSelectedRow();
                if(index==-1)
                {
                 System.out.println("Please Select Row First");
                }
                else
                {
                tmod.setValueAt(txtName.getText(), index, 0);
                tmod.setValueAt(txtFName.getText(), index, 1);
                tmod.setValueAt(txtAge.getText(), index, 2);
                String gen=rdFemale.isSelected()?"Female":"Male";
                tmod.setValueAt(gen, index, 3);
                }
                
    
                
           // tmod.setValueAt(op, WIDTH, WIDTH);
            }
        }

        
    }
    
}