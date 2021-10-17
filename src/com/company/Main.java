package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO: First home task;
//        String str = new String();
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("Guess the word to exit:)");
//            str = scanner.nextLine();
//            if (str.equals("Exit"))
//                break;
//        }
//    }
//}
        //TODO: Second home task, first solution;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter you number");
//        int x = scanner.nextInt();
//        int sum = 0;
//        if (x >= 0) {
//            for (int i = 0; i <= x; i++) {
//                sum += i;
//            }
//            System.out.println(String.format("The sum of all numbers from 0 to %d is %d", x, sum));
//        } else if (x < 0) {
//            for (int i = 0; i <= Math.abs(-x); i++) {
//                sum += i;
//            }
//            System.out.println(String.format("The sum of all numbers from 0 to %d is -%d", x, sum));
//        }
//    }
//}

        //TODO: Second home task, second solution(the most valuable solution);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter you number");
//        int x = scanner.nextInt();
//        int sum = 0;
//        for (int i = 0; i <= Math.abs(x); i++) {
//            sum += i;
//        }
//        if (x >= 0) {
//            System.out.println(String.format("The sum of all numbers from 0 to %d is %d", x, sum));
//        } else {
//            System.out.println(String.format("The sum of all numbers from 0 to %d is -%d", x, sum));
//        }
//    }
//}

//        //TODO: Second home task, third solution(here all numbers with "-" are counter as "+";
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter you number");
//        int x = scanner.nextInt();
//        int sum = 0;
//        for (int i = 0; i <= Math.abs(x); i++) {
//            sum += i;
//        }
//        System.out.println(String.format("The sum of all numbers from 0 to %d is %d", x, sum));
//    }
//}

        //TODO: Third home task;
//        System.out.println("Please enter your score: ");
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
//            }


        //TODO: Fourth home task;
          System.out.println("Please enter your channel");
          int canal = new Scanner(System.in).nextInt();
          String[][] canalNames = {
                {"ONT", "TNT", "Discovery" }
         };
          while (canal >= 4) {
            System.out.println("Please enter your channel");
            canal= new Scanner(System.in).nextInt();
          } if (canal == 3) {
                System.out.println(canalNames[0][0]);
                System.out.println("Choose one more channel");
                canal = new Scanner(System.in).nextInt();
         } else if (canal == 2) {
                System.out.println(canalNames[0][1]);
                System.out.println("Please enter your channel");
            canal = new Scanner(System.in).nextInt();
         } else if (canal == 1) {
                System.out.println(canalNames[0][2]);
                System.out.println("Please enter your channel");
            canal = new Scanner(System.in).nextInt();
         } else if (canal == 0) {
                System.out.println("Exit");}
    }
}
