import java.util.ArrayList;
import java.util.List;

public class Exam1 {

    // 에라토스테네스의 체를 사용하여 소수를 미리 계산
    public static boolean[] sieveOfEratosthenes(int max) {
        boolean[] isPrime = new boolean[max + 1];
        for (int i = 2; i <= max; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= max; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= max; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        return isPrime;
    }

    // 주어진 짝수 n에 대해 소수 쌍을 찾는 메서드
    public static List<int[]> goldbachNumber(int n, boolean[] isPrime) {
        List<int[]> pairs = new ArrayList<>();

        for (int i = 2; i <= n / 2; i++) {
            if (isPrime[i] && isPrime[n - i]) {
                pairs.add(new int[]{i, n - i});
            }
        }

        return pairs;
    }

    // 결과를 출력하는 메서드
    public static void main(String[] args) {
        int limit = 50; // 원하는 짝수의 최대값
        boolean[] isPrime = sieveOfEratosthenes(limit);

        for (int i = 4; i <= 22; i += 2) {
            List<int[]> pairs = goldbachNumber(i, isPrime);
            System.out.print(i + " = ");
            for (int j = 0; j < pairs.size(); j++) {
                System.out.print(pairs.get(j)[0] + "+" + pairs.get(j)[1]);
                if (j < pairs.size() - 1) {
                    System.out.print(" = ");
                }
            }
            System.out.println();
        }
    }
}
