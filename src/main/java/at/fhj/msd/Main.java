package at.fhj.msd;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double num1 = 7.0;
        double num2 = 3.0;

        double addResult = calculator.add(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + addResult);

        double subtractResult = calculator.minus(num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + subtractResult);

        double multiplyResult = calculator.multiply(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + multiplyResult);

        double divideResult = calculator.divide(num1, num2);
        System.out.println(num1 + " / " + num2 + " = " + divideResult);

        int factNum = 4;
        double factorialResult = calculator.factorial(factNum);
        System.out.println(factNum + "! =" + factorialResult);

    }



}