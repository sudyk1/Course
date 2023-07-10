package challange.exeptionChallange;

public class Main {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;
        } catch (ArithmeticException e ) {
            e.printStackTrace();
        } finally {
            System.out.println("Finllay code block executed.");
        }

        try {
            if (1 == 1) throw new TestExpetion();
        } catch (TestExpetion e) {
            e.printStackTrace();
        }



    }
}
