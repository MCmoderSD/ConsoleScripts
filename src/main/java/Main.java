import scripts.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
    static int i = 1;
    static boolean found = false;

    public static void main(String[] args) {

        if (args.length == 0)
            try {
                Runtime.getRuntime().exec("cmd /c start \"\" java -jar ConsoleScripts.jar a");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        System.out.println("\nChoose a Script to run: \n");
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Script> scripts = new HashMap<>();
        scripts.put("Hello World", new HelloWorld());
        scripts.put("Name Alter", new NameAlter());
        scripts.put("Rechner", new Rechner());
        scripts.put("Kontostand", new Kontostand());

        scripts.keySet().forEach(item -> {
            System.out.println(i + ". " + item);
            i++;
        });


        String script = scanner.next();

        if (isNumeric(script)) {
            int integer = Integer.parseInt(script);
            i = 1;

            scripts.keySet().forEach(item -> {
                if (integer == i) {
                    scripts.get(item).execute();
                    found = true;
                }
                i++;
            });
            if (!found) {
                System.out.println("This Script does not exist!");
                main(args);
            }
        } else {
            Script script1 = scripts.get(script);

            if (script1 != null) {
                script1.execute();
            } else {
                System.out.println("This Script does not exist!");
                main(args);

            }
        }
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
