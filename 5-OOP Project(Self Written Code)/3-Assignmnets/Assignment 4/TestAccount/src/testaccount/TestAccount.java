
package testaccount;

import java.util.Scanner;
public class TestAccount {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        Account []arr=new Account[3];
        for (int i = 0; i < arr.length; i++) {
            
            System.out.println("Enter 1 For Current Account\nEnter 2 For Saving Account");
        int c=input.nextInt();
        if(c==1)
        {
            System.out.println("Enter Account Number(Integer)");
            int a=input.nextInt();
            System.out.println("Enter Amount In Double");
        double b=input.nextDouble();
       
            arr[i]=new Current(a,b);
        }
        else if(c==2)
        {
            
            System.out.println("Enter Account Number(Integer)");
            int a=input.nextInt();
            System.out.println("Enter Amount In Double");
            double b=input.nextDouble();
            System.out.println("Enter Interest Rate(Double)");
        double d=input.nextDouble();
            arr[i]=new Saving(d,a,b);
        }
        }
        for (int i = 0; i <arr.length; i++) {
            
            arr[i].display();
        }
    }
    
}
