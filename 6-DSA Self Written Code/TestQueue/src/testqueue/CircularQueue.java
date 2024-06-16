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
public class CircularQueue<T>
{
    private int head=0;
    private int tail=-1;
    T[] arr=(T[])new Object[5];
    public boolean isFull()
    {
        if(tail==(arr.length+head)-1)
            return true;
        else
            return false;             
    }
    public boolean isEmpty()
    {
        if(tail<head)
            return true;
        else
            return false;             
    }
    public void enqueue(T val)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
        }
        else
        {
            tail++;
            arr[tail%arr.length]=val;
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
            T val=arr[head%arr.length];
            head++;
            return val;
        }
    }
    
    public int size()
    {
        return (tail-head)+1;
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
            return arr[head%arr.length];
        }
    }
   
    
}
