///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           BetterExamScores
// Course:          CS 200, Summer 2024, Jim Williams
//
// Author:          Teresa Campbell
// Email:           tjcampbe@wisc.edu
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// None
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////


import java.util.Scanner;

/**
 * This class contains a method to input numerical values representing exam scores
 * into two arrays and print the better scores for each exam.
 */

public class BetterExamScores {

    /**
     * Method to print the better scores for each exam based on two attempts.
     *
     * @param attempts1 First array of exam scores.
     * @param attempts2 Second array of exam scores.
     */
    public static void printBetterScores(int[] attempts1, int [] attempts2){
       System.out.print("Exam 1: ");
       if (attempts1[0] > attempts2[0]) {
           System.out.println(attempts1[0]);
       } else {
           System.out.println(attempts2[0]);

       }

       System.out.print("Exam 2: ");
       if (attempts1[1] > attempts2[1]) {
           System.out.println(attempts1[1]);
       } else {
           System.out.println(attempts2[1]);
       }


       System.out.print("Exam 3: ");
       if (attempts1[2] > attempts2[2]) {
           System.out.println(attempts1[2]);
       } else {
           System.out.println(attempts2[2]);
       }


       System.out.print("Exam 4: ");
       if (attempts1[3] > attempts2[3]) {
           System.out.println(attempts1[3]);
       } else {
           System.out.println(attempts2[3]);
       }
    }

/**
 * Main method to read exam scores from user input and determine the better
 * scores for each exam based on two attempts.
 *
 * The method initializes two arrays to store scores from two attempts for
 * four exams. It prompts the user to enter scores for each attempt, then
 * calls the printBetterScores method to print the better score for each exam.
 *
 * @param args Command-line arguments (not used in this implementation).
 * */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_VALUES = 4;
        int[] firstAttempts = new int[NUM_VALUES];
        int[] secondAttempts = new int[NUM_VALUES];

        // Input scores into arrays

        for (int i = 0; i < firstAttempts.length; i++) {
//            System.out.println("Please enter firstAttempt scores");
            firstAttempts[i] = scnr.nextInt();
        }
        for (int i = 0; i < secondAttempts.length; i++) {
//            System.out.println("Please enter secondAttempt scores");
            secondAttempts[i] = scnr.nextInt();
        }

        // Calls your implementation of printBetterScores method
        printBetterScores(firstAttempts, secondAttempts);

    }
}
