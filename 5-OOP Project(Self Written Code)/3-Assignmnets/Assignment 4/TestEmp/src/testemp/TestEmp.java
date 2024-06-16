/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testemp;

/**
 *
 * @author saeed
 */
public class TestEmp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CommissionEmp a=new CommissionEmp("Huzaifa","Saeed","1",1000.0,0.2);
        BasePlusComm b =new BasePlusComm(2000,a);
        b.earning();
    }
    
}
