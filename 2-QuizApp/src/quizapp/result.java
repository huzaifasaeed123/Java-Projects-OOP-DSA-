
package quizapp;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.WindowConstants;
public class result extends JFrame implements ActionListener
{
    Icon ic = new ImageIcon(this.getClass().getResource("img3.gif"));
    public JLabel icon = new JLabel(ic);
    Font f1=new Font("Time New Roman", Font.BOLD, 20);

    private String name;
    private int score;
    private int res;
    public JLabel lbl=new JLabel();
    public JLabel lbl1=new JLabel();
    public JLabel lbl2=new JLabel();
    public JLabel lbl3=new JLabel();
    public JButton btn1=new JButton("Try Again");
    public JButton btn2=new JButton("Exit");
    public result(String name,int score,int res)
    {
        this.name=name;
        this.score=score;
        this.res=res;
    }
       public void result1()
      {
        setTitle("Result");
        setSize(500,600);
        setLocation(400,50);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);

        lbl.setBounds(10,250,500,30);
        lbl1.setBounds(10,290,500,30);
        lbl2.setBounds(10,330,500,30);
        lbl3.setBounds(10,370,500,30);
        lbl.setFont(f1);
        lbl1.setFont(f1);
        lbl2.setFont(f1);
        lbl3.setFont(f1);
        btn1.setBounds(100,420,100,30);
        btn2.setBounds(220,420,100,30);
        icon.setIcon(ic);
        icon.setBounds(0,0,500,200);
        lbl.setText("Dear "+name+", ");
        lbl1.setText("Obtain Marks: "+ score );
        lbl2.setText("Total Marks: "+res);
        lbl3.setText("Percentage: "+(score*100)/res+"%");
        add(icon);
        add(lbl);
        add(lbl1);
        add(lbl2);
        add(lbl3);
        add(btn1);
        add(btn2);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        setLayout(null);
        setVisible(true);
      }

    @Override
    public void actionPerformed(ActionEvent e) {
      
        if(e.getSource()==btn1)
        {
            LOGIN obj1=new LOGIN();
             obj1.login1();
             dispose();
        }
        else if(e.getSource()==btn2)
        {
            System.exit(0);
        }
    }
    
}
