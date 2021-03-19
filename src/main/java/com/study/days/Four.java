package com.study.days;

import java.util.Scanner;

public class Four {


    public void test() {

//        Objective
//        Today, we will learn about the Array data structure. Check out the Tutorial tab for learning materials and an instructional video.
//
//        Task
//        Given an array, , of  integers, print 's elements in reverse order as a single line of space-separated numbers.
//
//        Example
//
//
//        Print 4 3 2 1. Each integer is separated by one space.
//
//                Input Format
//
//        The first line contains an integer,  (the size of our array).
//        The second line contains  space-separated integers that describe array 's elements.
//
//        Constraints
//
//                Constraints
//
//, where  is the  integer in the array.
//                Output Format
//
//        Print the elements of array  in reverse order as a single line of space-separated numbers.
//
//                Sample Input
//
//        4
//        1 4 3 2
//        Sample Output
//
//        2 3 4 1


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        String result = "";

        for(int i=n-1; i>-1; i-- ){
            if(i!=0){
                result += arr[i]+" ";
            }else{
                result += arr[i];
            }
        }

        System.out.println(result);
        scanner.close();
    }

}
