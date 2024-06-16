/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbinary;

/**
 *
 * @author fa21-bcs-017
 */
public class BInaryTreeWithArray 
{
    int [] arr=new int[15];
    int id=1;
    public void insertRootNode(int data)
    {
        arr[id]=data;

    }
     public void insertleft(int data,int root)
    {
        if(arr[root]==0)
        {
            System.out.println("CAnot find parent");
        }
        else
        {
            int t=(root*2);
             arr[t]=data;
        }
    }
     public void insertright(int data,int root)
    {
        if(arr[root]==0)
        {
            System.out.println("CAnot find parent");
        }
        else
        {
            int t=(root*2)+1;
             arr[t]=data;
        }
        
    }
     public void printTree()
     {
         for (int i = 1; i < arr.length; i++) {
             System.out.print(arr[i]+ " ");
         }
     }
    

    
}
