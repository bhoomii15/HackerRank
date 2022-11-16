package com.bhoomi;

import java.util.Arrays;
import java.util.Scanner;

public class Java1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(a));
    }
}
