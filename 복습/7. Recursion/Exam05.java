public class Exam05 {
    
    public static void hanoiTowers(int num, char a, char b, char c){
        if(num == 1){
            System.out.printf("Move top disk from peg %c to peg %c.%n", a, c);
        }
        else{
            hanoiTowers(num - 1, a, c, b);
            hanoiTowers(1, a, b, c);
            hanoiTowers(num - 1, b, a, c);
        }

    }
    
    public static void main(String[] args) {
        hanoiTowers(3, 'A', 'B', 'C');
    }

}
