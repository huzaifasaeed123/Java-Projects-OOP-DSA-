/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebookwitharraylist;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class GradeBookWithArrayList {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ArrayList<Double> list1=new ArrayList<>();
    list1.add(56.44);
        list1.add(45.7);
          list1.add(56.44);
        list1.add(45.7);
  ArrayList<Double> list2=new ArrayList<Double>();
    list2.add(65.44);
        list2.add(65.7);
       
        // TODO code application logic here
        Student [] arr=new Student[5];
        arr[0]=new Student("Ali",list1);
        //list1.clear();
      
        arr[1]=new Student("Khurram",list2);
        //list1.clear();
        arr[2]=new Student("IJaz",list1);
        arr[3]=new Student("Adil",list2);
        arr[4]=new Student("Ahmed",list2);
        
        
        GradeBook b=new GradeBook("CSC-103 PF",arr);
        b.processGrade();
    }
    
}


