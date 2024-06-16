
package testlinkedlist;

public class StackWithLinkedList 
{
    public static Node head;
    public static Node tail;
    public static int top=0;
    public void push(int data)// add at Last
    {
        Node newNode=new Node(data);
        top++;
        if(head==null)
        {
            head=tail=newNode;
        }
        else
        {
            tail.next=newNode;
            tail=newNode;
            // Alternate way(Without Tail): by using while loop to access last Node
        }
    }
    public int pop()// pop at last
    {
        if(head==null)
        {
            System.out.print("Stack Is Empty And ");
            return Integer.MIN_VALUE;
        }
        else if(head.next==null)
        {
            int val =head.data;
            head=tail=null;
            top--;
            return val;
        }
        else
        {
            Node temp=head;
            Node prev=null;
            while(temp.next!=null)
            {
                prev=temp;
                temp=temp.next;
            }
            int val=temp.data;
            top--;
            prev.next=null;
            return val;
        }
    }
    public int peak()
    {
        if(head==null)
        {
            System.out.println("Stack Is Empty");
            return Integer.MIN_VALUE;
        }
        else if(head.next==null)
        {
            int val =head.data;
           // head=tail=null;
            return val;
        }
        else
        {
            
            int val=tail.data;
            return val;
        }
    }
    public int size()
    {
        return top;
    }
}
