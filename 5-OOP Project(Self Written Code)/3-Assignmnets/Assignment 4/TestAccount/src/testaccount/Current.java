/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testaccount;

/**
 *
 * @author saeed
 */
public class Current extends Account
{

    public Current(int AccountNum, double AccountBal) {
        super(AccountNum, AccountBal);
    }
    
    @Override
    public void display()
    {
        System.out.println("Current Account:");
        super.display();
    }
}
