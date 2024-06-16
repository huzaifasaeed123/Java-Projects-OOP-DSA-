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
public class GradeBookWith1DArray {
    
    private String courseTitle;
    private Student[] marks;

    public GradeBookWith1DArray(Student[] marks)
    {
        this.setMarks(marks);
    }
    public void printGrade()
    {
        for(int i=0;i<this.marks.length;i++)
        {
        System.out.printf("%s",this.marks[i].toString());
        
        }
    }
    public String getCourseTitle() {
        return courseTitle;
    }

    public Student[] getMarks() {
        return marks;
    }

    public void setCourseTitle(String a) {
        this.courseTitle = a;
    }

    public void setMarks(Student[] a) {
        this.marks = a;
    }
    
}
