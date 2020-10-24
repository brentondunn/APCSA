// Brenton Dunn
// 218005
// 29 October 2020

import java.util.Scanner;

public class Euclidean {
    public static void main(String[] args) {
        
        int remainder;

        // get user input for two numbers
        Scanner scan = new Scanner(System.in);
        System.out.print("Number 1: ");
        int num1 = scan.nextInt();
        System.out.print("Number 2: ");
        int num2 = scan.nextInt();
        
        // loops while neither num1 nor num2 == 0
        while (num1 != 0 && num2 != 0) {
            
            // checks to see which number is larger. The larger number becomes the dividend
            if (num1 > num2) {
                remainder = num1 % num2;
            } else {
                remainder = num2 % num1;
            }

            // num2 turns into num1 and num2 stores the remainder 
            num1 = num2;
            num2 = remainder;

            // prints the numbers each iteration
            System.out.println("\nThe numbers at this time are " + num1 + " and " + num2 + ".");
        }

        //final output
        System.out.println("The GCF is " + num1 + ".");
    }
}
