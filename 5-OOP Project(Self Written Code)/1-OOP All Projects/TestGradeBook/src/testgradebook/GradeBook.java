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
public class GradeBook {
    private String Subject;
    private double quiz;
    private double Assignment; 
    private double midterm;
    private double finalmarks;
    public void setfinalmarks(double a)
    {
       if(a>0 && a<100)
       {
        this.finalmarks=a;
       }
       else
       {
           System.out.println("Plz put correct marks");
       }
       
    }
    public double getfinalmarks()
    {

           return finalmarks;
               
    }
    public void setmidterm(double a)
    {
        this.midterm=a;
    }
    public double getmidterm()
    {
        return midterm;
    }
     public void setAssignment(double a)
 {
     this.Assignment=a;
 }
 public double getAssignment()
 {
  return Assignment;   
 }
    public void setquiz(double a)
 {
     this.quiz=a;
 }
 public double getquiz()
 {
  return quiz;   
 }
    
 public void setSubject(String a)
 {
     this.Subject=a;
 }
 public String getSubject()
 {
  return Subject;   
 }
 
 
    
}
