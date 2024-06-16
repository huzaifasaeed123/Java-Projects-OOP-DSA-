
package mystacktest;

import java.util.ArrayList;

public class MyStack<DT> 
{
    
   DT []arrlist=(DT[])new Object[5];
    int top=-1;
    
    public boolean isFull()
    {
        if(top>=arrlist.length-1)
        {
            return true;
        }
        else
            return false;
    }
    public boolean isEmpty()
    {
        if(top<=-1)
        {
            return true;
        }
        else
            return false;
    }
    public void push(DT a)
    {
        if(isFull())
        {
            System.out.println("StackOverflow");
        }
        else
        {
            top++;
        arrlist[top]=a;
        
        }
    }
    public DT pop()
    {
        if(isEmpty())
        {
            System.out.println("Underflow");
            return null;
        }
        else
        {
            DT a=arrlist[top];
            top--;
            return a;
        }
    }
    public DT peek()
    {
        if(isEmpty())
        {
            return null;
        }
        else
        return arrlist[top];
        
    }
    public int size()
    {
        return top+1;
               
    }
}
