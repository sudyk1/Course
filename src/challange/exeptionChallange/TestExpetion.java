package challange.exeptionChallange;

public class TestExpetion extends Exception {
    public TestExpetion() {
        super("My TestExeption happend.");
    }

    public TestExpetion(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "TestExpetion{}";
    }
}
