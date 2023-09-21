import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class BinaryTreeHeight {

    static class Node {
        Node left, right;
        int data;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static void getTraversal(Node root) {
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        queue.offer(root);
        list.add(root.data);
        int height = 0;
        //boolean flag = false;
        while(!queue.isEmpty()) {
            //Node node = queue.poll();
            height= height+1;
            for(int i=0; i<queue.size(); i++){
                Node node = queue.poll();
                if(node.left != null){
                    list.add(node.left.data);
                    queue.offer(node.left);
                }
                if(node.right != null){
                    list.add(node.right.data);
                    queue.offer(node.right);
                }
            }
        }
        System.out.println(list);
        System.out.println(height);
    }
    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(6);
        node.left.left = new Node(3);
        node.left.right = new Node(4);
        node.left.right.left = new Node(5);
        node.right.right = new Node(7);
        getTraversal(node);
    }
}
