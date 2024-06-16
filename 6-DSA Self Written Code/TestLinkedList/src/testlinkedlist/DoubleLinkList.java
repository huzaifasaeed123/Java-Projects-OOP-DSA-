/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testlinkedlist;

/**
 *
 * @author saeed
 */
public class DoubleLinkList 
{
    public static DoubleNode head;
    public static DoubleNode tail;
    public static int size=0;
    
    public void addFirst(int data)
    {
        DoubleNode newNode=new DoubleNode(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
        }
        else
        {
            newNode.next=head;
            head.prev=newNode; 
            head=newNode;
            //Circular Double Link List
            //tail.next=head;
            //head.prev=tail;
        }
    }
    public void addLast(int data)
    {
        DoubleNode newNode=new DoubleNode(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
        }
        else
        {
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
            //Circular Double Link List
            //tail.next=head;
            // head.prev=tail;
        }
    }
    public int removeFirst()
    {
        if(head==null)
        {
            System.out.println("Empty");
            return 0;
        }
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        else
        {
            int val=head.data;
            head=head.next;
            head.prev=null;
            size--;
            return val;
        }
    }
    public int removeLast()
    {
        if(head==null)
        {
            System.out.println("Empty");
            return 0;
        }
        else if (size == 1) {
            int val = tail.data;
            head = tail = null;
            size--;
            return val;
        }
        else
        {
            int val=tail.data;
            tail=tail.prev;
            tail.next=null;
            size--;
            return val;
        }
    }
    public void reverseDll()
    {
        DoubleNode current=head;
        tail=head;
        DoubleNode prev=null;
        DoubleNode next;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            current.prev=next;
            
            //update
            prev=current;
            current=next;
        }
        head=prev;
        
    }
    
}
