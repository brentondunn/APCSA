// Brenton Dunn
// 218005
// 29 October 2020

import java.util.Scanner;

public class Pi {
    public static void main(String[] args) {

        int denominator = 1;
        double finalNum = 0;

        // get user input on # of iterations
        Scanner number = new Scanner(System.in);
        System.out.print("How many iterations would you like? ");
        int iterations = number.nextInt();
        
        // iterates the specified # of times
        for (int i=0; i < iterations; i++) {
            
            // decides whether to add or subtract the number by looking at the number of times it has already iterated 
            if (i % 2 == 0) {
                finalNum += 1 / (double) denominator;
            } else {
                finalNum -= 1/ (double) denominator;
            }

            // prints the numbere each iteration
            System.out.println(finalNum * 4);

            // adds 2 to the denominator each iteration
            denominator += 2;
        }        
    }
}
