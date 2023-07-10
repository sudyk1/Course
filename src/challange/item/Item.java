package challange.item;

public class Item {

    private static int numItems = 0;
    private final int ID;

    public Item(int id) {
        ID = id;
    }

    public static int getNextId() {
        return Item.numItems++;
    }

    public static Item getItem() {
        return new Item(Item.getNextId());
    }

    public static void printNumItems() {
        System.out.println("Num items: " + Item.numItems);
    }

    public void printId() {
        System.out.println("Item ID: " + this.ID);
    }



}
