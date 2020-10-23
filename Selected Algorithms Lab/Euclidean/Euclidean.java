// Brenton Dunn
// 218005
// 29 October 2020

import java.util.Scanner;

public class Euclidean {
    public static void main(String[] args) {
        
        int temp;

        Scanner scan = new Scanner(System.in);
        System.out.println("Number1: ");
        int num1 = scan.nextInt();
        System.out.println("Number2: ");
        int num2 = scan.nextInt();
        
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                temp = num1 % num2;
            } else {
                temp = num2 % num1;
            }

            num1 = num2;
            num2 = temp;
        }
        System.out.println("The GCF is " + num1);
    }
}
