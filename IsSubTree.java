class IsSubTree {
    public static boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null) return false;        
        if(isSame(s, t)) return true;
        
        return isSubtree(s.left, t) || isSubtree(s.right,t);
        
    }
    
    public static boolean isSame(TreeNode s, TreeNode t){
        if(s==null && t==null) return true;
        if(s==null || t==null) return false;
        
        if(s.value==t.value){
            return isSame(s.left, t.left) && isSame(s.right, t.right);
        }else{
            return false;
        }
    }
    
    public static void main(String[] args){
        TreeNode s = new TreeNode(3);
        TreeNode left = s.insertLeft(4);
        left.insertLeft(1);
        left.insertRight(2);
        s.insertRight(5);


        /*
             3
            / \
           4   5
          / \
         1   2
        */

        TreeNode t = new TreeNode(4);
        t.insertLeft(1);
        t.insertRight(2);

        /*
           4 
          / \
         1   2
        */

         System.out.println(isSubtree(s, t));
    }
}