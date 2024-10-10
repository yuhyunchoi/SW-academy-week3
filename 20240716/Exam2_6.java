public class Exam2_6 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
        @Override
        public String toString(){
            return String.valueOf(data);
        }
    }
    public static void main(String[] args) {
        Node start = new Node(22);
        Node p = start;

        int[] datas = {33,44,55,66};
        for(int data : datas){
            p.next = new Node(data);
            p = p.next;
        }
        

        for(p = start; p != null; p = p.next){
            System.out.println(p.toString());
        }


    }
     
}
