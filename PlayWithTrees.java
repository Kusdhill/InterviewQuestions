class PlayWithTrees{

	public static void inOrderTraversal(TreeNode node){
		if(node == null) return;

		inOrderTraversal(node.left);
		System.out.println(node.value);
		inOrderTraversal(node.right);
	}

	public static void main(String[] args){
		TreeNode root = new TreeNode(8);
		TreeNode left = root.insertLeft(3);
		left.insertLeft(1);
		TreeNode right = left.insertRight(6);
		right.insertLeft(4);
		right.insertRight(7);

		right = root.insertRight(10);
		right = right.insertRight(14);
		right.insertLeft(13);

		inOrderTraversal(root);

		/*
						8
					   / \
					  3   10
					 / \ 	 \
					1	6	  14
					   / \	  /
					  4   7  13
		*/
	}
}