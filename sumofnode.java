public class Main {
    public static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int val) {
            data = val;
            left = right = null;
        }
    }
    public static int totalSum(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return root.data;
        return root.data+totalSum(root.left)+totalSum(root.right);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        root.left.left=new TreeNode(40);
        root.left.right=new TreeNode(50);
        System.out.println("Sum is: "+totalSum(root));
    }
}
