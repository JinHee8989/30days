package com.study.days;

import java.util.Scanner;

public class Two {

    public void test1() {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        if (N % 2 != 0) {
            System.out.print("Weird");
        } else {
            if (2 <= N && N < 6) {
                System.out.print("Not Weird");
            } else if (6 <= N && N < 21) {
                System.out.print("Weird");
            } else {
                System.out.print("Not Weird");
            }
        }
    }

    public void test2(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 1; i <=10; i++){
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }

        scanner.close();
    }



}
