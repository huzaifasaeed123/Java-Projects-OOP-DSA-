/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testqueue;

/**
 *
 * @author fa21-bcs-020
 */
public class MyQueue<T>
{
    private int head=0;
    private int tail=-1;
    T[] arr=(T[])new Object[5];
    public boolean isFull()
    {
        if(tail==arr.length-1)
            return true;
        else
            return false;             
    }
    public boolean isEmpty()
    {
        if(tail<0)
            return true;
        else
            return false;             
    }
    public void enqueue(T val)
    {
        if(this.isFull())
        {
            System.out.println("Queue is full");
        }
        else
        {
            tail++;
            arr[tail]=val;
        }
    }
    public T dequeue()
    {
        if(this.isEmpty())
        {
            System.out.println("Queue is empthy");
            return null;
        }
        else
        {
            T val=arr[head];
            // In movearray method O(n) time complexity used so we use other method to move head (but arr shirnk 
            // tgis method
             head++;
            //movearray();
            return val;
        }
    }
    public void movearray()
    {
        for (int i = 0; i < tail; i++) 
        {
            arr[i]=arr[i+1];
        }
        tail--;
    }
    public int size()
    {
        return tail+1;
    }
    public T front()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return null;
        }
        else
        {
            return arr[head];
        }
    }
   
    
}
