import java.util.Arrays;
import java.util.Random;

public class Exam01{
    static final Random random = new Random();

    public static void insert(int[] a, int length, int value){
        int i = 0;
        while(i < length){
            if(value <= a[i]){
                break;
            }
            i++;
        }
        System.arraycopy(a, i, a, i + 1, length - i);
        a[i] = value;
    }
    
    public static void main(String[] args) {
        int a[] = new int[10];
        for(int i = 0; i < a.length; i++){
            int x = random.nextInt(100);
            System.out.print(Arrays.toString(a) + " + " + x);
            insert(a, i, x);
            System.out.println(" = " + Arrays.toString(a));
        }
    }
}