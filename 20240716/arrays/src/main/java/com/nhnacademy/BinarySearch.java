package com.nhnacademy;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {22,33,44,55,66,77,88,99};
        BinarySearch.print("a" , a);
        System.out.println("\nSearch(a,44) : " + search(a,44));
        System.out.println("Search(a,50) : " + search(a,50));
        System.out.println("Search(a,77) : " + search(a,77));
        System.out.println("Search(a,100) : " + search(a,100));
        
    }

    public static int search(int[] a, int target){
        int start = 0;
        int end = a.length;

        while(start < end){
            int middle = (start + end)/ 2;
            if(a[middle] == target){
                return middle;
            }
            else if(a[middle] > target){
                end = middle;
            }
            else{
                start = middle + 1; 
            }
        }
        return -1;

    }
    public static void print(String str, int[] a){
        System.out.print(str + " : ");
        for(int i : a){
            System.out.print( i + " ");
        }
    }
}

