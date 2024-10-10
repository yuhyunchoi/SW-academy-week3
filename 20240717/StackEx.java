import java.util.Arrays;

public class StackEx implements Stack {
    static final int CAPACITY = 100;
    int[] arr;
    int top;

    public StackEx(){
        this(CAPACITY); //코드 재사용
    }
    public StackEx(int capacity){
        arr = new int[capacity];
        top = -1;
    }
    @Override
    public void push(int element){
        if(top >= arr.length - 1){
            arr = Arrays.copyOf(arr, 11);
        }
       arr[++top] = element;

    }
    @Override
    public int pop(){
        if(top < 0 ){
            throw new IllegalArgumentException();
        }
        return arr[top--];

    }
    @Override
    public int peek(){
        if(top < 0 ){
            throw new IllegalArgumentException();
        }
        return arr[top];
    }
    @Override
    public String toString(){
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        StackEx stack = new StackEx(10);
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

                stack.push(operand1 * operand2);
            }
            else{
                stack.push(Integer.parseInt(token));
            }

        }

        System.out.println(stack.pop());
        


    }

    

}
