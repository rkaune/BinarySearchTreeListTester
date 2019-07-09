/*
 * BinarySearchTreeList.java
 *
 * Richard Kaune T00641439
 * COMP 2231_SW2 Assignment 4 Question 2
 * This is a linked implementation of a balanced tree using the brute
 * force method.(inorder traversal with binary partitioning)
*/

package jsjf;

import java.util.Iterator;

/**
 * BinarySearchTreeList represents an ordered list implemented using a binary
 * search tree.
 * 
 * @author Java Foundations
 * @version 4.0
 */
public class BinarySearchTreeList<T> extends LinkedBinarySearchTree<T> 
implements ListADT<T>, OrderedListADT<T>, Iterable<T>
{
        private int data;
	private BinarySearchTreeList left;
	private BinarySearchTreeList right;
        
	/**
	 * Creates an empty BinarySearchTreeList.
	 */
	public BinarySearchTreeList() 
	{
		super();
	}
        
        /**
         * Parameterized constructor
         * @param data 
         */
        public BinarySearchTreeList(int data) {
		super();
		this.data = data;
	}

	/**
	 * Adds the given element to this list.
	 * 
	 * @param element the element to be added to the list
	 */
	public void add(T element)
	{
		addElement(element);
	}

	/**
	 * Removes and returns the first element from this list.
	 *
	 * @return the first element in the list
	 */
	public T removeFirst()
	{
		return removeMin();
	}

	/**
	 * Removes and returns the last element from this list.
	 *
	 * @return the last element from the list
	 */
	public T removeLast()
	{
		return removeMax();
	}

	/**
	 * Removes and returns the specified element from this list.
	 *
	 * @param element the element being sought in the list
	 * @return the element from the list that matches the target
	 */
	public T remove(T element)
	{
		return removeElement(element);
	}

	/**
	 * Returns a reference to the first element on this list.
	 *
	 * @return a reference to the first element in the list
	 */
	public T first()
	{
		return findMin();
	}

	/**
	 * Returns a reference to the last element on this list.
	 *
	 * @return a reference to the last element in the list
	 */
	public T last()
	{
		return findMax();
	}

	/**
	 * Returns an iterator for the list.
	 *
	 * @return an iterator over the elements in the list
	 */
	public Iterator<T> iterator()
	{
		return iteratorInOrder();
	}
        
        /**
         * Sets the left subtree to the value
         * @param left 
         */
        public void setLeft(BinarySearchTreeList left) {
		this.left = left;
	}
        
        /**
         * Sets the right subtree to the value
         * @param right 
         */
        public void setRight(BinarySearchTreeList right) {
		this.right = right;
	}
        
        /**
        * Returns the left subtree root
        * @return 
        */
        public BinarySearchTreeList getLeft() {
		return left;
	}
        
        /**
        * Returns the right subtree root
        * @return 
        */
        public BinarySearchTreeList getRight() {
		return right;
	}
        
        /**
         * Gets the in data from the array
         * @return 
         */
        public int getData() {
		return data;
	}
        
        /**
         * Creates recursively BSTL binary partition within the array
         * @param array
         * @param start
         * @param end
         * @return BinarySearchTreeList of the balanced tree
         */
        public  BinarySearchTreeList createBST(int[] array, int start, int end) {
		
		if(array == null || array.length == 0 || start > end) {
			return null;
		}
		
                // build balanced tree recursively
		int mid = (start + end)/2;
		BinarySearchTreeList root = new BinarySearchTreeList(array[mid]);
		
		root.setLeft(createBST(array, start, mid-1));
		root.setRight(createBST(array, mid+1, end));
		
		return root;
	}
}

