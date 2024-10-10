import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree<T extends Comparable<T>> { //비교 가능한 연산자들에 대해서만 받겠다..?

    class Node {
        T item;
        Node right;
        Node left;
        
        public Node(T item){
            this.item = item;
        }
    }

    Node root;

    public void insert(T item){
        root = insert(root, item);
    }

    Node insert(Node node, T item){
        if(node == null){
            return new Node(item);
        }
        if(node.item.compareTo(item) < 0){
            node.right = insert(node.right, item);
        }else if(node.item.compareTo(item) > 0){
            node.left = insert(node.left, item);
        }
        return node;
    }
    
    public boolean search(T item){
        return search(root, item);
    }
    public boolean search(Node node, T item){ //recursion
        if(node == null){
            return false;
        }
        if(node.item.equals(item)){
            return true;
        }
        if(node.item.compareTo(item) < 0){
            return search(node.right, item);
        }
        else{
            return search(node.left, item);
        }

    }

    public boolean searchI(T item){ //Iterator
        Node p = root;
        while(p != null){
            if(p.item.equals(item)){
                return true;
            }
            if(p.item.compareTo(item) < 0){
                p = p.right;
            }else{
                p = p.left;
            }
        }
        return false;
    }

    public List<T> inorderDFS(boolean reverse){
        List<T> items = new LinkedList<>();
        inorderDFS(items, root, reverse);
        return items;
    }
    public void inorderDFS(List<T> items, Node node, boolean reverse){
        if(node != null){
            inorderDFS(items, reverse ? node.right : node.left, reverse);
            items.add(node.item);
            inorderDFS(items, reverse ? node.left:node.right, reverse);
        }
    }


    public List<T> bfs(){
        List<T> items = new LinkedList<>();
        Deque<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node node = queue.pollFirst();
            if(node != null){
                queue.add(node.left);
                queue.add(node.right);
                items.add(node.item);
            }
        }
        return items;
    }

     

    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
    
        /* 트리에 노드 삽입 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
    
        System.out.println("BFS: " + tree.bfs());
        // 중위 순회로 트리 출력
        System.out.println("DFS: " + tree.inorderDFS(false));
    
        // 검색 테스트
        System.out.println("Search for 40: " + tree.search(40));
        System.out.println("Search for 90: " + tree.search(90));
    
        // 노드 삭제
        System.out.println("Delete 20");
        tree.delete(20);
        System.out.println("DFS: " + tree.inorderDFS(false));
    
        System.out.println("Delete 30");
        tree.delete(30);
        System.out.println("DFS: " + tree.inorderDFS(false));
    
        System.out.println("Delete 50");
        tree.delete(50);
        System.out.println("DFS: " + tree.inorderDFS(false));
    }
}