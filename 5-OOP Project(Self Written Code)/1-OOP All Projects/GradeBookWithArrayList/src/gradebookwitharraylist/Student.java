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
public class Student 
{
private String Name;
private ArrayList<Double> m_l;

    public Student(String Name, ArrayList<Double> m_l) {
        this.Name = Name;
        this.m_l = m_l;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public ArrayList<Double> getM_l() {
        return m_l;
    }

    public void setM_l(ArrayList<Double> m_l) {
        this.m_l = m_l;
    }
@Override
    public String toString()
    {
        String str="";
        str+=this.getName()+"    ";
        for(int i=0 ; i<this.m_l.size(); i++)
        {
            str+=this.m_l.get(i)+"    ";
        }
        return str;
    }



}