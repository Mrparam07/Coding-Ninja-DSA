    public static int noOfLeafNodes(BinaryTreeNode<Integer> root){

        if(root == null)
            return 0;
        if(root.left==null && root.right==null)
            return 1;
        return noOfLeafNodes(root.left) + noOfLeafNodes(root.right);

    }
