/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testemp7;

/**
 *
 * @author saeed
 */
public class Manager extends Employee
{
    private int golfhours;

    public Manager( String fname, String lname, int empid, int workedhours, double basepay, double payhour,int gh) {
        super(fname, lname, empid, workedhours, basepay, payhour);
        this.golfhours = 0;
        
        this.addgolfhours(gh);
    }

    
    
    public double getGolfhours() {
        return golfhours;
    }

    public void setGolfhours(int golfhours) {
        this.golfhours = golfhours;
    }
    
    public void addgolfhours(int a)
    {
        this.golfhours=a;
        int b=super.getWorkedhours()+a;
        super.setWorkedhours(b);
    }
    
    @Override
    public double weeklypay()
    {
        
        return (super.getPayperhour()*super.getWorkedhours());
    }
    @Override
    public String toString()
    {
        return String.format("First Name:%s\nLast Name:%s\nEmployee ID:%d\nWorked Hours:%d\nPay Per Hour:%.2f\ngolf Per Hour:%d", super.getFname(),super.getLname(),super.getEmpid(),super.getWorkedhours(),super.getPayperhour(),this.golfhours);
    }
    
}
