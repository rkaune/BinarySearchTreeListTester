/*
 * BinarySearchTreeListTester.java
 *
 * Richard Kaune T00641439
 * COMP 2231_SW2 Assignment 4 Question 2
 * This is the client code for a linked implementation of a balance tree 
 * method using the brute force method.
*/

package jsjf;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author richardkaune
 */
public class BinarySearchTreeListTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // instantiate a BSTL to place the sorted array into
        BinarySearchTreeList treeRoot = new BinarySearchTreeList();
        
        // the sorted array
        int array[] = { 10,20,30,40,50,60,70,80,90,100 };
        
        // the brute force method of constructing a BSTL from the partition
        treeRoot = treeRoot.createBST(array, 0, array.length-1);
        
        // inorder traversal of BSTL
        System.out.println("The elements in the binary tree in order are: ");
        
        // this is not working...
        Iterator<Integer> itr = treeRoot.iteratorInOrder();
        while(itr.hasNext())
            System.out.print(itr.next()+ "*");
        System.out.println();   
        
        // static inorder traversal without Iterator.
        inorder(treeRoot);
        System.out.println(); 
    }
    
    /**
     * Static implemented inorder traversal.
     * @param root 
     */
    public static void inorder(BinarySearchTreeList root) 
    {
        if(root == null) {
                return;
        }
        inorder(root.getLeft());
        System.out.print(root.getData() + " ");
        inorder(root.getRight());
    }  
    
    /**
     * Returns the left subtree root
     * @return 
     */
    private BinarySearchTreeListTester getLeft() 
    {
        return this.getLeft();
    }
    
    /**
     * Returns the right subtree root
     * @return 
     */
    private BinarySearchTreeListTester getRight() 
    {
        return this.getRight();
    }
    
    
    private String getData() 
    {
        return this.getData();
    }

    
}