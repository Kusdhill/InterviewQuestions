public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        helper(root);
        return(root);
    }
    
    public void helper(TreeNode root){
        
        if(root.left==null && root.right==null){
            System.out.println("both null");
            return;
        }
        
        if(root.left!=null && root.right!=null){
            System.out.println("both not null");
            swapSubTrees(root);
            helper(root.right);
            helper(root.left);
            return;
        }
        
        if(root.left!=null && root.right==null){
            System.out.println("left not null");
            swapSubTrees(root);
            helper(root.right);
            return;
        }
        
        if(root.left==null && root.right!=null){
            System.out.println("right not null");
            swapSubTrees(root);
            helper(root.left);
            return;
        }
        
        
    }
    
    public void swapSubTrees(TreeNode root){
        
        if(root.left==null){
            root.left = root.right;
            root.right = null;
        }
        
        else if(root.right==null){
            System.out.println("swap right null");
            root.right = root.left;
            root.left = null;
        }else{
            TreeNode temp = new TreeNode();
            temp = root.left;
            root.left = root.right;
            root.right = temp;             
        }   
    }
}