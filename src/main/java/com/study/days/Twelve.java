package com.study.days;

import java.util.Scanner;

public class Twelve {


    public void test() {
        //    Objective
//    Today, we're getting started with Exceptions by learning how to parse an integer from a string and print a custom error message. Check out the Tutorial tab for learning materials and an instructional video!
//
//    Task
//    Read a string, , and print its integer value; if  cannot be converted to an integer, print Bad String.
//
//    Note: You must use the String-to-Integer and exception handling constructs built into your submission language. If you attempt to use loops/conditional statements, you will get a  score.
//
//    Input Format
//
//    A single string, .
//
//    Constraints
//
//, where  is the length of string .
//    is composed of either lowercase letters () or decimal digits ().
//    Output Format
//
//    Print the parsed integer value of , or Bad String if  cannot be converted to an integer.
//
//    Sample Input 0
//
//            3
//    Sample Output 0
//
//            3
//    Sample Input 1
//
//    za
//    Sample Output 1
//
//    Bad String
//    Explanation
//
//    Sample Case  contains an integer, so it should not raise an exception when we attempt to convert it to an integer. Thus, we print the .
//    Sample Case  does not contain any integers, so an attempt to convert it to an integer will raise an exception. Thus, our exception handler prints Bad String.
//
        Scanner in = new Scanner(System.in);
        String S = in.next();

        try {
            int i = Integer.valueOf(S);
            System.out.print(i);

        } catch (Exception e) {
            System.out.print("Bad String");
        }

    }


//
//    Objective
//    Yesterday's challenge taught you to manage exceptional situations by using try and catch blocks. In today's challenge, you will practice throwing and propagating an exception. Check out the Tutorial tab for learning materials and an instructional video.
//
//    Task
//    Write a Calculator class with a single method: int power(int,int). The power method takes two integers,  and , as parameters and returns the integer result of . If either  or  is negative, then the method must throw an exception with the message: n and p should be non-negative.
//
//            Note: Do not use an access modifier (e.g.: public) in the declaration for your Calculator class.
//
//    Input Format
//
//    Input from stdin is handled for you by the locked stub code in your editor. The first line contains an integer, , the number of test cases. Each of the  subsequent lines describes a test case in  space-separated integers that denote  and , respectively.
//
//            Constraints
//
//    No Test Case will result in overflow for correctly written code.
//            Output Format
//
//    Output to stdout is handled for you by the locked stub code in your editor. There are  lines of output, where each line contains the result of  as calculated by your Calculator class' power method.
//
//    Sample Input
//
//4
//        3 5
//        2 4
//        -1 -2
//        -1 3
//    Sample Output
//
//243
//        16
//    n and p should be non-negative
//    n and p should be non-negative
//            Explanation
//
//
//:  and  are positive, so power returns the result of , which is .
//:  and  are positive, so power returns the result of =, which is .
//            : Both inputs ( and ) are negative, so power throws an exception and  is printed.
//            : One of the inputs () is negative, so power throws an exception and  is printed.



    class Calculator{

        public int power(int n, int p) throws Exception {

            int result = 1;
            if(n >= 0 && p >= 0){
                for(int i = 0; i < p; i++){

                    result *= n;
                }
            }else{
                throw new Exception("n and p should be non-negative");
            }
            return result;
        }

    }

    class Solution{

        public void test2(){

            Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            while (t-- > 0) {

                int n = in.nextInt();
                int p = in.nextInt();
                Calculator myCalculator = new Calculator();
                try {
                    int ans = myCalculator.power(n, p);
                    System.out.println(ans);
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            in.close();
        }
    }



}
