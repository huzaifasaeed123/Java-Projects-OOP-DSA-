/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testemp;
/**
 *
 * @author saeed
 */
public class BasePlusComm {
    private double base;
    private CommissionEmp detail;

    public BasePlusComm(double base, CommissionEmp detail) {
        this.base = base;
        this.detail = detail;
    }
    

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public CommissionEmp getDetail() {
        return detail;
    }

    public void setDetail(CommissionEmp detail) {
        this.detail = detail;
    }
    public void earning()
    {
        System.out.println(this.detail.toString());
        System.out.printf("Total Earning With Base Sale:%f\n",this.base+this.detail.earning());
    }
    
    
    
    
    
    
}
