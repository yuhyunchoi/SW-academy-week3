import java.util.ArrayList;
import java.util.List;

public class Exam4 {

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

    // 쌍둥이 소수를 찾는 메서드
    public static int[] twinPrime(int max) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= max; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        List<Integer> twinPrimes = new ArrayList<>();
        for (int i = 0; i < primes.size() - 1; i++) {
            if (primes.get(i + 1) - primes.get(i) == 2) {
                twinPrimes.add(primes.get(i));
                twinPrimes.add(primes.get(i + 1));
            }
        }

        int[] result = new int[twinPrimes.size()];
        for (int i = 0; i < twinPrimes.size(); i++) {
            result[i] = twinPrimes.get(i);
        }

        return result;
    }

    // 결과를 출력하는 메서드
    public static void main(String[] args) {
        int max = 100; // 예시를 위해 최대값을 100으로 설정
        int[] twinPrimes = twinPrime(max);

        for (int i = 0; i < twinPrimes.length; i += 2) {
            System.out.println(twinPrimes[i] + " " + twinPrimes[i + 1]);
        }
    }
}
