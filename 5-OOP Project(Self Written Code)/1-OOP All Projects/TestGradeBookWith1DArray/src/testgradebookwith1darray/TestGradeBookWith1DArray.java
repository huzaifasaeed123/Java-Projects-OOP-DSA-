/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgradebookwith1darray;

/**
 *
 * @author fa21-bcs-020
 */
public class TestGradeBookWith1DArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Student[] std=new Student[3];
        std[0]=new Student("Huzaifa Saeed","FA21-BCS-020",20.6);
        std[1]=new Student("Ali ","FA21-BCS-018",16.8);
        std[2]=new Student("Dghfghf ","FAfghdfCS-018",76.0);
        GradeBookWith1DArray oop=new GradeBookWith1DArray(std);
        oop.printGrade();
        
    }
    
}
