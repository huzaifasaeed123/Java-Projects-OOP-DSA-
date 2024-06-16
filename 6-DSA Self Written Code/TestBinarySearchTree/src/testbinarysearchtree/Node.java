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
public class Node {
    Node left,right;
    int data;
    public Node(int n)
    {
        this.data=n;
        left=right=null;
    }
}
