package Latihan3PackageProduct;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Getter untuk nama produk
    public String getName() {
        return name;
    }

    // Getter untuk harga produk
    public int getPrice() {
        return price;
    }
}
