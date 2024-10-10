import java.util.ArrayList;
import java.util.List;

public class Exam7 {

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

    // 회문인지 확인하는 메서드
    public static boolean isPalindrome(int num) {
        String str = Integer.toString(num);
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // n개의 회문 소수를 찾는 메서드
    public static List<Integer> findPalindromicPrimes(int n) {
        List<Integer> palindromicPrimes = new ArrayList<>();
        int count = 0;
        int num = 2;
        
        while (count < n) {
            if (isPrime(num) && isPalindrome(num)) {
                palindromicPrimes.add(num);
                count++;
            }
            num++;
        }
        
        return palindromicPrimes;
    }

    // 결과를 출력하는 메서드
    public static void main(String[] args) {
        int n = 10; // 찾고자 하는 회문 소수의 개수
        List<Integer> palindromicPrimes = findPalindromicPrimes(n);

        for (int prime : palindromicPrimes) {
            System.out.println(prime);
        }
    }
}
