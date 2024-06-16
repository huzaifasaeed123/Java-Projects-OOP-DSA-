

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
public class PriorityQueue<T> 
{
    CircularQueue<T> q1=new CircularQueue<>();
    CircularQueue<T> q2=new CircularQueue<>();
    CircularQueue<T> q3=new CircularQueue<>();
    
    public void enqueue(T val,int p)
    {
        if(p==2)
        {
            if(!q3.isFull())
            {
                q3.enqueue(val);
            }
            else if(!q2.isFull())
            {
                q2.enqueue(val);
            }
            else
                q1.enqueue(val);
            
        }
        else if(p==1)
            if(!q2.isFull())
            q2.enqueue(val);
            else
                q1.enqueue(val);
       else
            q1.enqueue(val);
        
    }
    public T dequeue()
    {
        if(!q3.isEmpty())
            return q3.dequeue();
        else if(!q2.isEmpty())
            return q2.dequeue();
        else
          return   q1.dequeue();
    }
    
}
