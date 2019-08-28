package ru.mingazov.task23;

import java.util.ArrayList;
import java.util.List;

public interface Basket {

    List<String> products = new ArrayList<>();

    void addProduct(String product, int quantity);

    void removeProduct(String product);

    void updateProductQuantity(String product, int quantity);

    void clear();

    List<String> getProducts();

    int getProductQuantity(String product);
}
