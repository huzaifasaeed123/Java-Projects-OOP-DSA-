/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbinarysearchtree;

/**
 *
 * @author fa21-bcs-017
 */
public class BinarySearchTree {
    Node root;
    public void addNew(int data,Node parent)
    {
        
        if(root==null)
        {
            Node newNode=new Node(data);
            root=parent=newNode;
        }
        else
        {
            if(data>parent.data && parent.right==null)
            {
                Node newNode=new Node(data);
                parent.right=newNode;
            }
            else if(data<parent.data && parent.left==null)
            {
                Node newNode=new Node(data);
                parent.left=newNode;
            }
            else
            {
                if(parent!=null)
                {
                    if(data>parent.data)
                    addNew(data,parent.right);
                    else
                    addNew(data,parent.left);
                }
            }
        }
    }
    public void deleteNode(Node parent,int key)
    {
        if(parent.left.data==key)
        {
            if(parent.left.left==null && parent.left.right==null)
            {
                parent.left=null;
            }
            else if(parent.left.right==null)
            {
                parent.left=parent.left.left;
            }
            else if(parent.left.left==null)
            {
                parent.left=parent.left.right;
            }
            else
            {
                Node temp=parent.left.right;
                Node prev=temp;
                int count=0;
                while(temp.left!=null)
                {
                    count++;
                    prev=temp;
                    temp=temp.left;
                }
                int temp1;
                    temp1=parent.left.data;
                    parent.left.data=temp.data;
                    temp.data=temp1;
                    if(count==0)
                        deleteNode(parent.left, key);
                    else
                    deleteNode(prev, key);
            }
        }
        else if(parent.right.data==key)
        {
            if(parent.right.left==null && parent.right.right==null)
            {
                parent.right=null;
            }
            else if(parent.right.right==null)
            {
                parent.right=parent.right.left;
            }
            else if(parent.right.left==null)
            {
                parent.right=parent.right.right;
            }
            else
            {
                Node temp=parent.right.right;
                Node prev=temp;
                int count=0;
                while(temp.left!=null)
                {
                    count++;
                    System.out.println("loop run");
                    prev=temp;
                    temp=temp.left;
                }
                int temp1;
                    temp1=parent.right.data;
                    parent.right.data=temp.data;
                    temp.data=temp1;
                    if(count==0)
                        deleteNode(parent.right, key);
                    else
                    deleteNode(prev, key);
                    
            }
        }
    }
    public Node search(Node parent,int key)
    {
        if(parent.left.data==key || parent.right.data==key || parent==null)
        {
            return parent;
        }
        else if(key>=parent.data)
        {
            return search(parent.right, key);
        }
        else 
        {
            return search(parent.left, key);
        }
       
        
    }
    public void preorder(Node parent)
    {
        if(parent!=null)
        {
            System.out.println(parent.data);
            preorder(parent.left);
            preorder(parent.right);
        }
    }
}
