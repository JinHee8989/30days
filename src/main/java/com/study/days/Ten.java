package com.study.days;

import java.util.Scanner;

public class Ten {

//        Objective
//        Today we're discussing scope. Check out the Tutorial tab for learning materials and an instructional video!
//
//        The absolute difference between two integers,  and , is written as . The maximum absolute difference between two integers in a set of positive integers, , is the largest absolute difference between any two integers in .
//
//        The Difference class is started for you in the editor. It has a private integer array () for storing  non-negative integers, and a public integer () for storing the maximum absolute difference.
//
//                Task
//        Complete the Difference class by writing the following:
//
//        A class constructor that takes an array of integers as a parameter and saves it to the  instance variable.
//        A computeDifference method that finds the maximum absolute difference between any  numbers in  and stores it in the  instance variable.
//        Input Format
//
//        You are not responsible for reading any input from stdin. The locked Solution class in the editor reads in  lines of input. The first line contains , the size of the elements array. The second line has  space-separated integers that describe the  array.
//
//                Constraints
//
//                , where
//        Output Format
//
//        You are not responsible for printing any output; the Solution class will print the value of the  instance variable.
//
//        Sample Input
//
//        STDIN   Function
//        -----   --------
//                3       __elements[] size N = 3
//        1 2 5   __elements = [1, 2, 5]
//        Sample Output
//
//        4
//        Explanation
//
//        The scope of the  array and  integer is the entire class instance. The class constructor saves the argument passed to the constructor as the  instance variable (where the computeDifference method can access it).
//
//        To find the maximum difference, computeDifference checks each element in the array and finds the maximum difference between any  elements:
//
//
//        The maximum of these differences is , so it saves the value  as the  instance variable. The locked stub code in the editor then prints the value stored as , which is .


    private int[] elements;
    public int maximumDifference;

    // Add your code here
    Ten(int[] a) {
        this.elements = a;
    }

    public void computeDifference() {
        int max = elements[0];
        int min = elements[0];

        for (int i = 0; i < elements.length; i++) {
            if (max < elements[i]) {
                max = elements[i];
            } else if (min > elements[i]) {
                min = elements[i];
            }
        }

        maximumDifference = max - min;

    }

} // End of Difference class

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Ten difference = new Ten(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}


