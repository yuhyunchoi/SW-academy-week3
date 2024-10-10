import java.util.ArrayList;
import java.util.List;

public class Exam5 {

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

    // 페르마 소수를 찾는 메서드
    public static int[] fermatPrime(int n) {
        List<Integer> fermatPrimes = new ArrayList<>();

        for (int p = 0; p <= n; p++) {
            int fermatNumber = (int) (Math.pow(2, Math.pow(2, p)) + 1);
            if (fermatNumber < 0) { // 오버플로우 체크
                break;
            }
            if (isPrime(fermatNumber)) {
                fermatPrimes.add(fermatNumber);
            }
        }

        int[] result = new int[fermatPrimes.size()];
        for (int i = 0; i < fermatPrimes.size(); i++) {
            result[i] = fermatPrimes.get(i);
        }

        return result;
    }

    // 결과를 출력하는 메서드
    public static void main(String[] args) {
        int maxExponent = 4; // 예시를 위해 최대 지수를 4로 설정
        int[] fermatPrimes = fermatPrime(maxExponent);

        for (int i = 0; i < fermatPrimes.length; i++) {
            System.out.println("2^" + i + " + 1 = " + fermatPrimes[i]);
        }
    }
}
