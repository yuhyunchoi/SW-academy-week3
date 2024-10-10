public class Gcd {
    static int gcd(int x, int y){
        if( y == 0 ){
            return x;
        }
        else{
            return gcd(y , x % y);
        }
    }
    static int gcd2(int x, int y){
        if(x < y){
            int z = x;
            x = y;
            y =z;
        }
        if ( y == 0){
            return x;
        }
        return gcd2(y,x- y);
    }
    

    public static void main(String[] args) { 
        System.out.println(gcd(494,130));
        System.out.println(gcd2(494,130));
    }
}
