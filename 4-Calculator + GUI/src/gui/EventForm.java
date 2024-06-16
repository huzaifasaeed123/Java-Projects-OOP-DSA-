/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author saeed
 */
public class EventForm extends RegistraionForm implements ActionListener
{
    public static String  str="";
    public RegistraionForm abc;
    public EventForm()
    {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
       String str1= "Name:"+field1.getText()+"\n";
       String str2= "Mobile No:"+field2.getText()+"\n";
       String str3="Gender:Male\n"; 
       if(rbtn2.isSelected( ))
       {
          str3="Gender:Female\n";
       }
       String str4 = "DOB:"+(String)combo1.getSelectedItem()+" "+(String)combo2.getSelectedItem()+" "+(String)combo3.getSelectedItem()+"\n";
       String str5="Address:"+area1.getText()+"\n\n";
      // String str3="Gender:"
       String str6=str1+str2+str3+str4+str5;
       str=str+str6;
       area2.setText(str);
        
        

       
        
    }
    
}
