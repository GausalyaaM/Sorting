package com.company.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class IfArraysEqual {
    public static boolean check(int A[],int B[],int N)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0;i<N;i++){
            if(A[i]!=B[i]){
                return false;
            }
        }
        return true;
        //Your code here
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = scan.nextInt();
        int[] A = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            A[i] = scan.nextInt();
        }
        int[] B = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            B[i] = scan.nextInt();
        }
        boolean result = check(A, B, size);
        System.out.println(result);
    }
}
