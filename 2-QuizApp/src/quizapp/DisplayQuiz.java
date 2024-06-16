
package quizapp;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class DisplayQuiz extends JFrame implements ActionListener
{
    Font f=new Font("ALGERIAN", Font.BOLD, 15);
    Font f1=new Font("Time New Roman", Font.BOLD, 15);
    public  int timer=25;
    public  int count=0;
    public  int rowt;
    public  int score=0;
    public  String name;
    public  JRadioButton rbtn1=new JRadioButton();
    public  JRadioButton rbtn2=new JRadioButton();
    public  JRadioButton rbtn3=new JRadioButton();
    public  JRadioButton rbtn4=new JRadioButton();
    public  JLabel label1=new JLabel();
    public  JLabel label2=new JLabel();
    public  String [][] a;
    public  String [] ans;
    public  JButton btn1=new JButton("Next");
    public  JButton btn2=new JButton("Finish");
    public  ButtonGroup grp1=new ButtonGroup();
    Icon ic = new ImageIcon(this.getClass().getResource("img2.png"));
    public JLabel icon = new JLabel(ic);
   public DisplayQuiz(String n)
   {
       this.name=n;
   }
    
    public  void  display1() throws FileNotFoundException, IOException
    {
        setTitle("Quiz App");
        setSize(600,600);
        setLocation(400,50);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);

        label1.setBounds(30, 200, 400, 30);
        label2.setBounds(5, 200, 50, 30);
        btn1.setBounds(150, 380, 80, 30);
        btn2.setBounds(250, 380, 80, 30);
        rbtn1.setBounds(10, 240, 400, 30);
        rbtn2.setBounds(10, 270, 400, 30);
        rbtn3.setBounds(10, 300, 400, 30);
        rbtn4.setBounds(10, 330, 400, 30);
        icon.setBounds(100, 20, 390, 120);
        label1.setFont(f1);
        label2.setFont(f1);
        rbtn1.setFont(f1);
        rbtn2.setFont(f1);
        rbtn3.setFont(f1);
        rbtn4.setFont(f1);
        btn2.setEnabled(false);
         FileInputStream inputstream=new FileInputStream(".\\MCQS.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
        XSSFSheet sheet =workbook.getSheetAt(0);
         rowt=sheet.getLastRowNum();
        int colt=sheet.getRow(0).getLastCellNum();
        a=new String[rowt+1][colt+1];
        ans=new String[rowt+1];
        for (int i = 0; i <= rowt; i++) 
        {
            XSSFRow row=sheet.getRow(i);
            for (int j = 0; j <= colt; j++)
            {
                XSSFCell cell=row.getCell(j);
                if(j==0)
                {
                    a[i][0]=cell.getStringCellValue();
                }
                else if(j==1)
                {
                    a[i][1]=cell.getStringCellValue();
                }
                else if(j==2)
                {
                    a[i][2]=cell.getStringCellValue();
                }
                else if(j==3)
                {
                    a[i][3]=cell.getStringCellValue();
                }
                else if(j==4)
                {
                    a[i][4]=cell.getStringCellValue();
                }
                else if(j==5)
                {
                    a[i][5]=cell.getStringCellValue();
                }  
            }
        }
        add(icon);
        add(label1);
        add(label2);
        add(btn1);
        add(btn2);
        add(rbtn1);
        add(rbtn2);
        add(rbtn3);
        add(rbtn4);
        grp1.add(rbtn1);
        grp1.add(rbtn2);
        grp1.add(rbtn3);
        grp1.add(rbtn4);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        setLayout(null);
        setVisible(true);
        display2(count);    
    }
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        String time= "Time Left--"+timer+" Seconds";
        g.setFont(f);
            g.setColor(Color.red);
        if(timer>0)
        {
            g.drawString(time, 400, 230);
            
        }
        else
        {g.drawString("Time up", 400, 230);}
        timer--;
        try{
            Thread.sleep(1000);
            repaint();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        //System.out.println("control down");
        if(timer<0)
        {
            timer=25;
            if(grp1.getSelection()==null)
            {
                ans[count]="";
            }
            else
            {
                ans[count]=grp1.getSelection().getActionCommand();
            }
            if(count==(rowt-1))
            {
                btn1.setEnabled(false);
                btn2.setEnabled(true);  
            } 
            
            if(count==rowt)
            {
                if (grp1.getSelection()==null)
                {ans[count]="";}
                 else
                {ans[count]=grp1.getSelection().getActionCommand();}
                for (int i = 0; i <= rowt; i++) 
                {
                    if(ans[i].compareTo(a[i][5])==0)
                    {score++;}   
                }
                setVisible(false);
                result obj=new result(name,score,rowt+1) ;
                obj.result1();
                
            }
           if(count==rowt)
           { 
           }
           else
           {
               count++;
            display2(count); 
           }
            
        }
    }
    public void display2(int i)
    {
        label2.setText(String.valueOf(i+1)+":  ");
       label1.setText(a[i][0]);
       rbtn1.setText(a[i][1]);
       rbtn1.setActionCommand(a[i][1]);
       rbtn2.setText(a[i][2]);
       rbtn2.setActionCommand(a[i][2]);
       rbtn3.setText(a[i][3]);
       rbtn3.setActionCommand(a[i][3]);
       rbtn4.setText(a[i][4]);
       rbtn4.setActionCommand(a[i][4]);
       grp1.clearSelection();
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==btn1)
        {
            if (grp1.getSelection()==null)
                {
                ans[count]="";
                }
                 else
                {
                ans[count]=grp1.getSelection().getActionCommand();
                }
            timer=25;
            count++;
            display2(count);
            if(count==rowt)
            {
                btn1.setEnabled(false);
                btn2.setEnabled(true);
            }
        }
        else if(e.getSource()==btn2)
        {
            if (grp1.getSelection()==null)
                {ans[count]="";}
                 else
                {ans[count]=grp1.getSelection().getActionCommand();}
                for (int i = 0; i <= rowt; i++) 
                {
                    if(ans[i].compareTo(a[i][5])==0)
                    {
                        score++;  
                    }  
                }
                dispose();
              
                
                result obj=new result(name,score,rowt+1);
                obj.result1();
             //   btn1.setEnabled(true);
        } 
    }  
}
