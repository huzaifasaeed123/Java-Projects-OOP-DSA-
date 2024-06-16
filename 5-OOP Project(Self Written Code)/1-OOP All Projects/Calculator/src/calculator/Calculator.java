
package calculator;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
       float a,b;
       System.out.print("Please Enter 1st Float");
       Scanner f1 = new Scanner(System.in);
       a=f1.nextFloat();
        System.out.print("Please Enter 2nd Float");
       b=f1.nextFloat();
       System.out.println(a+b);
       System.out.print("Sub\t\t\tObtain Markst\t\tTotal Marks\n");
    }
    
}
