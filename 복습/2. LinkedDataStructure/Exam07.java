public class Exam07 {
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
        Node(Node next, int data){
            this.next = next;
            this.data = data;
        }
        @Override
        public String toString(){
            return String.valueOf(data);
        }

    }

    public static Node insert(Node start, int data){
        if(start == null){
            return new Node(data);
        }
        if(data < start.data){
            return new Node(start, data);
        }

        Node p = start;
        while(p.next != null && p.next.data < data){
            p = p.next;
        }
        p.next = new Node(p.next, data);

        return start;
    }
    public static Node delete(Node start, int data){
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
        int[] datas = {55,66,33,77,44};

        for(int data : datas){
            start = insert(start, data);
            for(Node p = start; p != null; p = p.next){
                System.out.print(p + " ");
            }
            System.out.println();
        }   
        start = delete(start, 22);

        for(Node p = start; p != null; p = p.next){
            System.out.print(p + " ");
        }

    }
}
