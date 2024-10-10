package com.homework2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoinChangeProblem {
    private Map<Integer, Integer> memo; //메모이제이션

    public CoinChangeProblem() {
        memo = new HashMap<>();
    }

    public int coinChange(int[] coins, int amount) {
        if(amount < 0){ //목표 금액이 음수인 경우 불가능
            return -1;
        }
        if(amount == 0){//목표 금액이 0인 경우 0 반환
            return 0;
        }
        if(memo.containsKey(amount)){
            return memo.get(amount); //메모이제이션에 저장된 결과가 있는 경우 바로 결과 값 반환
        }

        int minCoins = Integer.MAX_VALUE;
        for(int coin : coins){
            int result = coinChange(coins, amount - coin); //동전을 사용하여 목표 금액에서 해당 동전의 값을 뺀 나머지 금액에 대해 재귀적으로 최소 동전 개수를 계산
            if(result >= 0 && result < minCoins){
                minCoins = 1 + result; // 동전을 하나 사용했으므로 1을 더함 
            }

        }
        memo.put(amount,(minCoins == Integer.MAX_VALUE) ? -1 : minCoins); //메모이제이션에 amount값과 minCoins 저장
        return memo.get(amount);
    
    }

    public static void main(String[] args) {
        CoinChangeProblem coinChange = new CoinChangeProblem();
        int minCoins = Integer.MAX_VALUE;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("동전의 종류 입력(공백으로 종류 구분): ");
            String coinsLine = scanner.nextLine();
            System.out.print("목표 금액 : ");
            String amountLine = scanner.nextLine();

            String[] words = coinsLine.split("\\s");

            int[] coins = new int[words.length];
            for (int i = 0; i < words.length; i++) {
                coins[i] = Integer.parseInt(words[i]);
            }

            int amount = Integer.parseInt(amountLine);

            int result = coinChange.coinChange(coins, amount);
            System.out.println("목표 금액을 만들기 위해 필요한 최소 동전 개수 : " + result);
        }
    }
}
