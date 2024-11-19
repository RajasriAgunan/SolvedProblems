package trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    TreeNode root;

    public static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        //  preOrder(root.left);
        //  preOrder(root.right);
        inOrder(root.left);
        inOrder(root.right);
    }

    private static int height(TreeNode root) {
        if (root == null){
            return 0;
    }

    int leftHeight = height(root.left);
    int rightHeight = height(root.right);

    return 1+Math.max(leftHeight,rightHeight);

}
    private static void bfs(TreeNode root) {
        if(root==null){
            return;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();//to remove
            System.out.print(node.data+" ");
           if(node.left!=null){
             queue.add(node.left);
             }
           if(node.right!=null){
           queue.add(node.right);
            }
        }
    }

        public static void main(String[] args){
    BinaryTree tree=new BinaryTree();
    tree.root=new TreeNode(1);
    tree.root.left=new TreeNode(2);
    tree.root.right=new TreeNode(3);
    tree.root.left.left=new TreeNode(4);
    tree.root.left.right=new TreeNode(5);
    tree.root.right.left=new TreeNode(6);
    tree.root.right.right=new TreeNode(7);

 //    inOrder(tree.root);

      // System.out.println(height(tree.root));
    bfs(tree.root);

}

}

 class TreeNode{

    int data;
    TreeNode left;
    TreeNode right;

     public TreeNode(int data) {
         this.data=data;

     }
 }