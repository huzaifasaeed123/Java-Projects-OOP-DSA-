/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testairline;

import java.util.Scanner;

/**
 *
 * @author saeed
 */
public class TestAirline {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] a=new int[10];
        Scanner input=new Scanner(System.in);
        System.out.println("Please type 1 for First Class and Please type 2 for Economy.");
        int b=input.nextInt();
        
        if(b==1)
        {
            for(int i=0;i<5;i++)
            {
                if(a[i]==0)
                {
                    a[i]=1;
                }
                else
                {
                    
                }
            }
        }
        else if(b==2)
        {
            for(int i=5;i<10;i++)
            {
                if(a[i]==0)
                {
                    a[i]=1;
                }
                
            }
        }
    }
    
}
