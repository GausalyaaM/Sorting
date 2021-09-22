package com.company.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class CandyStore {
    public static int findMinimum(int arr[], int n, int k)
    {
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += arr[i];
            n = n - k;
        }
        return res;
    }
    public static int findMaximum(int arr[], int n, int k)
    {
        int res = 0, index = 0;

        for (int i = n - 1; i >= index; i--)
        {
            res += arr[i];
            index += k;
        }
        return res;
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
        Arrays.sort(arr);
        System.out.println(findMinimum(arr, size, k) + " " + findMaximum(arr, size, k));
    }
}
