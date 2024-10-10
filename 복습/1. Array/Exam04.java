import java.util.Arrays;

public class Exam04{

    public static int search(int[] a, int target){
        
        for(int i = 0; i < a.length; i++){
            if(a[i] == target){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] a = { 22, 33, 44, 55, 66, 77, 88, 99 };
        System.out.println(Arrays.toString(a));
        System.out.println("search(a, 44): " + search(a, 44));
        System.out.println("search(a, 50): " + search(a, 50));
        System.out.println("search(a, 77): " + search(a, 77));
        System.out.println("search(a, 100): " + search(a, 100));
    }
    
}