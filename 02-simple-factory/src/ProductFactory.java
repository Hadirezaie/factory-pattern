public class ProductFactory {
    public static Product createProduct(String type) {
        return new Product(type);
    }
}