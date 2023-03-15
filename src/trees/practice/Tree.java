package trees.practice;
public class Tree {
    //initialize root node from node class;
    Node root = null;
    private Tree(){
        root = null;
    }
    //create a node class with  3 properties value , right and left child.
    private  class Node{
        int val;
        Node right;
        Node left;
        //constructor to initialize a node with no children.
        private Node(int value){
            this.val = value;
            left = null;
            right = null;
        }
    }
    private void  insert(int value){
        root = insert(root,value);
    }
    private Node insert(Node node,int value){
        if(node == null)
            node = new Node(value);
        else if (value < node.val )
            node.left = insert(node.left,value);
        else if(value> node.val)
            node.right = insert(node.right,value);
        return node;
    }


}
