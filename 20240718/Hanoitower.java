public class Hanoitower{

    public static void main(String[] args) {
        hanoiTowers(3, 'A', 'B', 'C');
    }

    public static void hanoiTowers(int n, char x, char y, char z) {
        if(n == 0){
            return;
        }
        hanoiTowers(n-1, x, z, y);
        System.out.printf("Move top disk from peg %s to peg %s\n", x, z);
        hanoiTowers(n-1, y, x, z);


    }
    
}