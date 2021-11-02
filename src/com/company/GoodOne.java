package com.company;

import java.util.Scanner;

public class GoodOne {
    public static void main(String[] args) {
        System.out.println("Please enter your channel");
        int canal = new Scanner(System.in).nextInt();
        String[][] canalNames = {
                {"ONT", "TNT", "Discovery"}};
        while (canal != 0) {
            System.out.println("Please enter your channel");
            canal = new Scanner(System.in).nextInt();
            switch (canal) {
                case 1:
                    for (String[] canalName : canalNames) {
                        System.out.println(canalNames[0][2]);
                        canal = new Scanner(System.in).nextInt();
                    }
                case 2:
                    for (String[] canalName : canalNames) {
                        System.out.println(canalNames[0][1]);
                        canal = new Scanner(System.in).nextInt();
                    }
                case 3:
                    for (String[] canalName : canalNames) {
                        System.out.println(canalNames[0][0]);
                        canal = new Scanner(System.in).nextInt();
                    }
                default:
                    break;
            }
            if (canal == 0) {
                System.out.println("Thank you, goodbye!");
            }
        }
    }
}
//    System.out.println("Please enter your score: ");
//        int score = new Scanner(System.in).nextInt();
//        while (score < 0 || score >= 101) {
//            System.out.println("Please enter your score: ");
//            score = new Scanner(System.in).nextInt();
//        } if (score > 90 && score <= 100) {
//                System.out.println("Your Grade is A, Excellent,buddy!");
//            } else if (score > 80 && score <= 90) {
//                System.out.println("Your Grade is B, it's Good, buddy!");
//            } else if (score > 70 && score <= 80) {
//                System.out.println("Your Grade is C");
//            } else if (score > 60 && score <= 70) {
//                System.out.println("Your Grade is F");
//            }  else if (score > 50 && score <= 60) {
//                System.out.println("Your Grade is E");
//            } else if (score >= 0 && score <= 50) {
//                System.out.println("You Failed the exam, please try again later");

