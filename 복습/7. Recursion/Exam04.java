public class Exam04 {
    
    public static int gcd(int x, int y){

        if(x == y){
            return x;
        }
        else if ( x < y){
            return gcd( x , y - x);
        }
        else{
            return gcd(y,  x-y);
        }

    }

    public static void main(String[] args) {
        
        System.out.println(gcd(494,130));
        
    }
}
