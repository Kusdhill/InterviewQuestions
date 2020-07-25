import java.util.Queue;
import java.util.LinkedList;

class PlayWithTrees{

	public static void inOrderTraversal(TreeNode node){
		if(node == null) return;

		inOrderTraversal(node.left);
		System.out.println(node.value);
		inOrderTraversal(node.right);
	}

	public static void preOrderTraversal(TreeNode node){
		if(node == null) return;

		System.out.println(node.value);
		inOrderTraversal(node.left);
		inOrderTraversal(node.right);
	}

	public static void postOrderTraversal(TreeNode node){
		if(node == null) return;

		inOrderTraversal(node.left);
		inOrderTraversal(node.right);
		System.out.println(node.value);

	}

	public static void depthFirstTraversal(TreeNode root){
		System.out.println("in order:");
		inOrderTraversal(root);
		System.out.println("pre order:");
		preOrderTraversal(root);
		System.out.println("post order:");
		postOrderTraversal(root);
	}


	public static void breadthFirstTraversal(TreeNode node){
		Queue<TreeNode> q = new LinkedList<>();
		if(node!=null){
			q.add(node);
		}

		while(q.size()>0){
			TreeNode curNode = q.remove();
			System.out.println(curNode.value);
			if(curNode.left!=null){
				q.add(curNode.left);
			}

			if(curNode.right!=null){
				q.add(curNode.right);
			}
		}
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

		System.out.println("Depth first traversal");
		depthFirstTraversal(root);
		System.out.println("Breadth first traversal");
		breadthFirstTraversal(root);

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