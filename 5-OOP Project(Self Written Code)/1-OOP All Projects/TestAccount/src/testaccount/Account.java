/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaccount;

/**
 *
 * @author fa21-bcs-020
 */
public class Account {
    private int acccountid;
    private String accountTitle;
    private double opoeningbal;
    private double accountbal;
    private String emailID;
    private AtmCard detail;
    private static int minBalLimit=100;
    private static int numAccount;

    public Account(int acccountid, String accountTitle, double opoeningbal, double accountbal, String emailID, AtmCard detail) {
        this.acccountid = acccountid;
        this.accountTitle = accountTitle;
        this.opoeningbal = opoeningbal;
        this.accountbal = accountbal;
        this.emailID = emailID;
        this.detail = detail;
        numAccount++;
    }

    public int getAcccountid() {
        return acccountid;
    }

    public void setAcccountid(int acccountid) {
        this.acccountid = acccountid;
    }

    public String getAccountTitle() {
        return accountTitle;
    }

    public void setAccountTitle(String accountTitle) {
        this.accountTitle = accountTitle;
    }

    public double getOpoeningbal() {
        return opoeningbal;
    }

    public void setOpoeningbal(double a) {
        if(a>=5000)
        {
        this.opoeningbal = a;
        }
        else
            System.out.println("Please put minimum balance above 500");
   }

    public double getAccountbal() {
        return accountbal;
    }

    public void setAccountbal(double accountbal) {
        this.accountbal = accountbal;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public AtmCard getDetail() {
        return detail;
    }

    public void setDetail(AtmCard detail) {
        this.detail = detail;
    }
    public void deposit(double amount)
    {
        this.accountbal=this.opoeningbal+amount;
    }
    public void withdraw(double amount)
    {
        if(this.accountbal-amount>=minBalLimit)
        {
            this.accountbal=this.accountbal-amount;
        }
        else
            System.out.println("Minimum Balance ");
    }
    @Override
    public String toString()
    {
        return String.format("ATM CARD Detail Are Following:\n%s\nAccount Name Holder:%s\nAccount Email ID:%s\nCurrent AccountBalance:%.2f\nTotal num of Account has been created:%d\n",this.detail.toString(),this.accountTitle,this.emailID,this.accountbal,numAccount);
    }
    
}
