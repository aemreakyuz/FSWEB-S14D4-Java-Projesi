package com.workintech.abstraction.main;

import com.workintech.abstraction.bread.Bread;
import com.workintech.abstraction.bread.Chocolate;
import com.workintech.abstraction.bread.Coke;
import com.workintech.abstraction.bread.ProductForSale;

import java.util.Arrays;

public class Store {
    public static void main(String[] args) {

        //ProductForSale product = new ProductForSale();
        //[null, null, null, null, null]
        ProductForSale[] sales = new ProductForSale[5];

        //ProductForSale sale = new Chocolate()
        sales[0] = new Chocolate("Sweet", 20, "Yazılımcı Dostu", "brown", true);
        sales[1] = new Bread("Bakery", 40, "Siyez unundan", "einkorn", "brown");
        sales[2] = new Coke("Drinks", 15, "Soguk İçiniz", true);

        ProductForSale[] salesCopy = Arrays.copyOf(sales, 10);

        listProducts(sales);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            if (product != null) {
                product.showDetails();
            }
        }
    }
}
