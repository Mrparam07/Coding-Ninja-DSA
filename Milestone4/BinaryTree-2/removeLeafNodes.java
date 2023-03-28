public static BinaryTreeNode<Integer> removeLeafNode(BinaryTreeNode<Integer> root){
        if(root == null)
            return null;
        if(root.left == null && root.right == null)
            return null;
        removeLeafNode(root.left);
        removeLeafNode(root.right);
        return root;
    }
