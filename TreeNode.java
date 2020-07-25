class TreeNode{
	int value;
	TreeNode left;
	TreeNode right;

	TreeNode(int value){
		this.value = value;
	}

	public TreeNode insertLeft(int left_value){
		this.left = new TreeNode(left_value);
		return this.left;
	}

	public TreeNode insertRight(int right_value){
		this.right = new TreeNode(right_value);
		return this.right;
	}
}