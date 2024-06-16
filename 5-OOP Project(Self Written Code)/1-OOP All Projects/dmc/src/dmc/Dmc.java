/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmc;
import java.util.Scanner;
/**
 *
 * @author fa21-bcs-020
 */
public class Dmc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         float sub1t,sub2t,sub3t,sub4t,sub5t,sub1o,sub2o,sub3o,sub4o,sub5o;
       float persub1,persub2,persub3,persub4,persub5,totalmarks,obtainmarks,totalper;
         Scanner f1 = new Scanner(System.in);
       System.out.print("Please Enter 1st Subject Total Marks::");
       sub1t=f1.nextFloat();
       System.out.print("Please Enter 1st Subject Obtained Marks::");
       sub1o=f1.nextFloat();
        System.out.print("Please Enter 2nd Subject Total Marks::");
       sub2t=f1.nextFloat();
       System.out.print("Please Enter 2nd Subject Obtained Marks::");
       sub2o=f1.nextFloat();
        System.out.print("Please Enter 3rd Subject Total Marks::");
       sub3t=f1.nextFloat();
       System.out.print("Please Enter 3rd Subject Obtained Marks::");
       sub3o=f1.nextFloat();
        System.out.print("Please Enter 4th Subject Total Marks::");
       sub4t=f1.nextFloat();
       System.out.print("Please Enter 4th Subject Obtained Marks::");
       sub4o=f1.nextFloat();
        System.out.print("Please Enter 5th Subject Total Marks");
       sub5t=f1.nextFloat();
       System.out.print("Please Enter 5th Subject Obtained Marks");
       sub5o=f1.nextFloat(); 
       persub1= sub1o*100/sub1t;
       persub2= sub2o*100/sub2t;
       persub3= sub3o*100/sub3t;
       persub4= sub4o*100/sub4t;
       persub5= sub5o*100/sub5t;
      totalmarks=sub1t+sub2t+sub3t+sub4t+sub5t;
      obtainmarks=sub1o+sub2o+sub3o+sub4o+sub5o;
      totalper= obtainmarks*100/totalmarks;
      System.out.print("****************Matric DMC****************\n");
      System.out.println("Name\t\tM.Huzaifa Saeed");
      System.out.println("Father Name\tBashrat Saeed");
      System.out.print("Sub\t\t\tObtain Markst\tTotal Marks\tPercentage\n");
      System.out.printf("Sub1\t\t\t%.2f\t\t%.2f\t\t%f\n",sub1o,sub1t,persub1);
      System.out.printf("Sub2\t\t\t%.2f\t\t%.2f\t\t%f\n",sub2o,sub2t,persub2);
      System.out.printf("Sub3\t\t\t%.2f\t\t%.2f\t\t%f\n",sub3o,sub3t,persub3);
      System.out.printf("Sub4\t\t\t%.2f\t\t%.2f\t\t%f\n",sub4o,sub4t,persub4);
      System.out.printf("Sub5\t\t\t%.2f\t\t%.2f\t\t%f\n\n",sub5o,sub5t,persub5);
      System.out.printf("Total\t\t\t%.2f\t\t%.2f\t\t%f\n\n",obtainmarks,totalmarks,totalper);
      
      
    
    }
    
}
