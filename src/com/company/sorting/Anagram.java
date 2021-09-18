package com.company.sorting;
import java.util.Scanner;
public class Anagram {
    public static boolean isAnagram(String a,String b)
    {
        int[] freq1=new int[256];
        int[] freq2=new int[256];
        if(a.length()!=b.length()){
            return false;
        }
        else{
            for(int i=0;i<a.length();i++){
                freq1[a.charAt(i)]++;
                freq2[b.charAt(i)]++;
            }
        }
        for(int i=0;i<256;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str1=scan.next();
        System.out.println("Enter the string:");
        String str2=scan.next();
        boolean bool=isAnagram(str1,str2);
        System.out.println(bool);
    }
}
