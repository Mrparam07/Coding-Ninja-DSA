   public static int noOfNodes(BinaryTreeNode<Integer> root){

        if(root == null)
            return 0;
        int leftSide = noOfNodes(root.left);
        int rightSide = noOfNodes(root.right);
        return 1 + leftSide + rightSide;
    }
