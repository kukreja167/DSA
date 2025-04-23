public class Main(){
    static class TreeNode {
        int data ;
        TreeNode left ,right ;
        TreeNode (int val){
            data = val ; 
            left = right = null ; 

        }
        public static void printLevel(TreeNode root ,int k )
        {
            if(root == null) return  ;
            if(k==1) {
                System.out.println(root.data + " "); 
            } else {
                printLevel(root.left , k -1); 
                printLevel(root.right, k-1) ;
            }
        }
    }
}