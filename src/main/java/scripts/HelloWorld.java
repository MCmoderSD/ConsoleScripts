package scripts;

public class HelloWorld extends Script {
    public HelloWorld() {

    }
    @Override
    public boolean execute() {
        System.out.println("Hello World!");
        return false;
    };
}
