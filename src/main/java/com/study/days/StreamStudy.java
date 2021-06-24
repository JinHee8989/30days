package com.study.days;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class StreamStudy {

    public void test(){

        System.out.println("배열이 될 글자 아무거나 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        String tempChar = sc.nextLine().replace(" ","a");

        String[] strArr = new String[tempChar.length()-1];
        for(int i = 0; i < tempChar.length(); i++){
            strArr[i] = String.valueOf(tempChar.charAt(i));
        }

        //배열 스트림
        Stream<String> stream = Arrays.stream(strArr);
        System.out.println("stream = " + stream);

        //부분 스트림
        Stream<String> partSt= Arrays.stream(strArr,1,2);

//        System.out.println("partSt = " + partSt);


    }

}
