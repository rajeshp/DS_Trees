/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_trees;

import com.rao.ds_trees.BNode;
import com.rao.ds_trees.BTree;

/**
 *
 * @author rajeshp
 */
public class DS_Trees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arr[] = new int[]{5,6,7,9,12,100,10};
        
        BTree btree = new BTree();
        
        
        BNode b1 = new BNode(5);
        
        BNode b2 = new BNode(6);
        
        BNode b3 = new BNode(7);
        
        BNode b4 = new BNode(7);
        
        BNode b5 = new BNode(9);
        BNode b6 = new BNode(12);
        BNode b7 = new BNode(100);
        BNode b8 = new BNode(10);
        
        btree.setRoot(b1);
        b1.setLeft(b2);
        b1.setRight(b3);
        
        b2.setLeft(b4);
        b2.setRight(b5);
        
        b3.setLeft(b6);
        b3.setRight(b7);
        
        b4.setLeft(b8);
        
        System.out.println("Tree created..");
        
        
    }
}
