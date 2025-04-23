public class Main {
    public static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int val) {
            data = val;
            left = right = null;
        }
    }
    public static int postOrder(TreeNode root){
        if(root==null) return 0;
      int leftCount = postOrder(root.left);

      int rightCount = postOrder(root.right);

      System.out.print(root.data + " ");

      return 1 + leftCount + rightCount;

  }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        root.left.left=new TreeNode(40);
        root.left.right=new TreeNode(50);
        postOrder(root);
    }
}
