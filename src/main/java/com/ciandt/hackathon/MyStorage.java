package com.ciandt.hackathon;

import com.ciandt.hackathon.entity.Product;
import com.ciandt.hackathon.entity.Purchase;
import com.ciandt.hackathon.entity.Table;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by rjfonseca on 12/04/14.
 */
public class MyStorage {
    public Map<Long, Product> productMap;
    public Map<Integer, Table> tableMap;
    public List<Purchase> purchases;

    static private  MyStorage instance;

    private MyStorage(){
        productMap = new HashMap<>();
        tableMap = new HashMap<>();
        purchases = new ArrayList<>();

        addTable(new Table(1, 10L, 2));
        addTable(new Table(2, 1000L, 5));
        addTable(new Table(3, 500L, 4));
        addTable(new Table(4, 300L, 3));
        addTable(new Table(5, 0L, 1));

        try {
            addProduct(new Product(1L,10.0, 10L, "Produto 1", Product.Category.OTHER, new URL("http://goo.gl/C6jQes"), new URL("http://goo.gl/C6jQes")));
            addProduct(new Product(2L,20.0, 20L, "Produto 2", Product.Category.OTHER, new URL("http://goo.gl/jht2Fo"), new URL("http://goo.gl/jht2Fo")));
            addProduct(new Product(3L,30.0, 30L, "Produto 3", Product.Category.OTHER, new URL("http://goo.gl/ljqpLh"), new URL("http://goo.gl/ljqpLh")));
            addProduct(new Product(4L,15.0, 14L, "Produto 4", Product.Category.OTHER, new URL("http://goo.gl/e75c6B"), new URL("http://goo.gl/e75c6B")));
            addProduct(new Product(5L,1.99, 1L, "Produto 5", Product.Category.OTHER, new URL("http://goo.gl/Yg3fJf"), new URL("http://goo.gl/Yg3fJf")));
        } catch (MalformedURLException e) {
            throw new RuntimeException("ops");
        }

        Purchase p1 = new Purchase(tableMap.get(1), productMap.get(1L));
        purchases.add(p1);

    }

    public void addProduct(Product product) {
        productMap.put(product.getId(), product);
    }

    public void addTable(Table table) {
        tableMap.put(table.getNumber(), table);
    }

    public void addPurchase(Purchase purchase) {
        purchases.add(purchase);
    }

    public static synchronized MyStorage getInstance(){
        if (instance == null) {
            instance = new MyStorage();
        }
        return instance;
    }
}
