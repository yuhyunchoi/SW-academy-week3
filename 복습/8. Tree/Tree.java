import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



public class Tree<T extends Comparable<T>>{
    class Node<V extends Comparable<T>>{
        V item;
        Node<V> left;
        Node<V> right;

        public Node(V item){
            this.item = item;
        }
    }

    Node<T> root;

    Tree(){
        root = null;
    }

    //삽입 메서드
    void insert(T item){
        root = insert(root, item);
    }
    //삽입을 위한 재귀 메서드
    Node<T> insert(Node<T> root, T item){
        if(root == null){
            root = new Node<>(item);
            return root;
        }
        if(item.compareTo(root.item) < 0 ){
            root.left = insert(root.left, item);
        }
        else if(item.compareTo(root.item) > 0){
            root.right = insert(root.right , item);
        }
        return root;
    }

    //검색 메서드
    boolean search(T item){
        return search(root, item) != null;
    }

    //검색을 위한 재귀 메서드
    Node<T> search(Node<T> root, T item){
        if(root == null || root.item.equals(item)){
            return root;
        }
        if(root.item.compareTo(item) < 0){
            return search(root.left, item);
        }
        return search(root.right, item);
    }

    //삭제 메서드
    void delete(T item){
        root = delete(root, item);
    }
    //삭제를 위한 재귀 메서드
    Node<T> delete(Node<T> root, T item){
        if(root == null){
            return root;
        }
        if(item.compareTo(root.item) < 0){
            root.left = delete(root.left, item);
        }
        else if(item.compareTo(root.item) > 0){
            root.right = delete(root.right, item);
        }else{
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            root.item = minValue(root.right);
            root.right = delete(root.right, root.item);
        }
        return root;
    }   

    //최소값 찾기 메서드
    T minValue(Node<T> root){
        T minValue = root.item;
        while(root.left != null){
            minValue = root.left.item;
            root = root.left;
        }
        return minValue;
    }

    //중위 순회(Inorder Traversal)
    List<T> inorderDFS(boolean reverse){
        return inorderDFS(root, reverse);
    }
    //중위 순회를 위한 재귀 매서드
    List<T> inorderDFS(Node<T> root, boolean reverse){
        List<T> items = new LinkedList<>();

        if(root != null){
            items.addAll(inorderDFS(reverse ? root.right : root.left, reverse));
            items.add(root.item);
            items.addAll(inorderDFS(reverse ? root.left : root.right, reverse));
        }
        return items;
    }

    //BFS 메서드
    List<T> bfs(){
        List<T> items = new LinkedList<>();
        if(root != null){
            Queue<Node<T>> queue = new LinkedList<>();
            queue.add(root);
            
            while(!queue.isEmpty()){
                Node<T> node = queue.poll();
                items.add(node.item);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
        }
        return items;
    }

    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();
    
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