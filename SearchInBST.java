/*Given the root node of a binary search tree (BST) and a value. You need to find the node in the BST that the node's
value equals the given value. Return the subtree rooted with that node. If such node doesn't exist, you should return NULL.*/

public class SearchInBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	 }
	 
	    public TreeNode searchBST(TreeNode root, int val) {

	    	if (root == null || root.val == val)
	    		return root;
	    	
	    	if (root.val > val)
	    		return searchBST(root.left, val);
	    	
	    	return searchBST(root.right, val);
	        
	    }

}
