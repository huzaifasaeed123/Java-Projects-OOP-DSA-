/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testattandance1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author saeed
 */
public class MainFrame 
{
    public  int classA=1;
    public  int classB=1;
    public  int classC=1;
    public void start1()
    {
        
String [] a={ 
            
            "A",
            "Ammar",
            "Fazal",
            "Basit",
            "Talha",
            "Usman",
            "Mahnoor",
            "Ayesha",
            "dffffd",
            "rffffd",
            
        };
        String [] b={ 
            "B",
            "abc",
            "Fazal",
            "Basit",
            "Talha",
            "Usman",
            "Mahnoor",
            "Ayesha",
            "dffffd",
            "rffffd",
            
        };
        String [] c={ 
            "C",
            "Ammar",
            "Fazal",
            "Basit",
            "Talha",
            "Usman",
            "Mahnoor",
            "Ayesha",
            "dffffd",
            "rffffd",
            
        };
        String [] reg={
            "FA21-BCS-020",
            "FA21-BCS-020",
            "FA21-BCS-020",
            "FA21-BCS-020",
            "FA21-BCS-020",
            "FA21-BCS-020",
            "FA21-BCS-020",
            "FA21-BCS-020",
            "FA21-BCS-020",
            "FA21-BCS-020",
//            "FA21-BCS-020",
//            "FA21-BCS-020",
//            "FA21-BCS-020",
//            "FA21-BCS-020",
//            "FA21-BCS-020",
//            "FA21-BCS-020",
//            "FA21-BCS-020",
//            "FA21-BCS-020",
//            "FA21-BCS-020",
//            "FA21-BCS-020",
        };
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
                    fr.dispose();
                    Attandance obj=new Attandance(a,reg,date,"SECTION A");
                    obj.intilize();
                }
                else  if(cmb.getSelectedIndex()==1)
                {
                    fr.dispose();
                    Attandance obj=new Attandance(b,reg,date,"SECTION B");
                    obj.intilize();
                }
               else if(cmb.getSelectedIndex()==2)
                {
                    fr.dispose();
                    Attandance obj=new Attandance(c,reg,date,"SECTION C");
                    obj.intilize();
                }
            }
        });
//        XSSFWorkbook workb=new XSSFWorkbook();
//        XSSFSheet sheet= workb.createSheet("Result.xls");
        fr.setLayout(null);
        fr.setVisible(true);    
    }
    
}
