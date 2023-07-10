package challange.generics_exercies.square;



public class Main {
    public static void main(String[] args) {
        Square<Integer> square = new Square<>(10);
        System.out.println(square.getSurfaceArea());
        System.out.println("\n");

        Square<Float> square1 = new Square<>(5.7f);
        System.out.println(square1.getSurfaceArea());

    }
}
