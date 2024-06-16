/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testattandance1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author saeed
 */
public class Update 
{
    public String[] reg=new String[10];
    public String[] name=new String[10];
    public String[] res=new String[10];
    public void update1()
    {
        JFrame fr=new JFrame();
        fr.setTitle("Class Selection");
        fr.setSize(600,800);
       fr.setLocation(100,10);
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        String [] val={"Class A","Class B","Class C"};
        JComboBox cmb=new JComboBox(val);
        JButton btn=new JButton("Submit");
        JTextField txt=new JTextField();
        cmb.setBounds(100,100,100,30);
        btn.setBounds(100,200,100,30);
        txt.setBounds(250,100,100,30);
        fr.add(txt);
        fr.add(cmb);
        fr.add(btn);

        
        btn.addActionListener(new ActionListener(){
            @Override
            public void  actionPerformed(ActionEvent e) {
        String date= txt.getText();

                if(cmb.getSelectedIndex()==0)
                {
                    try {
                File f = new File(date+"A"+".txt");
            Scanner input = new Scanner(f);
            int i = 0;
            while (input.hasNext()) {
                String ln = input.nextLine();
                String[] arr = ln.split(",");
                reg[i] = arr[0];
                name[i] = arr[1];
                res[i]=arr[2];
                i++;
            }
            input.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
                    UpdateFrame obj=new UpdateFrame(name,reg,res,date,"SECTION A");
                    obj.intilize();
                }
                else  if(cmb.getSelectedIndex()==1)
                {
                    try {
                File f = new File(date+"B"+".txt");
            Scanner input = new Scanner(f);
            int i = 0;
            while (input.hasNext()) {
                String ln = input.nextLine();
                String[] arr = ln.split(",");
                reg[i] = arr[0];
                name[i] = arr[1];
                res[i]=arr[2];
                i++;
            }
            input.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
                    UpdateFrame obj=new UpdateFrame(name,reg,res,date,"SECTION B");
                    obj.intilize();
//                    Attandance obj=new Attandance(b,reg,date,"SECTION B");
//                    obj.intilize();
                }
               else if(cmb.getSelectedIndex()==2)
                {
                    try {
                File f = new File(date+"C"+".txt");
            Scanner input = new Scanner(f);
            int i = 0;
            while (input.hasNext()) {
                String ln = input.nextLine();
                String[] arr = ln.split(",");
                reg[i] = arr[0];
                name[i] = arr[1];
                res[i]=arr[2];
                i++;
            }
            input.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
                    UpdateFrame obj=new UpdateFrame(name,reg,res,date,"SECTION C");
                    obj.intilize();
//                    Attandance obj=new Attandance(c,reg,date,"SECTION C");
//                    obj.intilize();
                }
            }
        });
        fr.setLayout(null);
        fr.setVisible(true);    
    }
}
