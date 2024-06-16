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
public class ClassA 
{
public ClassA()
{
    System.out.println("No Argument Constructor of Class A");
}
public ClassA(int a)
{
    System.out.println("One Argument Constructor of Class A");
}
public ClassA(int a, int b)
{
    System.out.println("Two Argument Constructor of Class A");
}
}