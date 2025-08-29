
package pizzashop;

public class Main {
    public static void main(String[] args) {

        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        System.out.println("=== Ordering Clam Pizza ===");
        Pizza pizza = store.orderPizza("clam");
        System.out.println("\n\n END \n\n");

        System.out.println("=== Ordering Pepperoni Pizza ===");
        Pizza pizza2 = store.orderPizza("pepperoni");
        System.out.println("\n\n END \n\n");

        System.out.println("=== Ordering Cheese Pizza ===");
        Pizza pizza3 = store.orderPizza("cheese");
        System.out.println("\n\n END \n\n");

        System.out.println("=== Ordering Veggie Pizza ===");
        Pizza pizza4 = store.orderPizza("veggie");
        System.out.println("\n\n END \n\n");

        System.out.println("\n=== Ordering Unknown Pizza ===");
        Pizza pizzaN = store.orderPizza("unknown");
    }
}
