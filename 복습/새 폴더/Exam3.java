import java.lang.Math;

public class Exam3 {

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

    // 메르센 소수인지 확인하는 메서드
    public static boolean isMersennePrime(int p) {
        if (!isPrime(p)) {
            return false;
        }
        int mersenne = (int)Math.pow(2,p) - 1; // 2^p - 1 을 계산
        return isPrime(mersenne);
    }

    // 결과를 출력하는 메서드
    public static void main(String[] args) {
        int[] testPrimes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29}; // 테스트할 소수들

        for (int p : testPrimes) {
            int mersenne = (1 << p) - 1; // 2^p - 1 을 계산
            if (isMersennePrime(p)) {
                System.out.println(p + " 2^" + p + "-1 = " + mersenne + " is prime");
            } else {
                System.out.println(p + " 2^" + p + "-1 = " + mersenne + " is not prime");
            }
        }
    }
}
