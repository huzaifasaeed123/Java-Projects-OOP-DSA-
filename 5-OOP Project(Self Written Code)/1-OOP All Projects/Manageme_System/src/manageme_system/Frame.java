
package manageme_system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JRadioButton;
public class Frame extends JFrame{
    JLabel l1 = new JLabel(); 
    JLabel l2 = new JLabel();
    JLabel l3 = new JLabel();
    JLabel l4 = new JLabel();
    JLabel l5 = new JLabel();
    JLabel l6 = new JLabel();
    JLabel l7 = new JLabel();
    JLabel lb = new JLabel();
    JLabel ls = new JLabel();
    JLabel lr = new JLabel();
    JLabel lsh = new JLabel();
    JLabel lcd = new JLabel();
    
    JCheckBox[] cb = new JCheckBox[20];
//    cbd[0] = new JCheckBox();
//    cbd[1]=new JCheckBox();
    
    JTextField[] tf = new JTextField[20];
    String[] ItemName = {"HOT CHEETOS BURGER",
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
                         "FENTA",
    };
    JRadioButton rcd11 = new JRadioButton();
    JRadioButton rcd12 = new JRadioButton();
    JRadioButton rcd13 = new JRadioButton();
    ButtonGroup g1 = new ButtonGroup();
    JRadioButton rcd21 = new JRadioButton();
    JRadioButton rcd22 = new JRadioButton();
    JRadioButton rcd23 = new JRadioButton();
    ButtonGroup g2 = new ButtonGroup();
    JRadioButton rcd31 = new JRadioButton();
    JRadioButton rcd32 = new JRadioButton();
    JRadioButton rcd33 = new JRadioButton();
    ButtonGroup g3 = new ButtonGroup();
    Font ft = new Font("Time New Roman",Font.ITALIC+Font.BOLD,50);
    Font fi = new Font("Time New Roman",Font.ITALIC+Font.BOLD,40);
    Font fil = new Font("Time New Roman",Font.ITALIC+Font.BOLD,15);
    Border b = BorderFactory.createLineBorder(Color.WHITE,4);
    Color o = new Color(255,140,0);
    public void intializer(){
        //Disable();
        
        for (int i = 0; i < cb.length; i++){
            cb[i]=new JCheckBox(ItemName[i]);
            cb[i].setBackground(Color.black);
            cb[i].setForeground(Color.white);
            cb[i].setFont(fil);
            this.add(cb[i]);
            tf[i]=new JTextField();
            tf[i].setText("0");
            tf[i].setHorizontalAlignment(JTextField.CENTER);
            this.add(tf[i]);

        }
        
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
        ls.setFont(fi);
        ls.setForeground(o);
        this.add(ls);
        
        l3.setText("Fast Food");
        l3.setForeground(o);
        l3.setHorizontalAlignment(JLabel.CENTER);
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
        lr.setOpaque(true);
        lr.setForeground(o);
        this.add(lr);
        
        l5.setBounds(540, 400, 450, 290);
        l5.setBorder(b);
        this.add(l5);
        
        l6.setBounds(1010, 20, 330, 300);
        l6.setBorder(b);
        this.add(l6);
        
        lsh.setText("SHAWARMA");
        lsh.setBounds(1010, 30, 330, 50);
        lsh.setHorizontalAlignment(JLabel.CENTER);
        lsh.setFont(fi);
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
        
    }
}