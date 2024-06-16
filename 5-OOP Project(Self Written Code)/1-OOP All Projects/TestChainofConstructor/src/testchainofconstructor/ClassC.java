/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testchainofconstructor;

/**
 *
 * @author Admin
 */
public class ClassC extends ClassB
{
    public ClassC()
{
    System.out.println("No Argument Constructor of Class C");
}
public ClassC(int a)
{
    
    System.out.println("One Argument Constructor of Class C");
}
public ClassC(int a, int b)
{
    super(a,b);
    System.out.println("Two Argument Constructor of Class C");
}
}