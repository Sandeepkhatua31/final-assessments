package com.calculator.simplilearn;
import java.util.Scanner;
public class calculator {
public static void main(String[] args) {

    double number1;
    double number2; 
    double result ;
    char operator;

   
    Scanner input = new Scanner(System.in);

    
    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

   
    System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Enter second number");
    number2 = input.nextDouble();

    switch (operator) {

     
    case '+': result = number1 + number2;
    break;
 case '-': result = number1 - number2;
    break;
 case '*': result = number1 * number2;
    break;
 case '/': result = number1 / number2;
    break;
      default:
        System.out.println("Invalid operator!");
        return;
    }
    System.out.println("\nThe result is :\n");
    System.out.println(number1 + " " + operator + " " + number2 + " = " + result );
}
}

   

