import java.util.*;

public class LCA_238 {

  public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
  }

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root.val == p.val || root.val==q.val)
        {
            return root;
        }
        TreeNode foundLeftNode = lowestCommonAncestor(root.left,p,q);
        TreeNode foundRightNode = lowestCommonAncestor(root.right,p,q);
        if(foundRightNode == null)
        {
            return foundLeftNode;
        }
        if(foundLeftNode == null)
        {
            return foundRightNode;
        }
        return root;
    }
}
}
