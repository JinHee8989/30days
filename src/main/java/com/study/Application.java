package com.study;

import com.study.days.Four;
import com.study.days.One;
import com.study.days.Three;
import com.study.days.Two;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
//        One one = new One();
//        one.test1();
//
        Two two = new Two();
//        two.test1();
        two.test2();

        Three three = new Three();
        three.test();

        Four four = new Four();
        four.test();


    }
}
