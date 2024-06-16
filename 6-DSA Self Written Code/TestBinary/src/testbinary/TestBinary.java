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
public class TestBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        BInaryTreeWithArray obj=new BInaryTreeWithArray();
//        obj.insertRootNode(10);
//        obj.insertleft(12, 1);
//        obj.insertright(14, 1);
//        obj.insertleft(9, 2);
//        obj.insertleft(17, 4);
//        obj.insertright(15, 4);
//        obj.printTree();
          BinaryTreeWithLinkList obj=new BinaryTreeWithLinkList();
          obj.insertAtroot(4);
          obj.insertleft(obj.Search(obj.root, 4), 3);
          obj.insertright(obj.Search(obj.root, 3), 5);
          obj.insertleft(obj.Search(obj.root, 3), 7);
          obj.insertleft(obj.Search(obj.root, 7), 9);
          obj.printTree(obj.root);
    }
    
}
