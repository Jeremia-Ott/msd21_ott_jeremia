package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void simpleAddTest() {
        Assertions.assertEquals(20, calculator.add(15, 5));
    }

    @Test
    public void conversionAddTest() {
        double value1 = 3;
        double value2 = -5;
        var result = value1 + value2;
        Assertions.assertEquals(result, calculator.add(value1, value2));
    }

    @Test
    public void simpleMinusTest() {
        Assertions.assertEquals(-7, calculator.minus(13, 20));
    }

    @Test
    public void conversionMinusTest() {
        double value1 = 1;
        double value2 = -20;
        var result = value1 - value2;
        Assertions.assertEquals(result, calculator.minus(value1, value2));
    }

    @Test
    public void simpleDivideTest() {
        Assertions.assertEquals(6, calculator.divide(30, 5));
    }

    @Test
    public void conversionDivideTest() {
        double value1 = -99;
        double value2 = -6;
        var result = value1 / value2;
        Assertions.assertEquals(result, calculator.divide(value1, value2));
    }

    @Test
    public void simpleMultiplyTest() {
        Assertions.assertEquals(2, calculator.multiply(1, 2));
    }

    @Test
    public void conversionMultiplyTest() {
        double value1 = -11;
        double value2 = -7;
        var result = value1 * value2;
        Assertions.assertEquals(result, calculator.multiply(value1, value2));
    }
}
