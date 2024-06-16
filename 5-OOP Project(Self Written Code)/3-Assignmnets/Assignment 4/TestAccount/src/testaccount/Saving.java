/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testaccount;

/**
 *
 * @author saeed
 */
public class Saving extends Account
{
    private double interestrate;

    public Saving(double interestrate, int AccountNum, double AccountBal) 
    {
        super(AccountNum, AccountBal);
        this.interestrate = interestrate;
    }

    
    public double getInterestrate() {
        return interestrate;
    }

    public void setInterestrate(double interestrate) {
        this.interestrate = interestrate;
    }
    
    
    public void display()
    {
        System.out.println("Saving Account:");
        super.display();
        System.out.printf("Interest Rate:%.2f\n",this.getInterestrate());
        
    }
    
}
