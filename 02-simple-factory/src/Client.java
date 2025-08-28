public class Client {
    private Product product;
    public Client(Product product) {
        this.product = product;
    }
    public void showProduct() {
        System.out.println("Client is using product: " + product.getName());
    }
}