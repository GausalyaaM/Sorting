package com.company.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MaxToys {
    public static int maximum_toys(int cost[], int N, int K) {
        int count = 0, sum = 0;
        Arrays.sort(cost);
        for (int i = 0; i < N; i++) {
            if (sum + cost[i] <= K) {
                sum = sum + cost[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        int count = maximum_toys(arr, size, k);
        System.out.println(count);
    }
}
