package pizzashop;

public class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        // This part is our main problem – dependency on concrete classes
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        } else {
            pizza = new Pizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}