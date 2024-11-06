public class Basket {
    private static String items = " ";

    public static void main(String[] args) {
    }

    public static void add(String name, int price) {
        if (items.isEmpty()) {
            items += name + " - " + price;
        } else {
            items += "\n" + name + " - " + price;
        }
    }

    public static void clear() {
        items = "";
    }

    public static void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста!");
        } else {
            System.out.println(items);
        }
    }
}