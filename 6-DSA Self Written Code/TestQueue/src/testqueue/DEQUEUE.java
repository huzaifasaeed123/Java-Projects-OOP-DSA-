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
public class DEQUEUE <T>
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
    public void enqueueAtTail(T val)
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
    public void enqueueAtHead(T val)
    {
        if(this.isFull())
        {
            System.out.println("Queue is full");
        }
        else
        {
            moveBack();
            arr[head]=val;
        }
    }
    public T dequeueAtHead()
    {
        if(this.isEmpty())
        {
            System.out.println("Queue is empthy");
            return null;
        }
        else
        {
            T val=arr[head];
            moveForwad();
            return val;
        }
    }
    public T dequeueAtTail()
    {
        if(this.isEmpty())
        {
            System.out.println("Queue is empthy");
            return null;
        }
        else
        {
            T val=arr[tail];
            tail--; 
            return val;
        }
    }
    public void moveForwad()
    {
        for (int i = 0; i < tail; i++) 
        {
            arr[i]=arr[i+1];
        }
        tail--;
    }
    public void moveBack()
    {
        for (int i = tail; i >= 0; i--) 
        {
            
            arr[i+1]=arr[i];
        }
        tail++;
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
