
package testbinarysearchtree;


public class TestBinarySearchTree {

 
    public static void main(String[] args) {
        BinarySearchTree obj=new BinarySearchTree();
        obj.addNew(5,obj.root);
        obj.addNew(9,obj.root);
        obj.addNew(3,obj.root);
        obj.addNew(10,obj.root);
        obj.addNew(2,obj.root);
        obj.addNew(7,obj.root);
        obj.addNew(6,obj.root);
        obj.addNew(4,obj.root);
        obj.addNew(11,obj.root);
        obj.addNew(8,obj.root);
        obj.addNew(1,obj.root);
        obj.addNew(0,obj.root);
        obj.preorder(obj.root);
        obj.deleteNode(obj.search(obj.root, 5), 5);
        System.out.println("After Deletion");
        obj.preorder(obj.root);
    }
    
}
