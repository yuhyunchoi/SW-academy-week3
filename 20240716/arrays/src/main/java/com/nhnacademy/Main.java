package com.nhnacademy;

public class Main {
    public static void main(String[] args) {
        String[] a = {"11","22","33","44","55","66"};

        System.out.println("33은 " + search(a, "33") + "에 있습니다.");
        System.out.println("55은 " + search(a, "55") + "에 있습니다.");
        System.out.println("77은 " + search(a, "77") + "에 있습니다.");
    }
    public static int search(String[] a,String target){
        for(int i = 0; i < a.length ; i++){
            if(a[i].equals(target))
                return i;
        }
        return -1;
    }
}