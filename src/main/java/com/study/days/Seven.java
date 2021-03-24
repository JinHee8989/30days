package com.study.days;

import java.util.Scanner;

public class Seven {
    public void test() {
//        Objective
//        Today, we are building on our knowledge of arrays by adding another dimension. Check out the Tutorial tab for learning materials and an instructional video.
//
//        Context
//        Given a  2D Array, :
//
//        1 1 1 0 0 0
//        0 1 0 0 0 0
//        1 1 1 0 0 0
//        0 0 0 0 0 0
//        0 0 0 0 0 0
//        0 0 0 0 0 0
//        We define an hourglass in  to be a subset of values with indices falling in this pattern in 's graphical representation:
//
//        a b c
//                d
//        e f g
//        There are  hourglasses in , and an hourglass sum is the sum of an hourglass' values.
//
//        Task
//        Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.
//
//                Example
//
//        In the array shown above, the maximum hourglass sum is  for the hourglass in the top left corner.
//
//                Input Format
//
//        There are  lines of input, where each line contains  space-separated integers that describe the 2D Array .
//
//                Constraints
//
//        Output Format
//
//        Print the maximum hourglass sum in .
//
//        Sample Input
//
//        1 1 1 0 0 0
//        0 1 0 0 0 0
//        1 1 1 0 0 0
//        0 0 2 4 4 0
//        0 0 0 2 0 0
//        0 0 1 2 4 0
//        Sample Output
//
//        19
//        Explanation
//
//        contains the following hourglasses:
//
//        1 1 1   1 1 0   1 0 0   0 0 0
//        1       0       0       0
//        1 1 1   1 1 0   1 0 0   0 0 0
//
//        0 1 0   1 0 0   0 0 0   0 0 0
//        1       1       0       0
//        0 0 2   0 2 4   2 4 4   4 4 0
//
//        1 1 1   1 1 0   1 0 0   0 0 0
//        0       2       4       4
//        0 0 0   0 0 2   0 2 0   2 0 0
//
//        0 0 2   0 2 4   2 4 4   4 4 0
//        0       0       2       0
//        0 0 1   0 1 2   1 2 4   2 4 0
//        The hourglass with the maximum sum () is:
//
//        2 4 4
//        2
//        1 2 4
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int max = Integer.MIN_VALUE;  //정수형 최소값
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){

                int sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];

                if(max < sum){
                    max = sum;
                }
            }

        }

        System.out.println(max);

        scanner.close();
    }
}




