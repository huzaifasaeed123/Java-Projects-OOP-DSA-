/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testrecursion;

/**
 *
 * @author saeed
 */
public class TestRecursion {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //printDecending(12);

        System.out.println(fibnachi(9));
        //System.out.println(SumOfNatural(5));
    }
    public static int factorial(int n)
    {
        int sum;
        if(n==1)
        {
            return 1;
        }
        else
        {
           n=n*factorial(n-1);
            return n;
        }
    }
     public static int SumOfNatural(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
           n=n+SumOfNatural(n-1);
            return n;
        }
    }
    public static int fibnachi(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        else
        {
           n=fibnachi(n-2)+ fibnachi(n-1);
            //System.out.println(n);
            return n;
        }
    }
}
