package pizzashop;

public class Main {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();

        System.out.println("\n\n=== Ordering Cheese Pizza ===");
        Pizza pizza1 = store.orderPizza("cheese");

        System.out.println("\n=== Ordering Pepperoni Pizza ===");
        Pizza pizza2 = store.orderPizza("pepperoni");

        System.out.println("\n=== Ordering Veggie Pizza ===");
        Pizza pizza3 = store.orderPizza("veggie");
    }
}
