/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rao.ds_trees;


/**
 *
 * @author rajeshp
 * 
 * Binary Tree Node class
 * 
 */
public class BNode<T> {
    
   private T data;
   private BNode<T> left;
   private BNode<T> right;

    public BNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BNode<T> getLeft() {
        return left;
    }

    public void setLeft(BNode<T> left) {
        this.left = left;
    }

    public BNode<T> getRight() {
        return right;
    }

    public void setRight(BNode<T> right) {
        this.right = right;
    }
    
    
    
    
    
}
