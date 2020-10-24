// Brenton Dunn
// 218005
// 29 October 2020

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        
        int tempStore;
        int num1 = 1;
        int num2 = 1;
        String finalNum = "";
        
        // get user input for #
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int num = scan.nextInt();
        
        // loops and adds a new fibonacci # onto the end of the string each iteration
        for (int i=0; i < num; i++) {
            
            // if it is the 1st or 2nd iteration, the number 1 is is attached to the final string
            if (i < 2) {
                finalNum += " " + 1;
            } else {
                
                // adds each number onto the end of the string
                finalNum += " " + (num1 + num2);
                
                // num1 stores num2 and num2 stores num1 + num2
                tempStore = num1;
                num1 = num2;
                num2 += tempStore;
            }
        }

        // final output
        System.out.println("Fibonacci numbers:" + finalNum);
    }
}
