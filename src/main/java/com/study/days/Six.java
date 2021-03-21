package com.study.days;

import java.util.Scanner;

public class Six {
    public void test() {
//        Objective
//        Today, we're working with binary numbers. Check out the Tutorial tab for learning materials and an instructional video!
//
//        Task
//        Given a base- integer, , convert it to binary (base-). Then find and print the base- integer denoting the maximum number of consecutive 's in 's binary representation. When working with different bases, it is common to show the base as a subscript.
//
//                Example
//
//        The binary representation of  is . In base , there are  and  consecutive ones in two groups. Print the maximum, .
//
//        Input Format
//
//        A single integer, .
//
//        Constraints
//
//        Output Format
//
//        Print a single base- integer that denotes the maximum number of consecutive 's in the binary representation of .
//
//        Sample Input 1
//
//        5
//        Sample Output 1
//
//        1
//        Sample Input 2
//
//        13
//        Sample Output 2
//
//        2
//        Explanation
//
//        Sample Case 1:
//        The binary representation of  is , so the maximum number of consecutive 's is .
//
//        Sample Case 2:
//        The binary representation of  is , so the maximum number of consecutive 's is .
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String str = "";

        do {
            if (n % 2 != 0) {
                str = str.concat("1");
            } else {
                str = str.concat("0");
            }
            n = n / 2;

        } while (n > 0);


        String[] arr = str.split("0");
        int max = 0;

        for (int i = 0; i < arr.length; i++) {


            if (!"".equals(arr[i]) && max < arr[i].length()) {
                max = arr[i].length();
            }

        }

        System.out.println(max);

        scanner.close();
    }


}

