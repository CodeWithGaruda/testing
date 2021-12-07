package lamdaExpressions;

public class GreetingImplementation implements Greeting {
    @Override
    public void perform() {
        System.out.println("hello this is perform method calling form implemetation of greeting interface");
    }
}
