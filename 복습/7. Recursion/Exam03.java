import java.util.Arrays;

public class Exam03 {

    public static int search(int[] arr, int lo, int hi, int target){
        //int[] a = { 22, 33, 44, 55, 66, 77, 88, 99 };
        if(lo > hi){
            return -1;
        }
        int i = (lo+hi)/2;

        if(arr[i] == target){
            return i;
        }
        else if(arr[i] < target){
            return search(arr, i + 1, hi, target);
        }
        else{ //arr[i] > target
            return search(arr, lo, i - 1, target);
        }

    }

    public static int search(int[] arr, int target){
        return search(arr, 0, arr.length - 1, target);
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
