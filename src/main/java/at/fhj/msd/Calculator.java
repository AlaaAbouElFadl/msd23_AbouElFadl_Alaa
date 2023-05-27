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

     public double factorial(int num) {
        return 0;
    }




    





}
