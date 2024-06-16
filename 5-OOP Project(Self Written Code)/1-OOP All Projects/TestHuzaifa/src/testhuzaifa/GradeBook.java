/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testhuzaifa;

/**
 *
 * @author saeed
 */
public class GradeBook {
    private String subject;
    private Huzaifa [] std;
    
    
    public GradeBook(String a, Huzaifa[] ab)
    {
        this.subject=a;
        this.std=ab;
    }
    
    public void Hello()
    {
        System.out.printf("\n%s",subject);
        for(int i=0;i<std.length;i++)
        {
            System.out.printf("%s", this.std[i].display());
        }
        
    }
    
}
