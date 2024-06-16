/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testemp3;

/**
 *
 * @author saeed
 */
public class HourlyEmployee extends Employee
{
    private double hours,wage;
    
    public HourlyEmployee(String fname, String lname, String SocialSecurityNum,double hours,double wage)
    {
        super(fname,lname,SocialSecurityNum);
        this.setHours(hours);
        this.setWage(wage);
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if(hours>0 && hours<=168)
        this.hours = hours;
        else
            System.out.println("Put Hpours In Range between 0 to 168");
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage>0)
        this.wage = wage;
        else
            System.out.println("Put Correct Valaue of wage(Positive)");
    }
    public double Earning()
    {
        if(hours<40)
        {
            
            double earning= hours*wage;
            return earning;
        }
        else
        {
            
           double c= (40*wage)+((wage*1.5)*(hours-40));
           return c;
        }
    }
    @Override
    public String toString()
    {
        return String.format("%sEarning:%f",super.toString(),this.Earning());
    }
    
}
