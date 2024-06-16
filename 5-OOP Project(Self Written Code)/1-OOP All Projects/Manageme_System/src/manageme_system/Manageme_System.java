/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manageme_system;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Fazal
 */
public class Manageme_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frame F = new Frame();
        /*Login l = new Login();
        l.setTitle("LOGIN PAGE");
        l.setSize(400, 300);
        l.intializer();
        l.setLocationRelativeTo(null);
        l.getContentPane().setBackground(Color.GRAY);
        l.setLayout(null);
        l.setVisible(true);
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
        F.setExtendedState(JFrame.MAXIMIZED_BOTH);
        F.setTitle("FAST FOOD REST");
        F.intializer();
        F.getContentPane().setBackground(Color.BLACK);
        F.setLayout(null);
        F.setVisible(true);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}