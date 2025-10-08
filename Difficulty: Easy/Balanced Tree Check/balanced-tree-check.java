/*
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
} */

class Solution {
    public boolean isBalanced(Node root) {
        // code here
        if(root == null)return true;
        return isBalanced(root.left) && isBalanced(root.right) && (Math.abs(h(root.left)-h(root.right)) <= 1);
    }
       int h(Node root){
        if(root==null) return 0;
        return Math.max(h(root.left),h(root.right))+1;
}
}