/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testsaleperson;

import java.util.Random;

/**
 *
 * @author saeed
 */
public class Sale {
    
    private int[][] a;
    private int[][] b;
   public Sale(int[][] a,int [][] b)
   {
       this.a=a;
       this.b=b;
   }
    public  void printarray()
    {
        
        int sum=0;
        System.out.printf("             Person 1    Person 2    Person 3    Person 4    Person 5    Total\n");
        for(int i=0;i<a.length;i++)
        {
            System.out.printf("\nProduct %d",i+1);
            for(int j=0;j<a[i].length;j++)
                
                {
                 System.out.printf("%10d ",this.a[i][j]+this.b[i][j]);
                 sum= sum+this.a[i][j]+this.b[i][j];
                 }
            System.out.printf("%10d\n",sum);
            sum=0;
        }
        System.out.println();
        System.out.printf("TOTAL(Per)");
        sum=0;
        for (int i=0;i<5;i++)
        {
           for (int j=0;j<5;j++)
           {
               
               sum= sum+this.a[j][i]+this.b[j][i];
               
           }
           System.out.printf("%11d", sum);
           sum=0;
        }
        System.out.println();
    }
    public  void selectRandomArray()
    {
        Random r=new Random();
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
                {
                 a[i][j]=r.nextInt(10);
                 }
        }
    }
    
}
