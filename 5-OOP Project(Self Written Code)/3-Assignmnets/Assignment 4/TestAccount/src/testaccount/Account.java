/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testaccount;

/**
 *
 * @author saeed
 */
public class Account {
    private int AccountNum;
    private double AccountBal;

    public Account(int AccountNum, double AccountBal) {
        this.AccountNum = AccountNum;
        this.AccountBal = AccountBal;
    }

    
    public int getAccountNum() {
        return AccountNum;
    }

    public void setAccountNum(int AccountNum) {
        this.AccountNum = AccountNum;
    }

    public double getAccountBal() {
        return AccountBal;
    }

    public void setAccountBal(double AccountBal) {
        this.AccountBal = AccountBal;
    }
    
    public void display()
    {
        System.out.printf("-----------Here Account Information--------------\nAccount Number:%d\nAccount Balance:%.2f\n",this.getAccountNum(),this.getAccountBal());
    }
    
    
}
