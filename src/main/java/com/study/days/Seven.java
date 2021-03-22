package com.study.days;

import java.util.Scanner;

public class Seven {
    public void test() {

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





