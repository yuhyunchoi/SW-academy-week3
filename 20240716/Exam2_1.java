import java.util.Arrays;
import java.util.Random;

public class Exam2_1 {
    public static void main(String[] args) {
        int[] a = new int[10];
        Random random = new Random();
        for(int i = 0 ; i < a.length; i++){
            int x = random.nextInt(100);
            System.out.print(Arrays.toString(a) + " + " + x);
            insert(a, i, x);
            System.out.println(" = " + Arrays.toString(a));
        }
    }
    public static void insert(int[] a, int length, int value){
        int i = 0;
        if((a != null)){
            throw new NullPointerException();
        }
        if(length < 0 || a.length < length){
            throw new ArrayIndexOutOfBoundsException();
        }
        for(; i < length; i++){
            if(value <= a[i]){
                break;
            }
        }
        System.arraycopy(a, i, a, i+1, length - i);

       
        a[i] = value;
    }
    
}
