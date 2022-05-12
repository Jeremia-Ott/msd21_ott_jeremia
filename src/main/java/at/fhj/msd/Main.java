package at.fhj.msd;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double numAdd = calculator.add(6, 2);
        double numMinus = calculator.minus(6, 2);
        double numDivide = calculator.divide(6, 2);
        double numMultiply = calculator.multiply(6, 2);

        System.out.println("6 + 2 = " + numAdd);
        System.out.println("6 - 2 = " + numMinus);
        System.out.println("6 / 2 = " + numDivide);
        System.out.println("6 * 2 = " + numMultiply);
    }
}
