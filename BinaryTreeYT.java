import java.util.*;

import javax.swing.tree.TreeNode;

public class BinaryTreeYT {
    static class  Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    //PreOrder Traversal - O(N)
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //InOrder Traversal - O(N)
    public static void InOrder(Node root){
        if(root == null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);
    }

    //PostOrder Traversal - O(N)
    public static void PostOrder(Node root){
        if(root == null){
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data+" ");
    }

    //LevelOrder Traversal - O(N)
    public static void LevelOrder(Node root){
        if(root == null){
            return;
        }
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node curr = q.remove();
            if(curr == null){
                System.out.println();
                
                //queue empty
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(curr.data+" ");

                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
    }

    //Count of Nodes of Tree - O(N)    
    public static int countOfNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    //Sum Of Nodes of Tree - O(N)
    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    //Hieght of a Tree - O(N)
    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int leftHeight = height(root.left);
        int righHeight = height(root.right);

        return Math.max(leftHeight, righHeight) + 1;
    }

    //Diameter of a Tree - O (N^2)  -->  [Approach 1]
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right) +1;

        return Math.max(diam3, Math.max(diam1, diam2));
    }

    //Diameter of a Tree - O(N)  --> [Approach 2]
    static class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int ht, int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter2(Node root){
        if(root == null){
            return new TreeInfo(0, 0);
        }

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht, right.ht)  + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int mydiam = Math.max(diam3, Math.max(diam1, diam2));

        return new TreeInfo(myHeight, mydiam);
    }

    

    public boolean isIdentical(TreeNode root, TreeNode SubRoot){
        if(SubRoot == null && root == null){
            return true;
        }
        if(root == null || SubRoot == null){
            return false;
        }

        if(!isIdentical(root.left, SubRoot.left)){
            return false;
        }
        if(!isIdentical(root.right, SubRoot.right)){
            return false;
        }
        return true;

    }

    public boolean isSubtree(TreeNode root, TreeNode SubRoot){
        if(SubRoot == null){
            return true;
        }
        if(root == null){
            return false;
        }

        if(isIdentical(root, SubRoot)){
            return true;
        }
        return isSubtree(root.left, SubRoot.left) || isSubtree(root.right, SubRoot.right);
    }
    

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        //preOrder(root);
        //InOrder(root);
        //PostOrder(root);
        //LevelOrder(root);
        //System.out.println(countOfNodes(root));
        //System.out.println(sumOfNodes(root));
        //System.out.println(height(root));
        //System.out.println(diameter(root));
        System.out.println(diameter2(root).diam);
    }
}
