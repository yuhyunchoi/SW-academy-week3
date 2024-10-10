package com.nhnacademy;

public class Fibonacci {

    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }

    }
    
    public static void main(String[] args) {

        for (int n = 0; n < 16; n++) {
            System.out.printf("fibonacci(%d) = %d%n", n, fibonacci(n));
        }
    
    }

    
}
 