package com.company;

import java.util.Scanner;

public class NewMain {
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
                        canal = new Scanner(System.in).nextInt();}
                case 2:
                    for (String[] canalName : canalNames) {
                        System.out.println(canalNames[0][1]);
                        canal = new Scanner(System.in).nextInt();}
                case 3:
                    for (String[] canalName : canalNames) {
                        System.out.println(canalNames[0][0]);
                        canal = new Scanner(System.in).nextInt();}
                default:
                    break;
            } if (canal == 0) {
                System.out.println("Thank you, goodbye!");}
        }
    }
}
