import java.util.Random;

public class Exam03 {
    public static void insert(int[] a, int[] k, int length, int value){
        int i = 0;
        while(i < length && a[k[i]] < value){
            i++;
        }
        System.arraycopy(k, i, k, i + 1, length - i);
        a[length] = value;
        k[i] = length;
    }


    public static String toString(int[] a, int[] k, int length) {
        StringBuilder builder = new StringBuilder();
    
        builder.append("[");
        if (length > 0) {
            builder.append(String.format("%3d", a[k[0]]));
        }
    
        for (int i = 1; i < length; i++) {
            builder.append(String.format(", %3d", a[k[i]]));
        }
        builder.append("]");
    
        return builder.toString();
    }
    
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] k = new int[10];

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int x = random.nextInt(100);
            System.out.print(toString(a, k, i) + " + " + x);
            insert(a, k, i, x);
            System.out.println(" = " + toString(a, k, i + 1));
        }
    }

}
