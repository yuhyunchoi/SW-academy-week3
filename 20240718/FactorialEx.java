public class FactorialEx {

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        
        for (int n = 0 ; n < 10; n++) {
            System.out.printf("factorial(%d) = %d%n", n, factorial(n));
        }
    
    }
    
}
