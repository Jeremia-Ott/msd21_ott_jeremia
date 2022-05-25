package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This Calculator implements basic math operations. Such as:
 * <p>
 * - add
 * - minus
 * - divide
 * - multiply
 * - faculty
 * </p>
 * @author Jeremia Ott
 */
public class Calculator {
    private static Logger logger = LogManager.getLogger();

    /**
     * Adds two numbers together.
     *
     * @param number1 the number before the operator
     * @param number2 the number after the operator
     * @return the value of two numbers added together
     */
    public double add(double number1, double number2) {
        logDebug(number1, number2);
        return number1 + number2;
    }

    /**
     * Subtracts one number with another number
     *
     * @param number1 the number before the operator
     * @param number2  the number after the operator
     * @return the value of two numbers that got subtracted
     */
    public double minus(double number1, double number2) {
        logDebug(number1, number2);
        return number1 - number2;
    }

    /**
     * Divides one number with another number
     *
     * @param number1 the number before the operator
     * @param number2  the number after the operator
     * @return the value of two numbers that got divided
     * @throws ArithmeticException gets thrown when number2 is 0
     */
    public double divide(double number1, double number2) {
        logDebug(number1, number2);
        if (number2 == 0){
            logger.error("Divide by 0");
            throw new ArithmeticException("Divide by 0");
        }
        return number1 / number2;
    }

    /**
     * Multiplies one number with another number
     *
     * @param number1 the number before the operator
     * @param number2  the number after the operator
     * @return the value of two numbers that got subtracted
     */
    public double multiply(double number1, double number2) {
        logDebug(number1, number2);
        return number1 * number2;
    }


    /**
     * Calculates the value of a faculty
     *
     * @param number the size of the faculty that gets calculated
     * @return the value of two numbers that got subtracted
     */
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
