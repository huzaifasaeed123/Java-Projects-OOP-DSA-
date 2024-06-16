/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismtest;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class PolymorphismTEst 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Animal[] arr=new Animal[100];
        /*Random r=new Random();
        for(int i=0; i<arr.length; i++)
        {
            int n=r.nextInt(4)+1;
            if(n==1)
            {
                arr[i]=new Frog();
            }
            else
            if(n==2)
            {
                arr[i]=new Fish();
            }
            else
            if(n==3)
            {
                arr[i]=new Bird();
            }
            else
            if(n==4)
            {
                arr[i]=new Corcodial();
            }
        }
        
        for(int i=0; i<arr.length; i++)
        {
            arr[i].move();
        }*/
        arr[1]=new Frog();
        arr[1].move();
        
    }
    
    
}