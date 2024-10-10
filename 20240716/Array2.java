import java.util.Arrays;
import java.lang.Math;

public class Array2 {
    
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        boolean[] b = new boolean[a.length];
        double[] c = new double[a.length];
        int[][] d = new int[10][10];
        
        System.out.println(Arrays.toString(a));

        for(int i = 0;i < a.length; i++){
            if(a[i] % 2 == 1)
                b[i] = true;
        }
        System.out.println(Arrays.toString(b));
        
        for(int i = 0; i < a.length; i++){
            c[i] = Math.pow(a[i], 2)* Math.PI;
        }
        System.out.println(Arrays.toString(c));

        for(int i = 2; i < 10; i++){
            for(int j = 1; j < 10; j++){
                d[i][j] = i * j;
            }
        }
        System.out.println("d[][] = [");
        for(int i = 2; i < 10; i++){
            System.out.print("[");
            for(int j = 1; j < 10; j++){
                if(j == 9){
                    System.out.print(d[i][j]);
                }
                else{
                    System.out.print(d[i][j] + ", ");
                }
                
                if(j == 9)
                    System.out.println("],");
                if(i == 9 && j == 9)
                    System.out.println("]");
            }
        }
    

        
        

    }
    
}
