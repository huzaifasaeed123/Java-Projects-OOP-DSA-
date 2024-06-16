/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testemp2;

/**
 *
 * @author saeed
 */
public class CommissionEmp extends Employee
{
    private double grossSalary,CommRate;
    public CommissionEmp(String fname,String lname,String SocialSecurityNum,double grossSalary,double CommRate)
    {
        super(fname,lname,SocialSecurityNum);
        this.grossSalary=grossSalary;
        this.CommRate=CommRate;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getCommRate() {
        return CommRate;
    }

    public void setCommRate(double CommRate) {
        this.CommRate = CommRate;
    }
    @Override
    public String toString()
    {
        return String.format("Detail Of Employee\n%sGross Salary:%s\nCommissionRate:%s\n",super.toString(),this.grossSalary,this.CommRate);
    }
    public double earning()
    {
        return this.CommRate*this.grossSalary;
    }
    
}
