/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rao.ds_trees;

/**
 *
 * @author rajeshp
 * 
 * Binary Tree Implementation
 * 
 */
public class BTree<T> {
    
    BNode<T> root;

    public BTree()
    {
        
    }
    
    public BTree(BNode<T> root) {
        this.root = root;
    }
    
    public BTree(T rootData) {
        //this.root = new BNode<T>();
        //root.setData(rootData);
    }

    public BNode<T> getRoot() {
        return root;
    }

    public void setRoot(BNode<T> root) {
        this.root = root;
    }
    
    
    
}
