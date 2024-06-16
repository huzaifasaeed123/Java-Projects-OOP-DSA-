package testattandance1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
public class UpdateFrame extends JFrame implements ActionListener
{
    public JCheckBox[] box=new JCheckBox[10];
    public JLabel[] lbl=new JLabel[10];
    public JLabel lbl1=new JLabel();
    public JLabel lbl2=new JLabel();
    public String date;
    public String section;
    public static JButton btn=new JButton("Submit");
    public static JButton btn1=new JButton("Main");
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
        setSize(600,800);
        setLocation(100,10);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        btn.setBounds(200, 500, 100, 30);
        btn1.setBounds(300, 500, 100, 30);
        lbl1.setText(date);
        lbl2.setText(section);
        lbl1.setBounds(20, 20, 100, 30);   
        lbl2.setBounds(100, 20, 100, 30);
        add(lbl1);
        add(lbl2);
        add(btn);
        add(btn1);
        btn1.addActionListener(this);
        btn.addActionListener(this);

        for (int i = 0; i < box.length; i++) 
        {
            box[i]=new JCheckBox(reg1[i]);
            lbl[i]=new JLabel(a[i]);
            box[i].setBounds(100, 30*(i+3), 150, 20);
            lbl[i].setBounds(250,30*(i+3),150,20);
            this.add(lbl[i]);
            this.add(box[i]);
            if(res[i].compareTo("P")==0)
            {
                box[i].setSelected(true);
            }
            
        }
        
        this.setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn)
        {
        try {
            if(section.compareTo("SECTION A")==0)
            {
                FileWriter file = new FileWriter(date+"A.txt", false);
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
            else if(section.compareTo("SECTION B")==0)
            {
                FileWriter file = new FileWriter(date+"B.txt", false);
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
            else if(section.compareTo("SECTION C")==0)
            {
                FileWriter file = new FileWriter(date+"C.txt", false);
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
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        }
        if(e.getSource()==btn1)
        {
             this.dispose();
        }   
    }
}
