public class Exam2 {

    // 소수인지 확인하는 메서드
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // 주어진 범위 내에서 소수를 찾는 메서드
    public static int findPrime(int min, int max) {
        for (int i = min + 1; i < max; i++) {
            if (isPrime(i)) {
                return i;
            }
        }
        return -1; // 소수를 찾지 못한 경우 -1 반환
    }

    // 결과를 출력하는 메서드
    public static void main(String[] args) {
        int[] squares = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
        
        for (int i = 0; i < squares.length - 1; i++) {
            int min = squares[i];
            int max = squares[i + 1];
            int prime = findPrime(min, max);
            if (prime != -1) {
                System.out.println(min + " < " + prime + " < " + max);
            } else {
                System.out.println(min + " < no prime found < " + max);
            }
        }
    }
}
