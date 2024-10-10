import java.util.Iterator;


public class Exam3_7_1{
    Exam3_7_1(){

    }

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
    static class Iterator implements SimpleListIterator{
        Node start;
        Node next;
        Node previous;

        Iterator(Node start){
            this.start = start;
        }
        @Override
        public boolean hasNext(){
            return next != null;
        }
        @Override
        public int next(){
            if(next == null){
                throw new IllegalStateException();
            }
            int data = next.data;
            previous = next;
            next = next.next;

            return data;
        }
        @Override
        public boolean hasPrevious(){
            return previous != null;
        }
        @Override
        public int previous(){
            if(previous != null){
                throw new IllegalStateException();
            }

            int data = previous.data;
            next = previous;

            if(previous == start){
                previous = null;
            }else{
                Node p = start;
                while(p.next != previous){
                    p = p.next;
                }
                previous = p;
            }
            return data;
        }
        @Override
        public void remove(){
            if(next == null){
                throw new IllegalStateException();
            }
            next = next.next;
            if(previous != null){
                previous.next = next;
            }
        }
    }
    static class List implements SimpleList{
        Node head = null;

        @Override
        public boolean isEmpty(){
            return (head == null);
        }
        @Override
        public void addFirst(int data){
            head = new Node(data, head);
        }
        @Override
        public void addLast(int data){
            if(head == null){
                throw new IllegalStateException();
            } else{
                Node p = head;
                while(p.next != null){
                    p = p.next;
                }
                p.next = new Node(data);
            }

        }
        @Override
        public int removeFirst(){
            if(head == null){
                throw new IllegalStateException();
            }
            int data = head.data;
            head = head.next;
            return data;
        }

        @Override
        public int removeLast(){
            if(head == null){
                throw new IllegalStateException();
            }else if (head.next == null){
                int data = head.data;
                head = null;
                return data;
            }
            Node p = head;
            while(p.next.next != null){
                p = p.next;
            }
            int data = p.next.data;
            p.next = null;
            return data;
        }

        @Override
        public boolean remove(int data){
            if(head == null){
                return false;
            } else if(head.data == data){
                head = head.next;
                return true;
            }
            Node p = head;
            while(p.next != null){
                if(p.next.data == data){
                    p.next = p.next.next;
                    return true;
                }
                p = p.next;
            }
            return false;
        }
        @Override
        public boolean contains(int data){
            if(head == null){
                return false;
            } else if(head.data == data){
                head = head.next;
                return true;
            }
            Node p = head;
            while(p.next != null){
                if(p.next.data == data){
                    return true;
                }
                p = p.next;
            }

            return false;
        }
        @Override
        public int size(){
            if(head == null) {
                return 0;
            }
            Node p = head;
            int count = 0;
            while(p != null){
                ++count;
                p = p.next;
            }
            return count;
        }
        @Override
        public String toString(){
            StringBuilder stringBuilder = new StringBuilder();

            stringBuilder.append("[");
            if(head != null){
                stringBuilder.append(head.data);
            }
            Node p = head.next;

            while(p != null){
                stringBuilder.append(", " + p.data);
                p = p.next;
            }
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
        @Override
        public SimpleListIterator iterator(){
            return new Iterator(head);
        }

    }
    public static void main(String[] args) {
        
    }
}