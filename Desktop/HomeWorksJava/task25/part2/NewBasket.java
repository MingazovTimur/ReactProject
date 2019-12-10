package ru.mingazov.task25.part2;

import java.util.*;

public class NewBasket {
    public static void main(String[] args) {
        NewBasket nb = new NewBasket();
        nb.addProduct("Картошка", 1);
        nb.addProduct("Картошка", 1);
        nb.addProduct("Молоко", 2);
        nb.addProduct("Морковь", 4);
        System.out.println("first" + nb.products);

        nb.updateProductQuantity("Молоко", 12);
        nb.removeProduct("Картошка");
        nb.removeProduct("былвд");
        System.out.println("second" + nb.products);

        nb.getProductQuantity("Молоко");
        nb.getProductQuantity("asda");
        nb.getProductQuantity("Морковь");

        nb.clear();
        System.out.println("final" + nb.products);
    }


    Map<String, Integer> products = new HashMap<>();

    public void addProduct(String product, int quantity){
        if(!products.containsKey(product)){
            products.put(product, quantity);
        }else{
            products.replace(product, products.get(product) + quantity);
        }

    }

    public void removeProduct(String product){
        if(products.containsKey(product)) {
            products.replace(product, products.get(product) - 1);
        } else {
            System.out.println("Такого продукта нет в корзине");
        }
    }

    public void updateProductQuantity(String product, int quantity){
        if(products.containsKey(product)) {
            products.replace(product, quantity);
        } else {
            products.put(product, quantity);
        }
    }

    public void clear(){
        System.out.println("Корзина очищена");
        products.clear();
    }

    public Set getProducts(){
         return products.entrySet();
    }

    public int getProductQuantity(String product) {
        if(products.containsKey(product)) {
            System.out.println(product + " = " + products.get(product));
            return products.get(product);
        } else {
            System.out.println("Такого продукта нет в корзине");
            return 0;
        }

    }



}
