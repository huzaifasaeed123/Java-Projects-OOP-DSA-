
package testattandance1;

import java.awt.Color;
import static java.awt.Color.white;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.border.Border;
public class Update 
{
    public String[] reg=new String[10];
    public String[] name=new String[10];
    public String[] res=new String[10];
    public static Border t = BorderFactory.createLineBorder(Color.GRAY, 4);
    Icon i = new ImageIcon(this.getClass().getResource("lab project pic.png"));
    public JLabel icon = new JLabel(i);
    public static JLabel Teacher = new JLabel("Teacher Name");
    public static JLabel Class = new JLabel("Department ");
    public static JLabel Name0 = new JLabel("Computer Science");
    public static JLabel Name = new JLabel("Abdul Nasir Khan");
    public static JLabel Subject = new JLabel("Subject Name");
    public static JLabel Name2 = new JLabel("Object Oriented Programming");
    public static JLabel Section = new JLabel("Section Name");
    public static JLabel Date = new JLabel("DATE");
    public void update1()
    {
        JFrame fr=new JFrame();
        fr.setTitle("Update Attandance Selection");
        fr.setSize(600,600);
        fr.getContentPane().setBackground(white);
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        String[] val = {"Class 3A", "Class 3B", "Class 3C"};
        JComboBox cmb = new JComboBox(val);
        JButton btn = new JButton("Submit");
        JTextField txt = new JTextField();
        cmb.setBounds(210, 360, 150, 40);
        btn.setBounds(250, 500, 100, 30);
        txt.setBounds(210, 420, 150, 40);
        fr.add(txt);
        fr.add(cmb);
        fr.add(btn);
        Teacher.setBounds(80, 170, 120, 50);
        Teacher.setFont(new Font("ALGERIAN", Font.BOLD, 15));
        fr.add(Teacher);
        Name.setBounds(210, 170, 150, 50);
        Name.setFont(new Font("Time New Romans", Font.BOLD, 15));
        Name.setOpaque(true);
        Name.setBorder(t);
        Name.setBackground(Color.WHITE);
        fr.add(Name);
        Class.setBounds(95, 230, 120, 50);
        Class.setFont(new Font("ALGERIAN", Font.BOLD, 15));
        fr.add(Class);
        Name0.setBounds(210, 230, 150, 50);
        Name0.setFont(new Font("Time New Romans", Font.BOLD, 15));
        Name0.setOpaque(true);
        Name0.setBorder(t);
        Name0.setBackground(Color.WHITE);
        fr.add(Name0);
        Subject.setBounds(80, 290, 120, 50);
        Subject.setFont(new Font("ALGERIAN", Font.BOLD, 15));
        fr.add(Subject);
        Name2.setBounds(210, 290, 240, 50);
        Name2.setFont(new Font("Time New Romans", Font.BOLD, 15));
        Name2.setOpaque(true);
        Name2.setBorder(t);
        Name2.setBackground(Color.WHITE);
        fr.add(Name2);
        Section.setBounds(80, 350, 120, 50);
        Section.setFont(new Font("ALGERIAN", Font.BOLD, 15));
        fr.add(Section);
        Date.setBounds(135, 410, 80, 50);
        Date.setFont(new Font("ALGERIAN", Font.BOLD, 15));
        fr.add(Date);

        icon.setBounds(50, 20, 390, 120);
        fr.add(icon);
        
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
            UpdateFrame obj=new UpdateFrame(name,reg,res,date,"SECTION 3A");
                    obj.intilize();
                    fr.dispose();
        } catch (Exception ex) 
        {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "File Not Found.Please Enter Valid Date File","File Not Found",JOptionPane.WARNING_MESSAGE);
            fr.dispose();
            update1();
            
        }
                    
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
            UpdateFrame obj=new UpdateFrame(name,reg,res,date,"SECTION 3B");
            obj.intilize();
            fr.dispose();
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null, "File Not Found.Please Enter Valid Date File","File Not Found",JOptionPane.WARNING_MESSAGE);
            fr.dispose();
            update1();
        }
                    

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
            UpdateFrame obj=new UpdateFrame(name,reg,res,date,"SECTION 3C");
            obj.intilize();
            fr.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "File Not Found.Please Enter Valid Date File","File Not Found",JOptionPane.WARNING_MESSAGE);
            fr.dispose();
            update1();
        }
                    
//                    
                }
            }
        });
        fr.setLayout(null);
        fr.setVisible(true);    
    }
}
