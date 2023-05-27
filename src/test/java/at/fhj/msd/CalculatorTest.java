package at.fhj.msd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public  class CalculatorTest {
    static Calculator calc;
    @BeforeAll
    static void setup() {
        calc = new Calculator();
    }
    @Test
    @DisplayName("Addition Testing")
    void testAdd(){
        double actual = calc.add(5, 3);
        assertEquals(8, actual);
    }
    @Test
    @DisplayName("Subtraction Testing")
    void testMinus(){
        double actual = calc.minus(5, 3);
        assertEquals(2, actual );
    }
    @Test
    @DisplayName("Multiplication Testing")
    void testMultiply(){
        double actual = calc.multiply(5, 3);
        assertEquals(15, actual );
    }
    @Test
    @DisplayName("Devide Testing")
    void testDevide(){
        double actual = calc.divide(15, 5);
        assertEquals(3, actual );
    }

    @Test
    @DisplayName("Devide by zero Testing")
    public void testDevideWithZero(){
        assertThrows(ArithmeticException.class,() -> {
            calc.divide(5,0);
        });
    }

    @Test
    @DisplayName("FactorialForZero test")
    public void testFactorialForZero(){
        Calculator cal = new Calculator();
        int num = 0;
        double actual = cal.factorial(num);
        assertEquals(1, actual, 0.0001);
    }

    @Test
    @DisplayName("FactorialForPositivNum test")
    public void testFactorialForPositiv(){
        Calculator cal = new Calculator();
        int num = 5;
        double actual = cal.factorial(num);
        assertEquals(120, actual, 0.0001);
    }
    @Test
    @DisplayName("FactorialForNegativNum test")
    public void testFactorialForNegativ(){
        Calculator cal = new Calculator();
        int num = -5;
        double actual = cal.factorial(num);
        assertEquals(0, actual, 0.0001);
    }



}
