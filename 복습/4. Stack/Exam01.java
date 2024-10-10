public class Exam01 implements Stack{
    static final int CAPACITY = 100;
    int top;
    int[] array;

    public Exam01(){
        this(CAPACITY);
    }
    public Exam01(int capacity){
        array = new int[capacity];
        top = -1;
    }

    @Override
    public void push(int element){
        if(top >= array.length - 1){
            throw new IllegalArgumentException();
        }
        array[++top] = element;
    }

    @Override
    public int pop(){
        if(top < 0){
            throw new IllegalArgumentException();
        }
        return array[top--];
    }
    
    @Override
    public int peek(){
        if(top < 0){
            throw new IllegalArgumentException();
        }
        return array[top];
    }
    


    public static void main(String[] args) {
        Exam01 stack = new Exam01(10);
        String[] tokens = {"3","4","5","+","*"};

        for(String token : tokens){
            if(token.equals("+")){
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                stack.push(operand1 + operand2);
            }
            else if(token.equals("*")){
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                stack.push(operand1*operand2);
            }
            else{
                stack.push(Integer.parseInt(token));
            }


        }
        System.out.println(stack.pop());
    }
    
}