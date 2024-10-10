public class Exam02 {
    
    public static int fibonacci(int num){
        if(num == 0){
            return 0;
        }
        else if(num == 1){
            return 1;
        }
        else{
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
    public static int[] fibonacci2(int num){
       
        int[] arr = new int[num];

        if (num < 0) {
            throw new IllegalArgumentException("Please enter a positive integer.");
        }
        if(num > 0){
            arr[0] = 0;
        }
        if(num > 1){
            arr[1] = 1;
        }
      
        for(int i = 2; i < num ; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr;
    }
        
    public static void main(String[] args) {
        int[] arr = fibonacci2(16);
        for (int n = 0; n < 16; n++) {// 0 1 1 2 3 5 8 13 21 ... 
            System.out.printf("fibonacci(%d) = %d%n", n, fibonacci(n));
        }
        System.out.println();

        for (int n = 0; n < 16; n++) {// 0 1 1 2 3 5 8 13 21 ...
            System.out.printf("fibonacci(%d) = %d%n", n, arr[n]);
        }
    }
}
