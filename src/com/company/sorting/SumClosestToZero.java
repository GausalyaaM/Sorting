package com.company.sorting;

import java.util.Scanner;

public class SumClosestToZero {
    static void minAbsSumPair(int arr[], int arr_size)
    {
        int min_sum, sum, min_l, min_r;
        if(arr_size < 2)
        {
            System.out.println("Invalid Input");
            return;
        }
        min_l = 0;
        min_r = 1;
        min_sum = arr[0] + arr[1];
        for(int l = 0; l < arr_size - 1; l++)
        {
            for(int r = l+1; r < arr_size; r++)
            {
                sum = arr[l] + arr[r];
                if(Math.abs(min_sum) > Math.abs(sum))
                {
                    min_sum = sum;
                    min_l = l;
                    min_r = r;
                }
            }
        }
        System.out.println(" The two elements whose "+
                "sum is minimum are "+
                arr[min_l]+ " and "+arr[min_r]);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        minAbsSumPair(arr,size);
    }
}
