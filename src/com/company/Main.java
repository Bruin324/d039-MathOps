package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a number");
        String num1 = userInput.next();

        System.out.println("Please enter another number");
        String num2 = userInput.next();

        double operand1 = Double.parseDouble(num1);
        double operand2 = Double.parseDouble(num2);

        double sum = operand1 + operand2;

        double difference = operand1 - operand2;

        double division = operand1/operand2;

        double multiplication = operand1 * operand2;

        double remainder = operand1 % operand2;

        showResults(operand1, operand2, sum, difference, division, multiplication, remainder);
    }

    public static void showResults(double operand1,
                                   double operand2,
                                   double sum,
                                   double difference,
                                   double division,
                                   double multiplication,
                                   double remainder) {
        System.out.println("The sum of " + operand1 + " and " + operand2 + " is " + sum);
        System.out.println("The difference between " + operand1 + " and " + operand2 + " is " + difference);
        System.out.println("The product of " + operand1 + " and " + operand2 + " is " + multiplication);
        System.out.println("The quotient of " + operand1 + " and " + operand2 + " is " + division);
        System.out.println("The remainder when dividing " + operand1 + " by " + operand2 + " is " + remainder);
    }
}
