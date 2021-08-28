package Tree.BTTree;

public class btvn {
    /**
     * MyTree
     */
    public class MyTree {
        public MyTree(int value) {
            this.value = value;
        }
        int value;
        MyTree left;
        MyTree right;
        
        
    }
    // Tìm phần tử trong Tree
    public MyTree findNode(MyTree root,int value){
        if(root==null){
            return null;
        }
        if (value <root.value) {
            return findNode(root.left, value);
        }else if(value>root.value){
            return findNode(root.right, value);
        }else{
            return root;
        }

    }
    // Bài 112
    public boolean duyet(MyTree curNode,int sum,int targetSum){
        if (curNode==null) {
            return false;
        }
        sum+=curNode.value;
        if((curNode.left==null&&curNode.right==null)==true){
            if(sum==targetSum){
                return true;
            }
        }
        boolean kqTrai=duyet(curNode.left, sum, targetSum);
        boolean kqPhai=duyet(curNode.right, sum, targetSum);
        return kqPhai||kqTrai;
    }
    public boolean sumPath(MyTree root,int targetSum){
        return duyet(root, 0, targetSum);
    }
    // Bài 104
    public int maxDepth(MyTree root) {
        if (root==null) return 0;
            
        
        return Math.max(maxDepth(root.left)+1, maxDepth(root.right)+1);
    }
}
