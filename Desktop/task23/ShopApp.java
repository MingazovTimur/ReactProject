package ru.mingazov.task23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShopApp implements Basket{
    public static void main(String[] args) {
        ShopApp shopApp = new ShopApp();

        shopApp.addProduct("Проволка", 2);
        shopApp.addProduct("Нитка", 4);
        shopApp.addProduct("Проволка", 3);

        System.out.println(shopApp.products);

        shopApp.updateProductQuantity("Проволка", 1);

        System.out.println(shopApp.products);

        shopApp.addProduct("Конфета", 1);
        shopApp.addProduct("Гантеля", 2);
        shopApp.removeProduct("Гантеля");

        System.out.println(shopApp.products);

        shopApp.updateProductQuantity("Гантеля", 9);

        System.out.println(shopApp.products);
        System.out.println(shopApp.getProductQuantity("Гантеля"));


    }

    private List<String> products = new ArrayList<>();

    @Override
    public void addProduct(String product, int quantity) {
        if(quantity != 0) {
            for (int i = 0; i < quantity; i++) {
                products.add(product);
            }
        }
    }

    @Override
    public void removeProduct(String product) {
        products.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        while(products.contains(product)){
            removeProduct(product);
        }
        if(quantity != 0) {
            for (int i = 0; i < quantity; i++) {
                products.add(product);
            }
        }
    }

    @Override
    public void clear() {
        products.clear();
    }

    @Override
    public List<String> getProducts() {

        return products;

    }

    @Override
    public int getProductQuantity(String product) {
        return Collections.frequency(products, product);
    }
}
