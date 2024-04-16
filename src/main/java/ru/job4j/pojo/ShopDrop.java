package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = 0; i < products.length - 1; i++) {
            if (products[i] != null) {
                products[i] = products[i++];
                products[i] = null;
            }
        }
        return products;
    }
}
