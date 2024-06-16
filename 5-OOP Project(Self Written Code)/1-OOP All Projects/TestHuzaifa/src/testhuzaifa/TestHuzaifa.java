/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testhuzaifa;

/**
 *
 * @author saeed
 */
public class TestHuzaifa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []a={3,5,6,3,5};
        int []b={5,5,8,3,5};
        int []c={3,5,4,3,6};
        int []d={3,7,6,3,9};
        Huzaifa [] ab=new Huzaifa[5];
        ab[0]=new Huzaifa("Huzaifa",a);
        ab[1]=new Huzaifa("Fazal",b);
        ab[2]=new Huzaifa("Basit",c);
        ab[3]=new Huzaifa("Ammar",d);
        ab[4]=new Huzaifa("HLi",a);
        
        
        GradeBook r=new GradeBook("Computer Sciencs",ab);
        GradeBook ra=new GradeBook("Arabic",ab);
        r.Hello();
        ra.Hello();
        
    }
    
}
