package com.study.days;

import java.util.Scanner;

public class Eight {

    public void test(){
//        Objective
//        Today, we're delving into Inheritance. Check out the attached tutorial for learning materials and an instructional video.
//
//        Task
//        You are given two classes, Person and Student, where Person is the base class and Student is the derived class. Completed code for Person and a declaration for Student are provided for you in the editor. Observe that Student inherits all the properties of Person.
//
//                Complete the Student class by writing the following:
//
//        A Student class constructor, which has  parameters:
//        A string, .
//        A string, .
//        An integer, .
//        An integer array (or vector) of test scores, .
//        A char calculate() method that calculates a Student object's average and returns the grade character representative of their calculated average:
//        Grading.png
//
//        Input Format
//
//        The locked stub code in the editor reads the input and calls the Student class constructor with the necessary arguments. It also calls the calculate method which takes no arguments.
//
//        The first line contains , , and , separated by a space. The second line contains the number of test scores. The third line of space-separated integers describes .
//
//        Constraints
//
//        Output Format
//
//        Output is handled by the locked stub code. Your output will be correct if your Student class constructor and calculate() method are properly implemented.
//
//        Sample Input
//
//        Heraldo Memelli 8135627
//        2
//        100 80
//        Sample Output
//
//        Name: Memelli, Heraldo
//        ID: 8135627
//        Grade: O
//                Explanation
//
//        This student had  scores to average:  and . The student's average grade is . An average grade of  corresponds to the letter grade , so the calculate() method should return the character'O'.
//

        class Person {
            protected String firstName;
            protected String lastName;
            protected int idNumber;

            // Constructor
            Person(String firstName, String lastName, int identification){
                this.firstName = firstName;
                this.lastName = lastName;
                this.idNumber = identification;
            }

            // Print person data
            public void printPerson(){
                System.out.println(
                        "Name: " + lastName + ", " + firstName
                                + 	"\nID: " + idNumber);
            }

        }

        class Student extends Person{

            private int[] testScores;


            Student(String firstName, String lastName, int idNumber, int[] scores){

                super(firstName,lastName,idNumber);
                this.testScores = scores;

            }


            public char calculate(){

                int sum = 0;
                for(int i = 0; i < testScores.length; i++){
                    sum += testScores[i];
                }

                int result = sum/testScores.length;

                if(result>=90){
                    return 'O';
                }else if(result >= 80 && result < 90){
                    return 'E';
                }else if(result >= 70 && result < 80){
                    return 'A';
                }else if(result >= 55 && result < 70){
                    return 'P';
                }else if(result >= 40 && result < 55){
                    return 'D';
                }else{
                    return 'T';
                }

            }


        }


        class Solution {
            public void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                String firstName = scan.next();
                String lastName = scan.next();
                int id = scan.nextInt();
                int numScores = scan.nextInt();
                int[] testScores = new int[numScores];
                for(int i = 0; i < numScores; i++){
                    testScores[i] = scan.nextInt();
                }
                scan.close();

                Student s = new Student(firstName, lastName, id, testScores);
                s.printPerson();
                System.out.println("Grade: " + s.calculate() );
            }
        }




    }
}
