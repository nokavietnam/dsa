class TreeNode {
  int val;
  TreeNode left, right;

  TreeNode(int val) {
    this.val = val;
  }
}

public class BSTExample {
  TreeNode insert(TreeNode root, int val) {
    if (root == null) {
      return new TreeNode(val);
    }
    if (val < root.val) {
      root.left = insert(root.left, val);
    } else {
      root.right = insert(root.right, val);
    }
    return root;
  }
}
