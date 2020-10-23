// Brenton Dunn
// 218005
// 29 October 2020

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number: ");
        int num = scan.nextInt();
        
        int tempStore;
        int num1 = 1;
        int num2 = 1;
        String finalNum = "";
        
        for (int i=0; i < num; i++) {
            if (i < 2) {
                finalNum += " " + 1;
            } else {
                finalNum += " " + (num1 + num2);
                tempStore = num1;
                num1 = num2;
                num2 += tempStore;
            }
        }
        System.out.println(finalNum);
    }
}
