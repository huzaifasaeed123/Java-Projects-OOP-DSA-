package testcandycrush;

//import java.awt.event.MouseListener;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.HashSet;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author saeed
 */
public class CandyCrush extends JFrame
{
    public static JLabel [][] label=new JLabel[10][10];
    public JLabel  label1=new JLabel("Your Score::");
    public static JTextField  txt1=new JTextField();
    //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon1.png")));

    Random r=new Random();
    public static int score=0;
    public void display()
    {
        setTitle("Candy Crush Game");
        setSize(600,600);
        setLocation(400,50);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        txt1.setBounds(100, 500, 100, 30);
       // String str1= String.valueOf(score);
        //txt1.setText(str1);
        add(txt1);
        label1.setBounds(10, 500, 100, 30);
        add(label1);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon1.png"));    
        this.setIconImage(icon);
        
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 10; j++) 
            {
                label[i][j]=new JLabel(String.valueOf(r.nextInt(5)+1));
                label[i][j].setBounds(j*50, i*50, 40, 40);
                add(label[i][j]);
                
                
                //label[i][j].addMouseListener(new EventCandyCrush());
                //label1.addMouseListener(this);
            }
            
        }
        color();
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 10; j++) 
            {
                label[i][j].addMouseListener(new EventCandyCrush());
            }
            
        }
        
           
        this.setLayout(null);
        setVisible(true);
    
    }
    public void color()
    {
        Icon i1=new ImageIcon(this.getClass().getResource("icon1.png"));
        Icon i2=new ImageIcon(this.getClass().getResource("icon2.png"));
        Icon i3=new ImageIcon(this.getClass().getResource("icon3.png"));
        Icon i4=new ImageIcon(this.getClass().getResource("icon4.png"));
        Icon i5=new ImageIcon(this.getClass().getResource("icon5.png"));
         for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 10; j++) 
            {
                
                if(null != label[i][j].getText())
                switch (label[i][j].getText()) {
                    case "1":
                        label[i][j].setIcon(i1);
                        break;
                    case "2":
                        label[i][j].setIcon(i2);
                        break;
                    case "3":
                        label[i][j].setIcon(i3);
                        break;
                    case "4":
                        label[i][j].setIcon(i4);
                        break;
                //label[i][j].addMouseListener(new EventCandyCrush());
                //label1.addMouseListener(this);
                    case "5":
                        label[i][j].setIcon(i5);
                        break;
                    default:
                        break;
                }
                
                //label[i][j].addMouseListener(new EventCandyCrush());
                //label1.addMouseListener(this);
            }
        
    }
        
    
    
    
}
    public void check()
    {
             String b="0";
             for (int i = 0; i < 8; i++) 
            {
            for (int j = 0; j < 8; j++) 
                {  
                 if(label[i][j].getText().equalsIgnoreCase(label[i][j+1].getText()) && label[i][j+2].getText().equalsIgnoreCase(label[i][j].getText()) && label[i][j+1].getText().equalsIgnoreCase(label[i][j+2].getText()))
                {
                    
                    label[i][j].setText(b);
                    label[i][j+1].setText(b);
                    label[i][j+2].setText(b);
                    score+=50;
                   // System.out.println("Row wise match");
                }
                  if(label[j][i].getText().equalsIgnoreCase(label[j+1][i].getText()) && label[j+2][i].getText().equalsIgnoreCase(label[j][i].getText()) && label[j+1][i].getText().equalsIgnoreCase(label[j+2][i].getText()))
                {
                    label[j][i].setText(b);
                    label[j+1][i].setText(b);
                    label[j+2][i].setText(b);
                     //System.out.println("Colomn wise match");
                     score+=50;
                }
                }
         
            
            }
             update();
             if(check2()==1)
             {
                 check();
             }
             //color();
    }
    public int check2()
    {
             String b="0";
             for (int i = 0; i < 8; i++) 
            {
            for (int j = 0; j < 8; j++) 
                {  
                 if(label[i][j].getText().equalsIgnoreCase(label[i][j+1].getText()) && label[i][j+2].getText().equalsIgnoreCase(label[i][j].getText()) && label[i][j+1].getText().equalsIgnoreCase(label[i][j+2].getText()))
                {
                    
                    label[i][j].setText(b);
                    label[i][j+1].setText(b);
                    label[i][j+2].setText(b);
                   // System.out.println("Row wise match");
                   return 1;
                }
                  if(label[j][i].getText().equalsIgnoreCase(label[j+1][i].getText()) && label[j+2][i].getText().equalsIgnoreCase(label[j][i].getText()) && label[j+1][i].getText().equalsIgnoreCase(label[j+2][i].getText()))
                {
                    label[j][i].setText(b);
                    label[j+1][i].setText(b);
                    label[j+2][i].setText(b);
                     //System.out.println("Colomn wise match");
                     return 1;
                }
                }
         
            
            }
             update();
             //color();
             return 0;
    }
    
    public void update()
    {
        for (int i = 0; i <label.length; i++) 
        {
            for (int j = 0; j <label[i].length; j++) 
            {
                String str1=label[i][j].getText();
                String str2="0";
                if(label[i][j].getText().equalsIgnoreCase(str2))
                {
                    for(int k=i;k>=0;k--)
                    {
                        if(k==0 )
                        {
                            
                            label[k][j].setText(String.valueOf(r.nextInt(5)+1));
                            color();
                        }
                        else
                        {
                            // String val1=label[k][j].getText();
                             String val2=label[k-1][j].getText();
                             label[k][j].setText(val2);
                             color();
                        }
                        
                    }
                    
                }
                
            }
            
        }
       // check();
        //update();
    }
}

