package com.homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class MyArrays {
    static int minimum(int[] a){
        if(a == null || a.length == 0){
            throw new IllegalArgumentException("배열이 null이거나 0입니다.");
        }
        int min = a[0];

        for(int i = 0; i < a.length; i++){
            if(a[i] < min)
                min = a[i];
        }
        return min;


    }
    
    static double mean(double[] a){
        double sum = 0;
        if(a == null || a.length == 0){
            throw new IllegalArgumentException("배열이 null이거나 0입니다.");
        }
        for(int i = 0; i < a.length;i++){
            sum += a[i];
        }

        return sum / a.length;


    }

    static int[] withoutDuplicates(int[] a){

        if(a == null || a.length == 0){
            throw new IllegalArgumentException("배열이 null이거나 0입니다.");
        }
    
        return Arrays.stream(a).distinct().toArray();
    }

    static void reverse(int[] a){
        if(a == null || a.length == 0){
            throw new IllegalArgumentException("배열이 null이거나 0입니다.");
        }
        int n = a.length;
        for(int i = 0; i < n/2 ; i++){
            int tmp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] =tmp;
        }
    }
    static Object[] concatenate(Object[] a, Object[] b){
        if(a == null || a.length == 0 || b == null || b.length == 0 ){
            throw new IllegalArgumentException("배열이 null이거나 0입니다.");
        }   
        Object[] result = new Object[a.length + b.length];

        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);

        return result;

    }

    static void shuffle(Object[] a){
        if(a == null || a.length == 0 ){
            throw new IllegalArgumentException("배열이 null이거나 0입니다.");
        } 
        List<Object> list = Arrays.asList(a);

        Collections.shuffle(list);
    }

    static int[] tally(String string) {
        if (string == null) {
            throw new IllegalArgumentException("입력 문자열이 null입니다.");
        }

        int[] frequencies    = new int[26];
        string = string.toLowerCase();

        for (char c : string.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                frequencies[c - 'a']++;
            }
        }

        return frequencies;
    }

    public static void main(String[] args) {
        int[] a = {1,5,6,7,2,3,4,9,10,8};
        double[] b = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.10};
        int[] c = {1,1,1,2,2,2,3,3,3,4,4,4,5,5,5};
        int[] d = {1,2,3,4,5,6,7,8,9,10};
        Object[] e = {1,2,3,4,5,6,7,8,9,10};
        Object[] f = {"Jan","Feb", "Mar", "Apr", "May" , "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        
    

        int result1 = minimum(a);
        System.out.println(result1);

        double result2 = mean(b);
        System.out.println(result2);

        int[] result3 = withoutDuplicates(c);
        for(int i : result3){
            System.out.print(i + " ");
        }
        System.out.println();

        reverse(d);
        for(int i : d){
            System.out.print(i + " ");
        }
        System.out.println();
        Object[] result4 = concatenate(e,f);
        System.out.print(Arrays.toString(result4));

        System.out.println();
        shuffle(f);
        System.out.print(Arrays.toString(f));

        
        String testString = "HelloWorld!";
        int[] g = tally(testString);

        System.out.println();
        for (int i = 0; i < g.length; i++) {
            System.out.println((char) (i + 'a') + " : " + g[i]);
        }

    }


}
