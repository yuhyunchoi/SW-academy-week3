public class Fibonacci2 {
    //static Map<Integer, Integer> map = new HashMap<>();
    
    static int recursionCount = 0;
    static int dynamicCount = 0;

    static int fibonacci2(int n){
        int[] fn = new int[n+1];

        for(int i = 0; i <= n; i++){
            if(i == 0){
                fn[i] = 1;
            }    
            else if(i == 1){
                fn[i] = 1;
            }else{
                fn[i] = fn[i-1] + fn[i-2];
            }
            
        }

        return fn[n];
    }

    static int fibonacci3(int n){
        int fn_2 = 1;
        int fn_1 = 1;
        int fn = 0;

        if(n == 0){
            return fn_2;
        }
        else if(n ==1){
            return fn_1;
        }
        else{
            for(int i = 1; i < n;i++){
                fn = fn_1 + fn_2;
                fn_2 = fn_1;
                fn_1 = fn;
            }
        }

        return fn;
    }


    public static void main(String[] args) {
        int startLoopCount = 50;
        int loopCount = 51;
        long start = System.currentTimeMillis();
        for(int i = startLoopCount; i< loopCount; i++){
            fibonacci2(i);
        }
        long finished = System.currentTimeMillis();

        System.out.printf("Elapsed Time : %d%n" , finished - start);

        
        start = System.currentTimeMillis();
        for(int i = 0; i< loopCount; i++){
            fibonacci3(i);
        }
        finished = System.currentTimeMillis();
        
        System.out.printf("Elapsed Time : %d%n" , finished - start);


    }
}
