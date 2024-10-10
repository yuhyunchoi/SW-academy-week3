public class Exam07 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
        @Override
        public String toString(){
            return String.valueOf(data);
        }
    }

    static Node insert(Node start, int data){
        if(start == null){
            return new Node(data);
        }
        if(data < start.data){
            return new Node(data, start);
        }
        Node p = start;
        while(p.next != null && p.next.data < data ){
            p = p.next;
        }
        p.next = new Node(data, p.next);
        
        return start;

    }
    static Node delete(Node start, int data){
        if(start == null){
            return start;
        }
        if(start.data == data){
            start = start.next;
            return start;
        }
        Node p = start;

        while(p.next != null){
            if(p.next.data == data){
                p.next = p.next.next;
                break;
            }
            p = p.next;
        }
        return start;
      
    }

    public static void main(String[] args) {
        Node start = new Node(22);
        int[] datas = {55,44,33,66};
        for(int data : datas){
            start = insert(start, data);
            for(Node p = start; p != null; p = p.next){
                System.out.print(p + " ");
            }
            System.out.println();
        }
        start = delete(start, 44);
        for(Node p = start; p != null; p = p.next){
            System.out.print(p + " ");
        }
        

    }
}
