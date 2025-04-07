class TreeNode {
  int val;
  TreeNode left, right;

  TreeNode(int val) {
    this.val = val;
  }
}

public class TreeExample {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
  }
}
