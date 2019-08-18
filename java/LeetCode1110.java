class LeetCode1110{
	public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
		List<TreeNode> result = new LinkedList<TreeNode>(); 
		TreeNode cur = root ;
		TreeNode pre = root; 
		for(int i = 0 ;i<to_delete.length;i++){
				int val = to_delete[i];
				while(cur.val!=val){
					root = root.left; 
				}
				
		}
		return result; 
    }
	public void deleteNode(TreeNode node, int val,List<TreeNode> tlist){
	
	}
	public static void main(String[] args){
		
	}
}