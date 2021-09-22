package com.company.sorting;

import java.util.Scanner;

public class IsArrSorted {
    public static int arraySortedOrNot(int arr[], int n)
    {
        if (n == 1 || n == 0)
            return 1;
        if (arr[n - 1] < arr[n - 2])
            return 0;
        return arraySortedOrNot(arr, n - 1);
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = scan.nextInt();
        int[] A = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
        A[i] = scan.nextInt();
    }
        int res=arraySortedOrNot(A,size);
        System.out.println(res);
}}
