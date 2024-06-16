
package testbinary;

public class LinkedListAVL {
     class Node
    {
        int data,height;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            height = 1;
        }
        
    }
     Node root;
     public void insert(int data)
     {
         root = insertAVL(root,data);
     }
     private Node insertAVL(Node root,int key)
     {
         if(root == null)
         {
             return new Node(key);
         }
         if(key<root.data)
         {
             root.left = insertAVL(root.left,key);
         }
         //(key >= root.data)
         else
         {
             root.right = insertAVL(root.right,key);
         }
         
         //update root height
         root.height = 1 + Math.max(height(root.left), height(root.right));
         
         //get root balance factor
         int bf = getBalance(root);
         
         //left left case 
         if(bf > 1 && key < root.left.data)
             return rightRotate(root);
         //Right Right Case
         if(bf<-1 && key > root.right.data)
             return leftRotate(root);
         //Left Right Case
          if(bf>1 && key > root.left.data)
          {
              root.left = leftRotate(root.left);
              return rightRotate(root);
          }
          //Right left Case
          if(bf < -1 && key < root.right.data)
          {
              root.right = rightRotate(root.right);
              return leftRotate(root);
          }
          
          return root;
          
         
     }
     //rotate left subtree rooted with x
     private Node leftRotate(Node x)
     {
         Node y = x.right;
         Node T2 = y.left;
         
         //perform rotation
         y.left = x;
         x.right = T2;
         
         //Update heights
         x.height = Math.max(height(x.left), height(x.right) + 1);
         y.height = Math.max(height(y.left), height(y.right) + 1);
         
         //return new root
         return y;
     }
     //rotate right subtree rooted with y
     private Node rightRotate(Node y)
     {
         Node x = y.left;
         Node T2 = x.right;
         
         //perform rotation
         x.right = y;
         y.left = T2;
         
         //Update heights
         y.height = Math.max(height(y.left), height(y.right) + 1);
         x.height = Math.max(height(x.left), height(x.right) + 1);
         
         //return new root
         return x;
         
         
     }
    public void delete(int data) {
        root = Delete(root, data);
    }


    
    public Node Delete(Node root,int value)
    {
        if(root.data<value)
        {
            root.right = Delete(root.right,value);
        }
        else if(root.data > value)
        {
            root.left = Delete(root.left,value);
        }
        else
        {
            //case 1 - leaf node
            if(root.left == null && root.right == null)
            {
                return null;
            }
            //case-2 single child
            if(root.left == null)
            {
                return root.right;
            }
            else if(root.right == null)
            {
                return root.left;
            }
            //case-3 both children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = Delete(root.right,IS.data);
        }
        if (root == null)
             return root;

        
              //update root height
         root.height = 1 + Math.max(height(root.left), height(root.right));
         
         //get root balance factor
         int bf = getBalance(root);
         
         //left left case 
         if(bf > 1 && value < root.left.data)
             return rightRotate(root);
         //Right Right Case
         if(bf<-1 && value > root.right.data)
             return leftRotate(root);
         //Left Right Case
          if(bf>1 && value > root.left.data)
          {
              root.left = leftRotate(root.left);
              return rightRotate(root);
          }
          //Right left Case
          if(bf < -1 && value < root.right.data)
          {
              root.right = rightRotate(root.right);
              return leftRotate(root);
          }
          
          return root;
        
    }
     private Node findInorderSuccessor(Node root)
    {
        while(root.left != null)
        {
            root = root.left;
        }
        return root;
    }

     private int height(Node root)
     {
         if(root == null)
         {
             return 0;
         }
         return root.height;
     }
     
     private int getBalance(Node root)
     {
         if(root == null)
         {
             return 0;
         }
         
         return height(root.left) - height(root.right);
     }    
     
}