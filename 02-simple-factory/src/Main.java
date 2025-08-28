public class Main {
    public static void main(String[] args) {
        Product product = ProductFactory.createProduct("Simple Product");
        Client client = new Client(product);
        client.showProduct();
    }
}