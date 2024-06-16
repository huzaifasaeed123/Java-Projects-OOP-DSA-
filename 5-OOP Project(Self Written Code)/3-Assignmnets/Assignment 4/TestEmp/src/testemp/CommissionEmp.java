/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testemp;

/**
 *
 * @author Admin
 */
public class CommissionEmp 
{
    private String firstName;
    private String lastName;
    private String empID;
    private double grossSale;
    private double commRate;

    public CommissionEmp(String fn, String ln, String id, double gs, double cr)
    {
       this.setFirstName(fn);
       this.setLastName(ln);
       this.setEmpID(id);
       this.setGrossSale(gs);
       this.setCommRate(cr);
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public double getGrossSale() 
    {
        
        return grossSale;
    }

    public void setGrossSale(double gs) 
    {
        if(gs>=0)
        this.grossSale = gs;
        else
        this.grossSale=0.0;
    }

    public double getCommRate() {
        return commRate;
    }

    public void setCommRate(double cr) {
        if(cr>0 && cr<1.0)
        this.commRate = cr;
        else
        this.commRate=0.0;
        
    }
    
    @Override
    public String toString()
    {
           return String.format("First Name: %s Last Name: %s Emp ID: %s Gross Sale:%.2f Comm Rate: %.2f", this.firstName,this.lastName,this.empID,this.grossSale,this.commRate);
    }
    
    public double earning()
    {
        return this.commRate*this.grossSale;
    }
    
}