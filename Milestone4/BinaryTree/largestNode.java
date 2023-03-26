    public static int findLargest(BinaryTreeNode<Integer> root){
        if(root == null)
            return -1;
        int largestLeft = findLargest(root.left);
        int largestRight = findLargest(root.right);
        return Math.max(root.data, Math.max(largestLeft, largestRight));
    }
