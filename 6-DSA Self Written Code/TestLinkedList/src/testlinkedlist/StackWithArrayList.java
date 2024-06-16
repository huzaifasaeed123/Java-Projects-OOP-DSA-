
package testlinkedlist;

import java.util.ArrayList;

public class StackWithArrayList<T> 
{
    ArrayList<T> arrlist=new ArrayList();
    
    public boolean isEmpty()
    {
        return arrlist.size()==0;
        
    }
    public void push(T val)
    {
        arrlist.add(val);
    }
    public T pop()
    {
        if(isEmpty())
        {
            System.out.println("ArrayList is Empty");
            return null;
        }
        else
        {
            T val=arrlist.get(arrlist.size()-1);
            arrlist.remove(arrlist.size()-1);
            return val;
        }
       
    }
    public T peak()
    {
        if(isEmpty())
        {
            System.out.println("ArrayList is Empty");
            return null;
        }
        else
        {
            T val=arrlist.get(arrlist.size()-1);
            return val;
        }
    }
    public int size()
    {
        return arrlist.size();
    }
    
}
