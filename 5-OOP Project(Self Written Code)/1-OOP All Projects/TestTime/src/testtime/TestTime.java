/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testtime;

/**
 *
 * @author saeed
 */
public class TestTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=23;
        int b=50;
        int c=56;
        java.sql.Time time=new java.sql.Time(a,b,c);
        
        System.out.println("Original Time");
        System.out.println(time.toString());
        System.out.println("After Increment 1 second");
        tick(a,b,c);
        System.out.println("After Incrementing 1 Mint");
        incrementMint(a,b,c);
        System.out.println("After Incrementing 1 Hour");
        incrementHour(a,b,c);
    }
    public static void tick(int a,int b,int c)
    {
        c=c+1;
        java.sql.Time time1=new java.sql.Time(a,b,c);
        System.out.println(time1.toString());
    }
    public static void incrementMint(int a,int b,int c)
    {
        b=b+1;
        java.sql.Time time2=new java.sql.Time(a,b,c);
        System.out.println(time2.toString());
    }
    public static void incrementHour(int a,int b,int c)
    {
        a=a+1;
        java.sql.Time time2=new java.sql.Time(a,b,c);
        System.out.println(time2.toString());
    }
}
