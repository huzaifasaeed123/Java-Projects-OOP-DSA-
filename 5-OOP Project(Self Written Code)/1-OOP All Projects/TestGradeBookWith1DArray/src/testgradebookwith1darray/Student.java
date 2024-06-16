/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgradebookwith1darray;


public class Student {
    private String name,regno;
    private double marks;

    public Student(String a,String b,double c){
    this.setName(a);
    this.setRegno(b);
    this.setMarks(c);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getRegno() {
        return regno;
    }

    public double getMarks() {
        return marks;
    }
    public String toString()
    {
        return String.format("%-15s%-15s%-15f\n",this.getName(),this.getRegno(),this.getMarks());
    }
}
