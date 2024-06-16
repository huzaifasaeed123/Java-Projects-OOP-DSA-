/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgradebook;

/**
 *
 * @author fa21-bcs-020
 */
public class TestGradeBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a,b,c,d,tm;
        GradeBook oop = new GradeBook();
        oop.setSubject("CSC 10254 ");
        System.out.printf("Subject::");
        oop.setquiz(12.5);
        System.out.println(oop.getquiz());
        oop.setAssignment(8.09);
        System.out.println(oop.getAssignment());
        oop.setmidterm(24.5);
        System.out.println(oop.getmidterm());
        oop.setfinalmarks(90);
        a=oop.getAssignment() * 10/10;
        b=oop.getquiz() * 15 /10;
        c=oop.getmidterm() * 25 / 50 ;
        d=oop.getfinalmarks() * 50 /100;
        tm= a+b+c+d;
        System.out.printf("Your Overall Marks is ::%f\n",tm);
        System.out.printf("Your Grade is ::");
        if(tm>85 && tm<100){System.out.println("A");}
        else if(tm>=85 && tm<=100){System.out.println("A");}
        else if(tm>=80 && tm<85){System.out.println("A-");}
        else if(tm>=75 && tm<80){System.out.println("B+");}
        else if(tm>=70 && tm<75){System.out.println("B");}
        else if(tm>=68 && tm<70){System.out.println("B-");}
        else if(tm>=64 && tm<68){System.out.println("C+");}
        else if(tm>=60 && tm<64){System.out.println("C");}
        else if(tm>50 && tm<60){System.out.println("D");}
        else {System.out.println("Less Than 50% And You Are Fail");}
    }
    
}
