public class Exam01{

    public static int factorial(int num){ //재귀
        if(num == 0){
            return 1;
        }
        else{
            return num*factorial(num-1);
        }

    }
    public static int factorial2(int num){ //반복문
        int result = 1;
        
        for(int i = 1; i <= num; i++){
            result *= i;
        }   
        return result;

    }

    public static void main(String[] args) {
        
        for(int i = 0; i < 10;i++){
            System.out.printf("factorial(%d) : %d%n", i , factorial(i));
        }
        System.out.println();
        for(int i = 0; i < 10; i++){
            System.out.printf("factorial(%d) : %d%n" , i, factorial2(i));
        }
    }
}