package Latihan3PackageProduct;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Pantene", 25000);
        Product product2 = new Product("Sensodyne", 20000);
        Product product3 = new Product("Coconut", 20000);
        Product product4 = new Product("Sopi kisar", 20000);

        System.out.println(product1.getName());
        System.out.println(product2.getName());

        ArrayList<Product> listProducts = new ArrayList<>();

        listProducts.add(product1);
        listProducts.add(product2);
        listProducts.add(product3);
        listProducts.add(product4);

        System.out.println("Product dalam ArrayList: ");
        for(Product list : listProducts){
            System.out.println(list.getName());
        }
        
        System.out.println("\nRemove Product3: ");
        listProducts.remove(product3);
        for(Product list : listProducts){
            System.out.println(list.getName());
        }
        
        System.out.println("\nGanti nama Product1: ");
        listProducts.set(0, product3);
        for(Product list : listProducts){
            System.out.println(list.getName());
        }
    }
}

