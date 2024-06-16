/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testdice;

import java.util.Random;

/**
 *
 * @author saeed
 */
public class TestDice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r =new Random();
        int []arr=new int[13];
        int freq=0;
        for(int i=0;i<36000;i++)
        {   
            int a;
            int b;
            a=r.nextInt(6)+1;
            b=r.nextInt(6)+1;
            int c=a+b;
            arr[c]++;
            
            
            
            
        }
        for(int i=1;i<13;i++)
        {
            System.out.printf("Index %d pr %d\n",i,arr[i]);
        }
    }
    
}
