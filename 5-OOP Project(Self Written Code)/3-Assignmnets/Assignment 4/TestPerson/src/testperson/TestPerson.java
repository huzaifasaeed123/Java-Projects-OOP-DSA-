/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testperson;

/**
 *
 * @author saeed
 */
public class TestPerson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Student st=new Student("BCS",2020,20000.0,"Huzaifa Saeed","V.P.O Gujrat");
        System.out.println(st);
        Staff ts= new Staff("COMSAT",343483.0,"Prof Nasir Khan Sab","Abbtobbad");
        System.out.println(ts);
    }
    
}
