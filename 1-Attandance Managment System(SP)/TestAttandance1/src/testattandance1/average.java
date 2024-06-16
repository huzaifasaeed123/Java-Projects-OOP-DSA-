
package testattandance1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.WindowConstants;


public class average extends JFrame implements ActionListener
{
    public int present;
    public JLabel label1=new JLabel();
    public JLabel label2=new JLabel();
    public JLabel label3=new JLabel();
     Icon C = new ImageIcon(this.getClass().getResource("Lab 7.jpg"));
    public JLabel icon5 = new JLabel(C);
    public JButton btn1=new JButton("Exit");
    public average(int i)
    {
        this.present=i;
    }
    
     public void intilize()
    {
       setTitle("ATTANDACE MANAGEMENT ");
        setSize(400,300);
        getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        label1.setBounds(70,110,260,30);
        label1.setText(" Number Of Present Student: "+present);
        label1.setFont(new Font("ALGERIAN", Font.BOLD, 15));
        label2.setBounds(70,140,260,30);
        label2.setText(" Number Of Absent Student: "+(10-present));
        label2.setFont(new Font("ALGERIAN", Font.BOLD, 15));
        label3.setBounds(70,170,300,30);
        label3.setFont(new Font("ALGERIAN", Font.BOLD, 15));
        label3.setText("Attandance Percentage: "+((present*100)/10)+ "%");
        btn1.setBounds(100,210,120,30);
        label3.setText("Attandance Percentage: "+((present*100)/10)+ "%");
        add(label1);
        add(label2);
        add(label3);
        add(btn1);
        btn1.addActionListener(this);
        icon5.setBounds(0, 0, 350, 100);
         add(icon5);
        this.setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
        if(e.getSource()==btn1)
        {
            System.exit(0);
        }
    }
}
