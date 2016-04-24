package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        for(int row = 0; row < n; row++) {
            String line = "";
            for(int space = n-1; space > row; space--) {
                line += " ";
            }

            for(int star = 0; star <= row; star++){
                line += "* ";
            }

            System.out.println(line);
        }

       // for (int i = 1; i <= n; i+=2) {
         //   for (int space = n; space >= i; space--) {
           //     System.out.print(" ");
            //}

//            for (int star = 1; star <= i; star++) {
  //              System.out.print("*");
    //            System.out.print(" ");
      //      }
        //    System.out.println();
//        }
    }
//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {

    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {

    }
}
