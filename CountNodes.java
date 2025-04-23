import java.util.List;
import java.util.ArrayList;

class TreeNode {
    int data;
    List<TreeNode> children;

    public TreeNode(int value) {
        data = value;
        children = new ArrayList<>();
    }

    public void addChild(TreeNode child) {
        children.add(child);
    }
}

public class GeneralTree {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int count = 1;
        for (TreeNode child : root.children) {
            count += countNodes(child);
        }
        return count;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        
        root.addChild(node2);
        root.addChild(node3);
        node2.addChild(node4);
        node2.addChild(node5);

        GeneralTree tree = new GeneralTree();
        System.out.println("Number of nodes in the tree: " + tree.countNodes(root));
    }
}