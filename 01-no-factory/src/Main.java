public class Main {
    public static void main(String[] args) {
        Product product = new Product("Default Product");
        Client client = new Client(product);
        client.showProduct();
    }
}