public class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;
    public BinaryTreeNode(T data){
        this.data = data;
    }
}

/****************************************************************************************************************************************/



import java.util.Scanner;

public class BinaryTreeUse {

    public static void print(BinaryTreeNode<Integer> root){
        if(root == null)
            return;
        System.out.println(root.data);
        print(root.left);
        print(root.right);
    }
    public static void printDetailed(BinaryTreeNode<Integer> root){
        if(root == null)
            return;
        System.out.print(root.data+"::");
        if(root.left!=null)
            System.out.print(" L"+root.left.data+", ");
        if(root.right!=null)
            System.out.print("R"+root.right.data);

        System.out.println();

        printDetailed(root.left);
        printDetailed(root.right);
    }

    public static BinaryTreeNode<Integer> takeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter root Data");
        int rootData = sc.nextInt();

        if(rootData == -1)
            return null;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild = takeInput();
        BinaryTreeNode<Integer> rightChild = takeInput();

        root.left = leftChild;
        root.right = rightChild;

        return root;
    }
    public static BinaryTreeNode<Integer> takeInputBetter(boolean isRoot, int parentData, boolean isLeft){
        if(isRoot) {
            System.out.println("Enter root data");
        }
        else{
            if(isLeft){
                System.out.println("Enter left child of "+parentData);
            }
            else
                System.out.println("Enter right child of "+parentData);
        }

        Scanner sc=new Scanner(System.in);
        int rootData = sc.nextInt();

        if(rootData == -1)
            return null;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild = takeInputBetter(false, rootData,true);
        BinaryTreeNode<Integer> rightChild = takeInputBetter(false, rootData,false);

        root.left = leftChild;
        root.right = rightChild;

        return root;
    }

    public static void main(String[] args) {
//        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
//        BinaryTreeNode<Integer> leftRoot = new BinaryTreeNode<Integer>(2);
//        BinaryTreeNode<Integer> rightRoot = new BinaryTreeNode<Integer>(3);
//        root.left = leftRoot;
//        root.right = rightRoot;
//
//        BinaryTreeNode<Integer> leftRight = new BinaryTreeNode<>(4);
//        BinaryTreeNode<Integer> rightLeft = new BinaryTreeNode<>(5);
//        leftRoot.right = leftRight;
//        rightRoot.left = rightLeft;

        //print(root);
//        BinaryTreeNode<Integer> root = takeInput();
        BinaryTreeNode<Integer> root = takeInputBetter(true,0,true);
        printDetailed(root);

    }
}
