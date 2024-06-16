/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testattandance1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author saeed
 */
public class MainFrame {

    public static int classA = 1;
    public static int classB = 1;
    public static int classC = 1;
    public static Border t = BorderFactory.createLineBorder(Color.BLACK, 4);
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

    public void start1() {

        String[] a = {
            "Huzaifa Marwasi",
            "Basit Ali ",
            "Fazal-ur-Rehman",
            "Ammar Abbas",
            "Talha Aslam",
            "Usman Khan",
            "Zawar Nabeel",
            "Imtinan Haider",
            "Rafey Bhatti",
            "Haseeb Abdullah",};
        String[] b = {
            "Amal Abbas",
            "Mahsooma Zainab",
            "Zarish Jameel",
            "Eman Abbasi",
            "Mahnoor ",
            "Faitama GUL",
            "Maria Adil",
            "Ayesha",
            "Dua Zahra ",
            "Hira Basit",};
        String[] c = {
            "Samam Ali",
            "Mehtab Lagari",
            "Umer Farooq",
            "Hassan Ali",
            "Danial Abbas ",
            "Daoud Ibrahim",
            "Hadi Hussain",
            "Ahmed Waqas",
            "Hashir Rehman",
            "Zohaib Hassan",};
        String[] reg = {
            "FA21-BCS-001",
            "FA21-BCS-002",
            "FA21-BCS-003",
            "FA21-BCS-004",
            "FA21-BCS-005",
            "FA21-BCS-011",
            "FA21-BCS-017",
            "FA21-BCS-020",
            "FA21-BCS-021",
            "FA21-BCS-022", //            "FA21-BCS-020",
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
        JFrame fr = new JFrame();
        fr.setTitle("Class Selection");
        fr.getContentPane().setBackground(Color.WHITE);
        fr.setLocation(400, 100);
        fr.setSize(600, 600);
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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
        
        icon.setBounds(50, 20, 390, 120);
        fr.add(icon);
        

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String date = txt.getText();

                if (cmb.getSelectedIndex() == 0) {
                    fr.dispose();
                    Attandance obj = new Attandance(a, reg, date, "SECTION 3A");
                    obj.intilize();
                } else if (cmb.getSelectedIndex() == 1) {
                    fr.dispose();
                    Attandance obj = new Attandance(b, reg, date, "SECTION 3B");
                    obj.intilize();
                } else if (cmb.getSelectedIndex() == 2) {
                    fr.dispose();
                    Attandance obj = new Attandance(c, reg, date, "SECTION 3C");
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
