/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testemp7;

/**
 *
 * @author saeed
 */
public class Employee {
    private String fname,lname;
    private int empid,workedhours;
    private double basepay,payperhour;

    public Employee(String fname, String lname, int empid, int workedhours,  double basepay,double payhour) {
        this.fname = fname;
        this.lname = lname;
        this.empid = empid;
        this.workedhours = workedhours;
        
        this.basepay = basepay;
        this.payperhour=payhour;
    }

    public double getPayperhour() {
        return payperhour;
    }

    public void setPayperhour(double payperhour) {
        this.payperhour = payperhour;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getWorkedhours() {
        return workedhours;
    }

    public void setWorkedhours(int workedhours) {
        this.workedhours = workedhours;
    }

   

    public double getBasepay() {
        return basepay;
    }

    public void setBasepay(double basepay) {
        this.basepay = basepay;
    }
    
    public double weeklypay()
    {
        return (this.getPayperhour()*this.getWorkedhours())+this.getBasepay();
    }
    
    @Override
    public String toString()
    {
        return String.format("First Name:%s\nLast Name:%s\nEmployee ID:%d\nWorked Hours:%d\nPay Per Hour:%.2f\n", this.getFname(),this.getLname(),this.getEmpid(),this.getWorkedhours(),this.getPayperhour());
    }
    
}
