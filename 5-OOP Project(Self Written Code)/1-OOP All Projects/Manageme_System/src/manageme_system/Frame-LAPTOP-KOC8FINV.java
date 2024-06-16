/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manageme_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JRadioButton;

/**
 *
 * @author Fazal
 */
public class Frame extends JFrame implements ActionListener{
    JLabel l1 = new JLabel(); // label 1
    JLabel l2 = new JLabel();
    JLabel l3 = new JLabel();
    JLabel l4 = new JLabel();
    JLabel l5 = new JLabel();
    JLabel l6 = new JLabel();
    JLabel l7 = new JLabel();
    JLabel lb = new JLabel();
    JLabel ls = new JLabel();
    JLabel lr = new JLabel();
    public static JLabel ld = new JLabel();
    JLabel lsh = new JLabel();
    JLabel lcd = new JLabel();
    JButton Reset = new JButton();
    JButton Save = new JButton();
    JButton Exit = new JButton();
    
    
    public static JCheckBox[] cb = new JCheckBox[20];
    
    public static JTextField[] tf = new JTextField[20];
    public static String[] ItemName = {"HOT CHEETOS BURGER",
                         "FLAMING NASH BURGER",
                         "ZINGER BURGER",
                         "JALAPENO BURGER",
                         "STEAK FILLET BURGER",
                         "PERI PERI SANDWICH",
                         "BBQ SANDWICH",
                         "BEEF SANDWICH",
                         "COCKTAIL SANDWICH",
                         "MALAI BOTI ROLL",
                         "FAJITA ROLL",
                         "BBQ ROLL",
                         "AFGHANI ROLL",
                         "ZINGER SHAWARMA",
                         "PLATTER SHAWARMA",
                         "TURKISH SHAWARMA",
                         "AFGHANI SHAWARMA",
                         "PEPSI",
                         "SPRITE",
                         "FENTA"};
    public static JRadioButton rcd11 = new JRadioButton();
    public static JRadioButton rcd12 = new JRadioButton();
    public static JRadioButton rcd13 = new JRadioButton();
    public static ButtonGroup g1 = new ButtonGroup();
    public static JRadioButton rcd21 = new JRadioButton();
    public static JRadioButton rcd22 = new JRadioButton();
    public static JRadioButton rcd23 = new JRadioButton();
    public static ButtonGroup g2 = new ButtonGroup();
    public static JRadioButton rcd31 = new JRadioButton();
    public static JRadioButton rcd32 = new JRadioButton();
    public static JRadioButton rcd33 = new JRadioButton();
    public static ButtonGroup g3 = new ButtonGroup();
    public static Font ft = new Font("Time New Roman",Font.ITALIC+Font.BOLD,50);
    public static Font fi = new Font("Time New Roman",Font.ITALIC+Font.BOLD,40);
    public static Font fil = new Font("Time New Roman",Font.ITALIC+Font.BOLD,15);
    public static Border b = BorderFactory.createLineBorder(Color.WHITE,4);
    public static Color o = new Color(255,140,0);
    public void intializer(){
        for (int i = 0; i < cb.length; i++){
            cb[i]= new JCheckBox(ItemName[i],false);
            cb[i].setBackground(Color.black);
            cb[i].setForeground(Color.white);
            cb[i].addItemListener(new CheckBox_Event_Handling());
            cb[i].setFont(fil);
            this.add(cb[i]);
            
            tf[i] = new JTextField();
            tf[i].setText("");
            tf[i].setBackground(Color.LIGHT_GRAY);
            tf[i].setHorizontalAlignment(JTextField.CENTER);
            this.add(tf[i]);
        }
        
        Disable();
        
        cb[0].setBounds(30, 100, 250, 30);
        tf[0].setBounds(300, 100, 200, 30);
        
        cb[1].setBounds(30, 150, 250, 30);
        tf[1].setBounds(300, 150, 200, 30);
        
        cb[2].setBounds(30, 200, 250, 30);
        tf[2].setBounds(300, 200, 200, 30); 
        
        cb[3].setBounds(30, 250, 250, 30);
        tf[3].setBounds(300, 250, 200, 30);
        
        cb[4].setBounds(30, 300, 250, 30);
        tf[4].setBounds(300, 300, 200, 30);
        
        cb[5].setBounds(30, 480, 250, 30);
        tf[5].setBounds(300, 480, 200, 30);
        
        cb[6].setBounds(30, 530, 250, 30);
        tf[6].setBounds(300, 530, 200, 30);
        
        cb[7].setBounds(30, 580, 250, 30);
        tf[7].setBounds(300, 580, 200, 30);
        
        cb[8].setBounds(30, 630, 250, 30);
        tf[8].setBounds(300, 630, 200, 30);
        
        cb[9].setBounds(550, 150, 250, 30);
        tf[9].setBounds(820, 150, 150, 30);
        
        cb[10].setBounds(550, 200, 250, 30);
        tf[10].setBounds(820, 200, 150, 30);
        
        cb[11].setBounds(550, 250, 250, 30);
        tf[11].setBounds(820, 250, 150, 30);
        
        cb[12].setBounds(550, 300, 250, 30);
        tf[12].setBounds(820, 300, 150, 30);
        
        cb[13].setBounds(1020, 100, 180, 30);
        tf[13].setBounds(1200, 100, 120, 30);
        
        cb[14].setBounds(1020, 150, 180, 30);
        tf[14].setBounds(1200, 150, 120, 30);
        
        cb[15].setBounds(1020, 200, 180, 30);
        tf[15].setBounds(1200, 200, 120, 30);
        
        cb[16].setBounds(1020, 250, 180, 30);
        tf[16].setBounds(1200, 250, 120, 30);
        
        cb[17].setBounds(1020, 430, 180, 30);
        tf[17].setBounds(1200, 430, 120, 30);
        
        cb[18].setBounds(1020, 500, 180, 30);
        tf[18].setBounds(1200, 500, 120, 30);
        
        cb[19].setBounds(1020, 570, 180, 30);
        tf[19].setBounds(1200, 570, 120, 30);
        
        l1.setBounds(20, 20, 500, 350);
        l1.setBorder(b);
        this.add(l1);
        
        lb.setText("Burgers");
        lb.setBounds(20, 30, 500, 50);
        lb.setHorizontalAlignment(JLabel.CENTER);
        lb.setBackground(Color.DARK_GRAY);
        lb.setFont(fi);
        lb.setOpaque(true);
        lb.setForeground(o);
        this.add(lb);
        
        l2.setBounds(20, 400, 500, 290);
        l2.setBorder(b);
        this.add(l2);
        
        ls.setText("SANDWUCH");
        ls.setBounds(20, 410, 500, 50);
        ls.setHorizontalAlignment(JLabel.CENTER);
        ls.setOpaque(true);
        ls.setBackground(Color.darkGray);
        ls.setFont(fi);
        ls.setForeground(o);
        this.add(ls);
        
        l3.setText("Fast Food");
        l3.setForeground(o);
        l3.setHorizontalAlignment(JLabel.CENTER);
        l3.setBackground(Color.darkGray);
        l3.setOpaque(true);
        l3.setFont(ft);
        l3.setBounds(540, 20, 450, 50);
        this.add(l3);
        
        l4.setBounds(540, 80, 450, 290);
        l4.setBorder(b);
        this.add(l4);
        
        lr.setText("ROLLS");
        lr.setBounds(540, 90, 450, 50);
        lr.setHorizontalAlignment(JLabel.CENTER);
        lr.setFont(fi);
        lr.setBackground(Color.darkGray);
        lr.setOpaque(true);
        lr.setForeground(o);
        this.add(lr);
        
        l5.setBounds(540, 400, 450, 290);
        l5.setBorder(b);
        this.add(l5);
        
        l6.setBounds(1010, 20, 330, 300);
        l6.setBorder(b);
        this.add(l6);
        
        
        ld.setText("F");
        ld.setBounds(540, 410, 450, 50);
        ld.setHorizontalAlignment(JLabel.CENTER);
        ld.setFont(fi);
        ld.setOpaque(true);
        ld.setBackground(Color.darkGray);
        ld.setForeground(o);
        this.add(ld);
        
        Reset.setText("RESET");
        Reset.setBounds(550, 600, 100, 50);
        Reset.setBackground(Color.lightGray);
        Reset.setForeground(Color.BLACK);
        Reset.addActionListener(this);
        Reset.addItemListener(new CheckBox_Event_Handling());
        Reset.setFont(fil);
        this.add(Reset);
        
        Save.setText("Save");
        Save.setBounds(715, 600, 100, 50);
        Save.setBackground(Color.lightGray);
        Save.setForeground(Color.BLACK);
        Save.addActionListener(this);
        Save.addItemListener(new CheckBox_Event_Handling());
        Save.setFont(fil);
        this.add(Save);
        
        Exit.setText("Exit");
        Exit.setBounds(880, 600, 100, 50);
        Exit.setBackground(Color.lightGray);
        Exit.setForeground(Color.BLACK);
        Exit.addActionListener(this);
        Exit.addItemListener(new CheckBox_Event_Handling());
        Exit.setFont(fil);
        this.add(Exit);
        
        
        
        lsh.setText("SHAWARMA");
        lsh.setBounds(1010, 30, 330, 50);
        lsh.setHorizontalAlignment(JLabel.CENTER);
        lsh.setFont(fi);
        lsh.setBackground(Color.DARK_GRAY);
        lsh.setOpaque(true);
        lsh.setForeground(o);
        this.add(lsh);
        
        l7.setBounds(1010, 350, 330, 340);
        l7.setBorder(b);
        this.add(l7);
        
        lcd.setText("COLD DRINK");
        lcd.setBounds(1010, 360, 330, 50);
        lcd.setHorizontalAlignment(JLabel.CENTER);
        lcd.setFont(fi);
        lcd.setBackground(Color.darkGray);
        lcd.setOpaque(true);
        lcd.setForeground(o);
        this.add(lcd);
        
        
        rcd11.setText("1.5 L");
        rcd11.setBackground(Color.black);
        rcd11.setForeground(Color.white);
        rcd11.setBounds(1020, 470, 70, 20);
        rcd11.setFont(fil);
        this.add(rcd11);
        
        rcd12.setText("0.5 L");
        rcd12.setBackground(Color.black);
        rcd12.setForeground(Color.white);
        rcd12.setBounds(1100, 470, 70, 20);
        rcd12.setFont(fil);
        this.add(rcd12);
        
        rcd13.setText("Tin");
        rcd13.setBackground(Color.black);
        rcd13.setForeground(Color.white);
        rcd13.setBounds(1180, 470, 70, 20);
        rcd13.setFont(fil);
        this.add(rcd13);
        
        g1.add(rcd11);
        g1.add(rcd12);
        g1.add(rcd13);
        
        rcd21.setText("1.5 L");
        rcd21.setBackground(Color.black);
        rcd21.setForeground(Color.white);
        rcd21.setBounds(1020, 540, 70, 20);
        rcd21.setFont(fil);
        this.add(rcd21);
        
        rcd22.setText("0.5 L");
        rcd22.setBackground(Color.black);
        rcd22.setForeground(Color.white);
        rcd22.setBounds(1100, 540, 70, 20);
        rcd22.setFont(fil);
        this.add(rcd22);
        
        rcd23.setText("Tin");
        rcd23.setBackground(Color.black);
        rcd23.setForeground(Color.white);
        rcd23.setBounds(1180, 540, 70, 20);
        rcd23.setFont(fil);
        this.add(rcd23);

        g2.add(rcd21);
        g2.add(rcd22);
        g2.add(rcd23);
        
        rcd31.setText("1.5 L");
        rcd31.setBackground(Color.black);
        rcd31.setForeground(Color.white);
        rcd31.setBounds(1020, 610, 70, 20);
        rcd31.setFont(fil);
        this.add(rcd31);
        
        rcd32.setText("0.5 L");
        rcd32.setBackground(Color.black);
        rcd32.setForeground(Color.white);
        rcd32.setBounds(1100, 610, 70, 20);
        rcd32.setFont(fil);
        this.add(rcd32);
        
        rcd33.setText("Tin");
        rcd33.setBackground(Color.black);
        rcd33.setForeground(Color.white);
        rcd33.setBounds(1180, 610, 70, 20);
        rcd33.setFont(fil);
        this.add(rcd33);
        
        g3.add(rcd31);
        g3.add(rcd32);
        g3.add(rcd33);
        
    }
    
    public void Disable(){
        for (int i = 0; i < tf.length; i++) {
            tf[i].setText("");
            tf[i].disable();
        }
}
    
    public void unselect(){
        for (int i = 0; i < tf.length; i++) {
            cb[i].setSelected(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Reset){
            Disable();
            unselect();
        }
    }

}