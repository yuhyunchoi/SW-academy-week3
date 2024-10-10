public class LinkedNode {
    
    static class Node {
        int data;  // 노드가 저장하는 데이터
        Node next;  // 다음 노드를 가리키는 포인터

        public Node(int data) {
            this.data = data;  // 데이터로 노드를 초기화
        }

        public Node(int data, Node next) {
            this.data = data;  // 데이터로 노드를 초기화
            this.next = next;  // 다음 노드를 설정
        }
    }
 
    public static void main(String[] args) {
        Node start = new Node(22);  // 시작 노드를 생성하고, 값 22로 초기화
        insert(start, 33);  // 값 33을 리스트에 삽입
        insert(start, 44);  // 값 44를 리스트에 삽입
        insert(start, 55);  // 값 55를 리스트에 삽입

        delete(start, 44);

        while (start != null) {
            System.out.println(start.data);  // 현재 노드의 데이터를 출력
            start = start.next; 

        }
    }


    public static Node delete(Node start,int data) {

        if (start == null) { // 노드가 아무것도 없을 경우
            throw new NullPointerException();
        }

        if(start.data == data) {
            start = start.next;
            return start;
        }
    
        Node pointer = start;
        
        while(pointer.next!=null) {
            if(pointer.next.data == data) {
                pointer.next =pointer.next.next;
                break;
            }
        }
        return start;
    }

    
    
    public static Node insert(Node start,int data){
        if (start == null) {
            return new Node(data);
        }
        if(start.data == data) {
            start = start.next;
            return start;
        }
        
        Node pointer = start; // 포인터 생성
        
        while(pointer.next!=null && data>pointer.next.data) {
            pointer = pointer.next;
    }
    pointer.next = new Node(data,pointer.next);

    return start;
    }
}

