package com.study.days;

import java.util.Scanner;

public class Two {

    public void test() {
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
}
