
public class Exam01{

    static class ArrayQueue implements Queue{
        int[] array;
        int head;
        int tail;

        public ArrayQueue(int size){
            array = new int[size];
            head = 0;
            tail = 0;
        }
        @Override
        public void enqueue(int element){
            if(array.length <= tail){
                throw new IllegalStateException();
            }

            array[tail++] = element;
        }

        @Override
        public int dequeue(){
            if(head == tail){
                throw new IllegalStateException();
            }
            return array[head++];
        }

        @Override
        public int peek(){
            if(head == tail){
                throw new IllegalStateException();
            }
            return array[head];
        }

        @Override
        public String toString(){
            StringBuilder stringBuilder = new StringBuilder();
            
            stringBuilder.append("[");
            int p = head;
            if(p != tail){
                stringBuilder.append(array[p++]);
            }

            while(p != tail){
                stringBuilder.append(", ");
                stringBuilder.append(array[p++]);
            }

            stringBuilder.append("]");
            return stringBuilder.toString();
        }

    }


     public static void main(String[] args) {
        Queue queue = new ArrayQueue(5);

        System.out.println("queue : " + queue);
        queue.enqueue(1);
        System.out.println("euqueue " + 1 + " : " + queue);
        queue.enqueue(2);
        System.out.println("euqueue " + 2 + " : " + queue);
        queue.enqueue(3);
        System.out.println("euqueue " + 3 + " : " + queue);
        queue.enqueue(4);
        System.out.println("euqueue " + 4 + " : " + queue);
        queue.enqueue(5);
        System.out.println("euqueue " + 5 + " : " + queue);
        int value = queue.dequeue();
        System.out.println("dequeue " + queue + " : " + value);
        queue.dequeue();
        System.out.println("dequeue " + queue + " : " + value);
        queue.dequeue();
        System.out.println("dequeue " + queue + " : " + value);
        queue.dequeue();
        System.out.println("dequeue " + queue + " : " + value);
        queue.dequeue();
        System.out.println("dequeue " + queue + " : " + value);
    }

}