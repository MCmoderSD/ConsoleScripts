package scripts;

import java.util.Scanner;

public class Rechner extends Script {
    public Rechner() {

    }

    @Override
    public boolean execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Second Number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Operation: ");
        String operation = scanner.next();
        switch (operation) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "%":
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("This operation does not exist!");
                break;
        }
                return true;
        }
}

