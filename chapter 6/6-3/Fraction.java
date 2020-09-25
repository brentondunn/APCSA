/*
name: Brenton Dunn and Aman Kumar
ID #: 218005 and 218xxx
date of completion: 24/08/2020
*/

public class Fraction {

    // instance variables 
    private int numerator;
    private int denominator;

    // constructor method 
    public Fraction(int n, int d) {
        numerator = n;
        denominator = d;
    }

    // accessor method 
    public int getNumerator() {
        return numerator;
    }
    
    // accessor method
    public int getDenominator() {
        return denominator;
    }

    // method that adds two fractions
    public String add(Fraction fraction2) {
        int top = (numerator * fraction2.getDenominator()) + (fraction2.getNumerator() * denominator);
        int bottom = denominator * fraction2.getDenominator();
        int commonNumber = simplify(top, bottom);
        top /= commonNumber;
        bottom /= commonNumber;
        String strTop = Integer.toString(top);
        String strBottom = Integer.toString(bottom);
        return strTop + '/' + strBottom;
    }
    
    // method that subtracts two fractions
    public String subtract(Fraction fraction2) {
        int top = (numerator * fraction2.getDenominator()) - (fraction2.getNumerator() * denominator);
        int bottom = denominator * fraction2.getDenominator();
        int commonNumber = simplify(top, bottom);
        top /= commonNumber;
        bottom /= commonNumber;
        String strTop = Integer.toString(top);
        String strBottom = Integer.toString(bottom);
        return strTop + '/' + strBottom;
    }

    // method that multiplies two fractions
    public String multiply(Fraction fraction2) {
        int top = numerator * fraction2.getNumerator();
        int bottom = denominator * fraction2.getDenominator();
        int commonNumber = simplify(top, bottom);
        top /= commonNumber;
        bottom /= commonNumber;
        String strTop = Integer.toString(top);
        String strBottom = Integer.toString(bottom);
        return strTop + '/' + strBottom;
    }

    // method that divides two fractions
    public String divide(Fraction fraction2) {
        int top = numerator * fraction2.getDenominator();
        int bottom = denominator * fraction2.getNumerator();
        int commonNumber = simplify(top, bottom);
        top /= commonNumber;
        bottom /= commonNumber;
        String strTop = Integer.toString(top);
        String strBottom = Integer.toString(bottom);
        return strTop + '/' + strBottom;
    }

    // pg 228 citical thinking extra credit
    // brute force
    // for loop starts at 1 since 1 is the defaulf GCD
    // checks if number i devides evenly into both numerator and denominator
    // if it does, then it is stored in gcd then moves on to see if there is a higher one
    // if not, then i increases by 1 and it tests again 
    public int simplify(int n, int d) {
        int gcd = 1;
        for (int i = 1; i <= n && i <= d; i++) {
            if (n % i == 0 && d % i == 0) {
                gcd = i;
            } 
        }
        return gcd;
    }
}
