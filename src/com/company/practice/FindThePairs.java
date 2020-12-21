package com.company.practice;

import java.util.*;

public class FindThePairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of 1st array");
        int m =scan.nextInt();

        System.out.println("Enter the size of 2nd array");
        int n = scan.nextInt();

        int[] p = new int[m];
        int[] q = new int[n];
        System.out.println("Enter elements of 1st array P");
        for (int i = 0; i < m; i++)
            p[i] = scan.nextInt();
        System.out.println("Enter elements of 2nd array");
        for (int i = 0; i < n; i++)
            q[i] = scan.nextInt();

        int sum = findPairs(p,q);
        System.out.println(sum);
    }

        public static int findPairs(int[] p, int[] q) {
            //List<String> res = new ArrayList<>();
            for (int i = 0; i < p.length; i++) {
                for (int j = 0; j < q.length; j++) {
                    if (p[i] == q[j]) {
                        int output = (i + 1) * (j + 1);
                        return output;
                    }
                }
            }
            return -1;
        }

}
