import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number :");
        double num1 = scanner.nextDouble();

        System.out.println("Enter any operator (+, -, *, /) :");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter the second number :");
        double num2 = scanner.nextDouble();

        double result = 0;
                boolean validCalculus = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.print("Division by 0 is not allowed");
                    validCalculus = false;
                }
                break;
            default:
                System.out.print("Error: invalid operator");
                validCalculus = false;

        }

        if (validCalculus) {
            System.out.print("the result is " + result);
        }

        scanner.close();

    }

}
