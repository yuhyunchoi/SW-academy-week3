import java.util.Arrays;

public class Exam02 {

    static void arraycopy(int[] a, int srcPos, int[] b, int destPos, int length){
        if(a == null || b == null || srcPos < 0 || destPos < 0 || (a.length < srcPos + length) || (b.length < destPos + length)){
            throw new IndexOutOfBoundsException();
        }
        if((a == null) || (b == null)){
            throw new NullPointerException();
        }
        // a, 1, b, 4, 3
        if(srcPos < destPos){
            for(int i = length - 1; i >= 0 ; i--) {
                b[destPos+i] = a [srcPos+i];
            }
        }else if(destPos < srcPos){
            for(int i = 0 ; i < length ;i++){
                b[destPos+i] = a[srcPos+i];
            }
        }

    }

    public static void main(String[] args) {
    int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    //int[] b = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    //int[] b = { 0, 1, 2, 3, 1, 2, 3, 7, 8, 9 };
    int[] b = a.clone();

    System.out.println("a : " + Arrays.toString(a));
    System.out.println("b : " + Arrays.toString(b));
    System.out.println("Arrays.equals(a, b) = " + Arrays.equals(a, b));
    arraycopy(a, 1, a, 3, 5);
    System.arraycopy(b, 1, b, 3, 5);
    System.out.println("a : " + Arrays.toString(a));
    System.out.println("b : " + Arrays.toString(b));
    System.out.println("Arrays.equals(a, b) = " + Arrays.equals(a, b));
    arraycopy(a, 4, a, 1, 5);
    System.arraycopy(b, 4, b, 1, 5);
    System.out.println("a : " + Arrays.toString(a));
    System.out.println("b : " + Arrays.toString(b));
    System.out.println("Arrays.equals(a, b) = " + Arrays.equals(a, b));
}

}
