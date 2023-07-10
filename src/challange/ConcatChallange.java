package challange;

public class ConcatChallange {
    public static void main(String[] args) {

        String[] names = {"Adam", "Konrad", "Dawid", "Jan"};

        String name = "";
        for (String s : names) {
            name += s + " ";
        }
        System.out.println(name.trim());

    }
}
