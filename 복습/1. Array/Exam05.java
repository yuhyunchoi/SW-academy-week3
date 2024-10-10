import java.util.Arrays;
//이진 검색
public class Exam05 {

    static int search(int[] a, int target){ 
        int start = 0;
        int end = a.length;
        //int[] a = { 22, 33, 44, 55, 66, 77, 88, 99 };
        while(start < end){
            int middle = (start + end) /2;
            if(a[middle] == target){
                return middle;
            }
            else if(a[middle] < target){
                start = middle + 1;
            }
            else{ //a[i] > target
                end = middle;
            }
          
        }
        return -1;
    }

    static void print(String str, int[] a){
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        int[] a = { 22, 33, 44, 55, 66, 77, 88, 99 };
        Exam05.print("a", a);
        System.out.println("search(a, 44): " + search(a, 44));
        System.out.println("search(a, 50): " + search(a, 50));
        System.out.println("search(a, 77): " + search(a, 77));
        System.out.println("search(a, 100): " + search(a, 100));
    }
    
}
