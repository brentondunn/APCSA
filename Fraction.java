public class Fraction {
    
    private int numerator;
    private int denominator;


    public Fraction(int n, int d) {
        numerator = n;
        denominator = d;
    }

    public int numerator() {
        return numerator;
    }

    public int denominator() {
        return denominator;
    }

    public String add() {
        //double fracTop = (double)(numerator1 * denominator2) + (numerator2 * denominator1);
        //return f.toString()

    }

    public String subtract() {

    }

    public String multiply() {

    }

    public String divide() {

    }

    public void test() {
        System.out.println(numerator1);
        System.out.println(denominator1);
        System.out.println(numerator2);
        System.out.println(denominator2);
    }

    public static void main(String[] args) {
        Fraction f = new Fraction(2, 5);
        //System.out.println(f.test());
        f.test();
        //System.out.println(f.add);
        System.out.println("Hello world");
    }
}


