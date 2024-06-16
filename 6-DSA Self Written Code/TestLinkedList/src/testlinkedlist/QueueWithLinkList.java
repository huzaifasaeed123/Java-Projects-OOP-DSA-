/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testlinkedlist;

/**
 *
 * @author saeed
 */
public class QueueWithLinkList 
{
    private  Node head;
    private  Node tail;
    private int size;
    
    public void enqueue(int val)//enqueue at tail
    {
        Node newNode=new Node(val);
        size++;
        if(head==null)
        {
            head=tail=newNode;
        }
        else
        {
            tail.next=newNode;
            tail=newNode;
        }
    }
    public int dequeue() //dequeue at head
    {
        if(head==null)
        {
            System.out.println("Queue is Empty");
            return 0;
        }
        else if(head.next==null)
        {
            int data=head.data;
            head=tail=null;
            size--;
            return data;
        }
        else
        {
            int data=head.data;
            head=head.next;
            size--;
            return data;
        }
    }
    
}
