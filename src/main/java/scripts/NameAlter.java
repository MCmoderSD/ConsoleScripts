package scripts;

import java.util.Scanner;

public class NameAlter extends Script {
    public NameAlter() {

    }

    @Override
    public boolean execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your Name: ");
        String name = scanner.nextLine();
        System.out.println("Your Age: ");
        int age = scanner.nextInt();
        System.out.println("Your Name is " + name + " and you are " + age + " years old.");
        return true;
    }
}
