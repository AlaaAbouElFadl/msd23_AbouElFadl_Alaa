package at.fhj.msd;

public class Calculator {
    // Addition
    public double add(double num1, double num2){
        Main.logger.debug("add() method called with the paraneters num1  and num2",num1, num2);
        return num1 + num2;
    }
    //Subtraction
    public double minus(double num1, double num2){
        Main.logger.debug("minus() method called with the paraneters num1  and num2",num1, num2);
        return num1 - num2;
    }
    //Division
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
    public double multiply(double num1, double num2){
        Main.logger.debug("multiply() method called with the paraneters num1  and num2",num1, num2);
        return num1 * num2;
    }


    //Faculty
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
