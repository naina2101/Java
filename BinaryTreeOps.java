public class BinaryTreeOps {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class  BinaryTree{
        static int idx = -1;
        public static Node buildTree(int Node[]){
            idx++;
            if(Node[idx] == -1)
                return null;
            
            Node newNode = new Node(Node[idx]);
            newNode.left = buildTree(Node);
            newNode.right = buildTree(Node);
            return newNode;
        }
    }

    //Count of nodes
    public static int countOfNodes(Node root){
        if(root == null)
            return 0;
        
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        return leftNodes + rightNodes + 1;
    }

    //Sum of nodes
    public static int sumOfNodes(Node root){
        if(root == null)
            return 0;
        
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }

    //Height of tree
    public static int height(Node root){
        if(root == null)
            return 0;
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int myHeight = Math.max(leftHeight, rightHeight)+ 1;
        return myHeight;
    }

    //Diameter of tree- Approach 1 : Time complexity = O(n^2)
    public static int diameter(Node root){
        if(root == null)
            return 0;
        
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left)+height(root.right)+1;
        return Math.max(diam3,Math.max(diam1,diam2));
    }

    //Approach 2 : Time Complexity = O(n)
    static class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int ht, int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter2(Node root){
        if(root == null)
            return new TreeInfo(0, 0);
        
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht,right.ht)+1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int myDiam = Math.max(Math.max(diam1,diam2), diam3);
        
        TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
        return myInfo;
    }

    //Subtree of another tree
    public static boolean isIdentical(Node root, Node subRoot){
        if(root == null && subRoot == null)
            return true;
        if(root == null || subRoot == null)
            return false;
        if(root.data == subRoot.data)
            return isIdentical(root.left, subRoot) || isIdentical(root.right, subRoot);
        return false;
    }
    public static boolean isSubtree(Node root, Node subRoot){
        if(subRoot == null)
            return true;
        if(root == null)
            return false;
        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot))
                return true;
        
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
    }
    public static void main(String[] args) {
        int[] Node = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(Node);
        System.out.println("count of nodes: " + countOfNodes(root));
        System.out.println("Sum of nodes: " + sumOfNodes(root));
        System.out.println("Height of tree: " + height(root));
        System.out.println("Diameter of tree: "+ diameter2(root).diam);
        int[] SubtreeNodes = {2, 4, -1, -1, 5, -1, -1};
        Node subRoot = tree.buildTree(SubtreeNodes);
        System.out.println(isSubtree(root, subRoot));
    }
}
