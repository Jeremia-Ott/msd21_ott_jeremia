package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static Logger logger = LogManager.getLogger();

    public double add(double number1, double number2) {
        logDebug(number1, number2);
        return number1 + number2;
    }

    public double minus(double number1, double number2) {
        logDebug(number1, number2);
        return number1 - number2;
    }

    public double divide(double number1, double number2) {
        logDebug(number1, number2);
        if (number2 == 0){
            logger.error("Divide by 0");
            throw new ArithmeticException("Divide by 0");
        }
        return number1 / number2;
    }

    public double multiply(double number1, double number2) {
        logDebug(number1, number2);
        return number1 * number2;
    }

    public int faculty(int number) {
        logger.debug("number = " + number);
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

    private void logDebug(double number1, double number2){
        logger.debug("number1 = " + number1 + ", number2 = " + number2);
    }
}
