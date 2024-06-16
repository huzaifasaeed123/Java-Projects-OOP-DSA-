package testattandance1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.border.Border;
public class UpdateFrame extends JFrame implements ActionListener
{
    public int present=0;
    public static Border t = BorderFactory.createLineBorder(Color.GRAY, 4);
   Icon i = new ImageIcon(this.getClass().getResource("Lab project 3.jpg"));
    public JLabel icon = new JLabel(i);
    public static JLabel Heading = new JLabel("COMSATS UNIVERSITY ISLAMABAD,ABBOTABAD CAMPUS");
    public static JLabel Teacher = new JLabel("Teacher Name");
    public static JLabel Name = new JLabel("Abdul Nasir Khan");
    public static JLabel Name2 = new JLabel("Object Oriented Programming");
    public static JLabel Section = new JLabel("Section Name");
    public static JLabel Date = new JLabel("DATE");
    public static JLabel Roll = new JLabel("Registration No");
    public static JLabel Name3 = new JLabel("Name");
    public JCheckBox[] box=new JCheckBox[10];
    public JLabel[] lbl=new JLabel[10];
    public JLabel lbl1=new JLabel();
    public JLabel lbl2=new JLabel();
    public String date;
    public String section;
    public static JButton btn=new JButton("Save");
    public static JButton btn1=new JButton("Submit");
    public String [] a;
    public String [] reg1;
    public String [] res;
    public String [] check=new String[10];
    public static int count=0;
    public UpdateFrame(String [] b,String [] c,String [] d,String date1,String Sec1)
    {
        this.a=b;
        this.reg1=c;
        this.date=date1;
        this.section=Sec1;
        this.res=d;
    }
    public void intilize()
    {
       setTitle("ATTANDACE MANAGEMENT SYSTEM");
        setSize(600,725);
        getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Heading.setBounds(90, 10, 400, 50);
        Heading.setFont(new Font("Britannic Bold", Font.BOLD, 15));
        Heading.setOpaque(true);
        Heading.setBorder(t);
        Heading.setBackground(Color.WHITE);
        add(Heading);
        Teacher.setBounds(80, 80, 120, 50);
        Teacher.setFont(new Font("ALGERIAN", Font.BOLD, 15));
        add(Teacher);
        Name.setBounds(210, 80, 140, 50);
        Name.setFont(new Font("Time New Romans", Font.BOLD, 15));
        Name.setOpaque(true);
        Name.setBorder(t);
        Name.setBackground(Color.WHITE);
        add(Name);
        Section.setBounds(80, 140, 120, 50);
        Section.setFont(new Font("ALGERIAN", Font.BOLD, 15));
        add(Section);
        lbl2.setText(section);
        lbl2.setBounds(210, 140, 140, 40);
        lbl2.setFont(new Font("Time New Romans", Font.BOLD, 15));
        lbl2.setOpaque(true);
        lbl2.setBorder(t);
        lbl2.setBackground(Color.WHITE);
        add(lbl2);
        Date.setBounds(130, 190, 120, 50);
        Date.setFont(new Font("ALGERIAN", Font.BOLD, 15));
        add(Date);
        lbl1.setText(date);
        lbl1.setBounds(210, 200, 100, 30); 
        lbl1.setFont(new Font("Time New Romans", Font.BOLD, 15));
        lbl1.setOpaque(true);
        lbl1.setBorder(t);
        lbl1.setBackground(Color.WHITE);
        add(lbl1);
        Roll.setBounds(80, 260, 130, 30); 
        Roll.setFont(new Font("Time New Romans", Font.BOLD, 15));
        Roll.setOpaque(true);
        Roll.setBorder(t);
        Roll.setBackground(Color.WHITE);
        add(Roll);
        Name3.setBounds(230, 260, 80, 30); 
        Name3.setFont(new Font("Time New Romans", Font.BOLD, 15));
        Name3.setOpaque(true);
        Name3.setBorder(t);
        Name3.setBackground(Color.WHITE);
        add(Name3);
        btn.setBounds(150, 620, 100, 30);
        btn1.setBounds(260, 620, 100, 30);
        add(btn);
        add(btn1);
        btn1.addActionListener(this);
        btn.addActionListener(this);
       for (int i = 0; i < box.length; i++) 
        {
            box[i]=new JCheckBox(reg1[i]);
            lbl[i]=new JLabel(a[i]);
            lbl[i].setOpaque(true);
            box[i].setBounds(80, 30*(i+10), 150, 20);
            lbl[i].setBounds(230,30*(i+10),150,20);
            this.add(lbl[i]);
            this.add(box[i]);
            if(res[i].compareTo("P")==0)
            {
                box[i].setSelected(true);
            }
            }
       icon.setBounds(0, 0, 600, 700);
        add(icon);
       
        
        this.setLayout(null);
        setVisible(true);
    }
    public void again()
    {
        
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn)
        {
        try {
            if(section.compareTo("SECTION 3A")==0)
            {
                FileWriter file = new FileWriter(date+"A.txt", false);
                MainFrame.classA++;
                System.out.println("class created");
                for (int i = 0; i < box.length; i++) 
                {
                if (box[i].isSelected()) {
                    file.write(lbl[i].getText()+","+box[i].getText() + "," + "P\n");
                } 
                else 
                {
                    file.write(lbl[i].getText()+","+box[i].getText() + "," + "A\n");
                }
                }
                file.close();
            } 
            else if(section.compareTo("SECTION 3B")==0)
            {
                FileWriter file = new FileWriter(date+"B.txt", false);
                MainFrame.classB++;
                for (int i = 0; i < box.length; i++) 
                {
                if (box[i].isSelected()) {
                    
                    file.write(lbl[i].getText()+","+box[i].getText() + "," + "P\n");
                } 
                else 
                {
                    file.write(lbl[i].getText()+","+box[i].getText() + "," + "A\n");
                }
                }
                file.close();
            }
            else if(section.compareTo("SECTION 3C")==0)
            {
                FileWriter file = new FileWriter(date+"C.txt", false);
                MainFrame.classC++;
                for (int i = 0; i < box.length; i++) 
                {
                if (box[i].isSelected()) 
                {
                  
                    file.write(lbl[i].getText()+","+box[i].getText() + "," + "P\n");
                } 
                else 
                {
                    file.write(lbl[i].getText()+","+box[i].getText() + "," + "A\n");
                }
                }
                file.close();
            }
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
                            JOptionPane.showMessageDialog(null, "Attandance Updated Successfully","File Updated",JOptionPane.INFORMATION_MESSAGE);

        }
        if(e.getSource()==btn1)
        {
            for (int j = 0; j < box.length; j++) 
            {
                if(box[j].isSelected())
                {
                    present++;
                }
                
            }
            average obj=new average(present);
            obj.intilize();
            this.dispose();
        }
        
        
//        MainFrame obj1=new MainFrame();
//        obj1.start1();
//        
        
        
        
        
        
        
        
        
        
        
        
       
            
    }
}
