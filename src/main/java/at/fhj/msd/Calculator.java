package at.fhj.msd;

public class Calculator {
    public double add(double number1, double number2) {
        return number1 + number2;
    }

    public double minus(double number1, double number2) {
        return number1 - number2;
    }

    public double divide(double number1, double number2) {
        return number1 / number2;
    }

    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public int faculty(int number) {
        // negative numbers
        if (number < 0)
            return 0;

        // Base cases
        if (number == 0 || number == 1)
            return 1;

        int result = 1;
        for (; number > 1; number--){
            result *= number;
        }
        return result;
    }
}
