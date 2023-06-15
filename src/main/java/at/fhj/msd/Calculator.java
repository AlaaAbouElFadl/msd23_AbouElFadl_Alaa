package at.fhj.msd;

/**
 * This class represents a Calculator that performs basic arithmetic operations.
 * It contains methods for addition, subtraction, division, multiplication and factorial.
 *
 * @author Alaa Abou El fadl
 */
public class Calculator {
    // Addition
    /**
     *Adds two numbers together.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The sum of the first number and second number.
     */

    public double add(double num1, double num2){
        Main.logger.debug("add() method called with the paraneters num1  and num2",num1, num2);
        return num1 + num2;
    }

    //Subtraction
    /**
     *Subtracts one number from another.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The first number minus the second number.
     */

    public double minus(double num1, double num2){
        Main.logger.debug("minus() method called with the paraneters num1  and num2",num1, num2);
        return num1 - num2;
    }


    //Division
    /**
     * Divides one number by another.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The first number divided by the second number.
     * @throws ArithmeticException if the division is not possible.
     */

    public double divide(double num1, double num2){
        double returnVal =  num1 / num2;
        if(Double.isNaN(returnVal) || Double.isInfinite(returnVal)) {
            String errorMessage = "Division\" + num1 + \"/\" + num2 + \"isn't possible";
            Main.logger.error(errorMessage);
            throw new ArithmeticException(errorMessage);
        }
        Main.logger.debug("device() method called with the paraneters num1  and num2", num1, num2);
        return returnVal;
    }

    //Multiplication
    /**
     * Multiply two numbers.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The first number multiplied to the second number.
     */
    public double multiply(double num1, double num2){
        Main.logger.debug("multiply() method called with the paraneters num1  and num2",num1, num2);
        return num1 * num2;
    }


    //Faculty

    /**
     * Faculty of one number.
     *
     * @param num A number.
     * @return The faculty of the number.
     */
    public long factorial(int num){
        if(num < 0) {
            return 0;
        }
        if (num == 0) {
            return 1;
        }
        long result = 1;
        for (int i = 1 ; i <= num ; i++) {
            result *= i;
        }
        return result;
    }


}
