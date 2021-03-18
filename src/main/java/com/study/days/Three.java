package com.study.days;

import java.util.Scanner;

public class Three {

    public void test() {
//        Objective
//        Today we will expand our knowledge of strings, combining it with what we have already learned about loops. Check out the Tutorial tab for learning materials and an instructional video.
//
//        Task
//        Given a string, , of length  that is indexed from  to , print its even-indexed and odd-indexed characters as  space-separated strings on a single line (see the Sample below for more detail).
//
//        Note:  is considered to be an even index.
//
//                Example
//
//
//        Print abc def
//
//        Input Format
//
//        The first line contains an integer,  (the number of test cases).
//        Each line  of the  subsequent lines contain a string, .
//
//        Constraints
//
//        Output Format
//
//        For each String  (where ), print 's even-indexed characters, followed by a space, followed by 's odd-indexed characters.
//
//                Sample Input
//
//        2
//        Hacker
//                Rank
//        Sample Output
//
//        Hce akr
//        Rn ak
//        Explanation
//
//        Test Case 0:
//
//
//
//
//
//
//        The even indices are , , and , and the odd indices are , , and . We then print a single line of  space-separated strings; the first string contains the ordered characters from 's even indices (), and the second string contains the ordered characters from 's odd indices ().
//
//                Test Case 1:
//
//
//
//
//        The even indices are  and , and the odd indices are  and . We then print a single line of  space-separated strings; the first string contains the ordered characters from 's even indices (), and the second string contains the ordered characters from 's odd indices ().
//


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s1 = "";

        for(int i = 0; i < n; i++){
            // System.out.println(i);
            s1 = sc.nextLine();
            String c1 = "";
            String c2 = "";

            for(int j=0; j<s1.length(); j++){

                if(j%2==0){
                    c1 = c1+s1.charAt(j);

                }else{
                    c2 = c2+s1.charAt(j);
                }


            }
            System.out.println(c1 + " " + c2);
        }



    }
}
