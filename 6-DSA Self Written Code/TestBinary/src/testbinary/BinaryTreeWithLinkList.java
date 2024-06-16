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
public class BinaryTreeWithLinkList 
{
    int arr[]={4,6,3,8,6,7,7,4,3};
    Node root;
    int id=1;
    public void ArrayToBinaryTree(Node parent)
    {
        if(root==null)
        {
            Node newNode=new Node(arr[id]);
            id++;
            root=newNode;
        }
        else
        {
            Node newNode=new Node(arr[id]*2);
            
            parent.left=newNode;
        }
    }
    public Node Search(Node parent,int key)
    {
        if(parent==null)
        {
            return null;
        }
        else
        {
            if(parent.data==key)
            {
                return parent;
            }
            else
            {
                Node t;
                t=Search(parent.left,key);
                if(t==null)
                {
                    t=Search(parent.right,key);
                }
                return t;
            }
        }
    }
        
    public void insertAtroot(int data)
    {
        Node newNode=new Node(data);
        root=newNode;
    }
    public void insertleft(Node parent,int data)
    {
        if(parent==null)
        {
            System.out.println("Parent Does Not Exist");
        }
        else
        {
            Node newNode=new Node(data);
            parent.left=newNode;
        }
        
        
    }
    public void insertright(Node parent,int data)
    {
        if(parent==null)
        {
            System.out.println("Parent Does Not Exist");
        }
        else
        {
            Node newNode=new Node(data);
            parent.right=newNode;
        }
        
        
    }
    public void printTree(Node parent)
    {
        if(parent!=null)
        {
            printTree(parent.left);
          //  System.out.println(parent.data);
            printTree(parent.right);
            System.out.println(parent.data);
        }
    }
    
    
}
