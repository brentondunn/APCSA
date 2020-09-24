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
        String strTop = Integer.toString(top);
        String strBottom = Integer.toString(bottom);
        return strTop + '/' + strBottom;
    }
    
    // method that subtracts two fractions
    public String subtract(Fraction fraction2) {
        int top = (numerator * fraction2.getDenominator()) - (fraction2.getNumerator() * denominator);
        int bottom = denominator * fraction2.getDenominator();
        String strTop = Integer.toString(top);
        String strBottom = Integer.toString(bottom);
        return strTop + '/' + strBottom;
    }

    // method that multiplies two fractions
    public String multiply(Fraction fraction2) {
        int top = numerator * fraction2.getNumerator();
        int bottom = denominator * fraction2.getDenominator();
        String strTop = Integer.toString(top);
        String strBottom = Integer.toString(bottom);
        return strTop + '/' + strBottom;
    }

    // method that divides two fractions
    public String divide(Fraction fraction2) {
        int top = numerator * fraction2.getDenominator();
        int bottom = denominator * fraction2.getNumerator();
        String strTop = Integer.toString(top);
        String strBottom = Integer.toString(bottom);
        return strTop + '/' + strBottom;
    }    
}
