package Easy;

import sharedClasses.TreeNode;

public class Search_in_a_Binary_Search_Tree_700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        if(root.val<val)
            return searchBST(root.right,val);
        else if(root.val>val)
            return searchBST(root.left,val);

        else
            return root;
    }
}
