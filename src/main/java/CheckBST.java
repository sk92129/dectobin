/**
 * https://www.hackerrank.com/challenges/ctci-is-binary-search-tree/problem
 */


public class CheckBST {

    public static void main (String [] args) {
        CheckBST client = new CheckBST();


        System.out.println(client.checkBST(client.getTest2()));
    }

    Node getTest1() {

        Node root = new Node();
        root.data = 4;
        Node left = new Node();
        left.data = 2;
        Node leftleft = new Node();
        leftleft.data = 1;
        Node leftright = new Node();
        leftright.data = 3;
        left.left = leftleft;
        left.right = leftright;


        root.left = left;
        Node right = new Node();
        right.data = 6;




        root.right = right;


        Node rightleft = new Node();
        rightleft.data = 5;
        Node rightright = new Node();
        rightright.data = 7;
        right.left = rightleft;
        right.right = rightright;

        return root;
    }


    Node getTest2() {

        Node root = new Node();
        root.data = 3;
        Node left = new Node();
        left.data = 2;
        Node leftleft = new Node();
        leftleft.data = 1;
        Node leftright = new Node();
        leftright.data = 4;
        left.left = leftleft;
        left.right = leftright;


        root.left = left;
        Node right = new Node();
        right.data = 6;




        root.right = right;


        Node rightleft = new Node();
        rightleft.data = 5;
        Node rightright = new Node();
        rightright.data = 7;
        right.left = rightleft;
        right.right = rightright;

        return root;
    }


    class MinMax {
        int min;
        int max;
        boolean check;
    }

    boolean checkBST(Node root) {
        MinMax here = checkNode(root);
        return here.check;
    }

    MinMax checkNode(Node node ) {
        if (node.left == null && node.right == null){
            MinMax minmax = new MinMax();
            minmax.min = node.data;
            minmax.max = node.data;
            minmax.check = true;
            return minmax;
        } else if (node.right != null && node.left != null){
            MinMax left = checkNode(node.left);
            MinMax right = checkNode(node.right);
            MinMax here = new MinMax();
            here.check = left.max < node.data && node.data < right.min;
            here.min = left.min;
            here.max = right.max;
            return here;


        } else if (node.right == null){
            MinMax left = checkNode(node.left);
            MinMax here = new MinMax();
            here.check = left.max < node.data;
            here.min = left.min;
            here.max = node.data;
            return here;
        } else {
            MinMax right = checkNode(node.right);
            MinMax here = new MinMax();
            here.check =  node.data < right.min;
            here.max = right.max;
            here.min = node.data;


            return here;
        }
    }
}
