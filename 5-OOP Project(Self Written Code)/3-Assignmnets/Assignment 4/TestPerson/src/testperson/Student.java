/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testperson;

/**
 *
 * @author saeed
 */
public class Student extends Person
{
    private String Program;
    private int year;
    private double fee;

    public Student(String Program, int year, double fee, String name, String address) {
        super(name, address);
        this.Program = Program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return Program;
    }

    public void setProgram(String Program) {
        this.Program = Program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    @Override
    public String toString()
    {
        return String.format("%s\nProgramm:%s\nYear:%d\nFee:%.2f",super.toString(),this.Program,this.year,this.fee );
    }
}
