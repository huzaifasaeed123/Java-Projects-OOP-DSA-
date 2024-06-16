/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays2;

import java.util.Arrays;

public class Arrays2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application ogic here
       int [] abc={};
       
       
        int [][]a={{1,2,3,14,5},
                   {7,10,7,4,9}};
         //Row By Row
         System.out.println("Row By Row");
        for (int i=0;i<2;i++)
        {
           for (int j=0;j<5;j++)
           {
               System.out.printf("%d ", a[i][j]);
           }
           System.out.println();
        }
//Column By Column
System.out.println("Column By Column");
        for (int i=0;i<5;i++)
        {
           for (int j=0;j<2;j++)
           {
               System.out.printf("%d ", a[j][i]);
           }
           System.out.println();
        }
        System.out.println("Method to print toString 2D Arrays");
        System.out.println(Arrays.deepToString(a));
        
        //RAGGED ARRAYS
        System.out.println("RAGGED ARRAYS");
        int [][]b={{1,2,3,5,},
                   {7,10,7,4,9},
                   {4,6}
        };
        for(int i=0;i<b.length;i++)
        {
           for (int j=0;j<b[i].length;j++)
           {
               System.out.printf("%d ", b[i][j]);
           }
           System.out.println();
        }
        System.out.println("Exercize # 1(print sum of eac row)");
        int sum=0;
        for (int i=0;i<2;i++)
        {
           for (int j=0;j<5;j++)
           {
               
               sum= sum+a[i][j];
               
           }
           System.out.printf("%d \n", sum);
           sum=0;
        }
        System.out.println("Exercize # 1(print sum of each column)");
        
        for (int i=0;i<5;i++)
        {
           for (int j=0;j<2;j++)
           {
               
               sum= sum+a[j][i];
               
           }
           System.out.printf("%d \n", sum);
           sum=0;
        }
        
        
        System.out.println("Exercize # 2 (To Find Maximum)");
        int ab=0;
        for (int i=0;i<2;i++)
        {
            ab=a[i][0]; 
           for (int j=1;j<5;j++)
           {
               
              
              if(a[i][j]>ab)
              {
                  ab=a[i][j];
              }
              else
              {
                  
              }
              
           }
           System.out.println(ab);
        }
        //1D Arrays By Neso Academy
        
        //Arrays.sort(a);
        //int d;
        //d = Arrays.binarySearch(a,4);
        //System.out.println(d);
        /*Arrays.sort(a);
        int[] c=arrange(a,b);
        System.out.println(Arrays.toString(c));
    
        
}
      public static int[] arrange(int[] a,int [] b)
        {
             int j=0;
             int k=9;
            for(int i=0;i<a.length;i++)
             {
            if(a[i]%2==0)
            {
                b[j]=a[i];
                j++;
            }
            else
            {
                b[k]=a[i];
                k--;
            }
            }
          return b;
        
        }     
         
        /*if(b<1 && b>20)
        {
            b=0;
            b=c.nextInt();
            
        }
        int a[]={6,4,7,2,9,7,3,6,4};
        Arrays.sort(a,2,7);
        int b= Arrays.binarySearch(a,1);
        System.out.println(b+"Here index found");
        for(int i=0;i<a.length;i++)
        {
           System.out.println(a[i]);
     
        }*/
 }}
    

