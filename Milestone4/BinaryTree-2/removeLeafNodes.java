public static BinaryTreeNode<Integer> removeLeafNode(BinaryTreeNode<Integer> root){
        if(root == null)
            return null;
        if(root.left == null && root.right == null)
            return null;
        root.left = removeLeafNode(root.left);
        root.right = removeLeafNode(root.right);
        return root;
    }
