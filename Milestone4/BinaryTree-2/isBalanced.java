 public static boolean isBalanced(BinaryTreeNode<Integer> root)
    {
        if(root == null)
            return true;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(Math.abs(leftHeight - rightHeight) > 1)
            return false;
        boolean isLeftBalanced = isBalanced(root.left);
        boolean isRightBalanced = isBalanced(root.right);

        return isLeftBalanced && isRightBalanced;
    }
    public static int height(BinaryTreeNode<Integer> root){
        if(root == null)
            return 0;
        int h1 = height(root.left);
        int h2 = height(root.right);

        return 1 + Math.max(h1,h2);
    }
