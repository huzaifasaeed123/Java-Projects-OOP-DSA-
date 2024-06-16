/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testemp2;

/**
 *
 * @author saeed
 */
public class BasePlusCommEmp extends CommissionEmp
{
    private double BaseSale;
    
    public BasePlusCommEmp(String fname,String lname,String SocialSecurityNum,double grossSalary,double CommRate,double BaseSale)
    {
        super(fname,lname,SocialSecurityNum,grossSalary,CommRate);
        this.BaseSale=BaseSale;
    }

    public double getBaseSale() {
        return BaseSale;
    }

    public void setBaseSale(double BaseSale) {
        this.BaseSale = BaseSale;
    }
    @Override
    public String toString()
    {
        return String.format("%sBase Sale:%2f",super.toString(),this.BaseSale);
    }
    public void Earning()
    {
        System.out.printf("Total Salary:%f\n",this.BaseSale+super.earning());
    }
    
}
