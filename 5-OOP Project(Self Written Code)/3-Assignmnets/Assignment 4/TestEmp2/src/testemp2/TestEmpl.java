/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testemp2;

/**
 *
 * @author saeed
 */
public class TestEmpl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BasePlusCommEmp e=new BasePlusCommEmp("Huzaifa","Saeed","A201",1000.0,0.3,2000);
        System.out.println(e.toString());
        e.Earning();
    }
    
}
