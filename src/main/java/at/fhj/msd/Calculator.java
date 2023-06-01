package at.fhj.msd;

public class Calculator {
    // Addition
    public double add(double num1, double num2){
        return num1 + num2;
    }
    //Subtraction
    public double minus(double num1, double num2){
        return num1 - num2;
    }
    //Division
    public double divide(double num1, double num2){
        double returnVal =  num1 / num2;
        if(Double.isNaN(returnVal) || Double.isInfinite(returnVal))
            throw new ArithmeticException("Division" + num1 + "/" + num2 + "isn't possible");

        return returnVal;
    }
    //Multiplication
    public double multiply(double num1, double num2){
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
