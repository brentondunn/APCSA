/*
name: Brenton Dunn and Aman Kumar
ID #: 218005 and 218xxx
date of completion: 24/08/2020
*/

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int n, int d) {
        numerator = n;
        denominator = d;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public String add(Fraction fraction2) {
        int top = (numerator * fraction2.getDenominator()) + (fraction2.getNumerator() * denominator);
        int bottom = denominator * fraction2.getDenominator();
        String strTop = Integer.toString(top);
        String strBottom = Integer.toString(bottom);
        return strTop + '/' + strBottom;
    }

    public String subtract(Fraction fraction2) {
        int top = (numerator * fraction2.getDenominator()) - (fraction2.getNumerator() * denominator);
        int bottom = denominator * fraction2.getDenominator();
        String strTop = Integer.toString(top);
        String strBottom = Integer.toString(bottom);
        return strTop + '/' + strBottom;
    }

    public String multiply(Fraction fraction2) {
        int top = numerator * fraction2.getNumerator();
        int bottom = denominator * fraction2.getDenominator();
        String strTop = Integer.toString(top);
        String strBottom = Integer.toString(bottom);
        return strTop + '/' + strBottom;
    }

    public String divide(Fraction fraction2) {
        int top = numerator * fraction2.getDenominator();
        int bottom = denominator * fraction2.getNumerator();
        String strTop = Integer.toString(top);
        String strBottom = Integer.toString(bottom);
        return strTop + '/' + strBottom;
    }

    public static void main(String[] args) {
        //raction f = new Fraction(2, 5);
        //Fraction g = new Fraction(4, 3);
        //System.out.println(f.add(g));
        //System.out.println("hello world");
    }
}