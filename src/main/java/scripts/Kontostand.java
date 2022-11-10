package scripts;

import java.util.Scanner;

public class Kontostand extends Script {
    public Kontostand() {

    }

    @Override
    public boolean execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your Account Balance: ");
        double balance = scanner.nextDouble();

        if (balance < 0) {
            System.out.println(name + " your Account Balance is " + balance + "€," + " you are in debt!");
        } else if (balance == 0) {
            System.out.println(name + " Your Account Balance is 0!" + " You are just broke!");
        } else {
            System.out.println(name + " your Account Balance is positive!" + " You are rich!");
        }
        return true;
    }
}
