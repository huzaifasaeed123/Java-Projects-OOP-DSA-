/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testhuzaifa;

/**
 *
 * @author saeed
 */
public class Huzaifa {
    private String Name;
    private int [] abc;
    
    public Huzaifa(String a,int[] b)
    {
        this.Name=a;
        this.abc=b;
    }
    public String display()
    {
        System.out.println();
        for(int i=0;i<abc.length;i++)
        {
            System.out.printf("%d  ",abc[i]);
        }
        
        return Name;
    }
    
}
